package com.skiskii.skiskiibackendservice.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Redis配置类
 */
@Configuration
public class RedisTemplateConfig {

    /**
     *  redisTemplate是spring框架提供的redis客户端
     *  .gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-autoconfigure/2.7.6/4ad7e89accd25c69bfe84f52202deaf09430be2/spring-boot-autoconfigure-2.7.6.jar!/org/springframework/boot/autoconfigure/data/redis/RedisAutoConfiguration.class
     *  上一条是spring默认的redisTemplate，其中序列化的方式是 JDKSerializable
     *  这种序列化方式会导致存入redis时，使字符串变成编码的形式，可读性很差，因此需要自定义序列化方式
     *  推荐使用 JSON的序列化/反序列化方式，因此需要重写RedisTemplate
     * @param redisConnectionFactory factory
     * @return redisTemplate
     */
    @Bean(name = "myRedisTemplate")
    @ConditionalOnMissingBean
    // @ConditionalOnSingleCandidate 判断指定类在 BeanFactory 中是否只有一个实例
    // 由于Spring提供的RedisTemplate已经拥有BeanFactory的实例，因此开启此注解会导致本方法不生效
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        // 为了自己开发方便，直接使用<String, Object>
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);

        // Json序列化
        Jackson2JsonRedisSerializer<Object> objectJackson2JsonRedisSerializer
                = new Jackson2JsonRedisSerializer<>(Object.class);
        ObjectMapper om = new ObjectMapper();
        // 指定要序列化的域，field,get和set,以及修饰符范围，ANY是都有包括private和public
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        // 指定序列化输入的类型，类必须是非final修饰的，final修饰的类，比如String,Integer等会跑出异常
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        objectJackson2JsonRedisSerializer.setObjectMapper(om);

        // String序列化
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();

        // key采用String序列化
        redisTemplate.setKeySerializer(stringRedisSerializer);

        // hashKey采用String序列化
        redisTemplate.setHashKeySerializer(stringRedisSerializer);

        // value采用Json序列化
        redisTemplate.setValueSerializer(objectJackson2JsonRedisSerializer);

        // hash的value采用Json序列化
        redisTemplate.setHashValueSerializer(objectJackson2JsonRedisSerializer);

        redisTemplate.afterPropertiesSet();

        return redisTemplate;
    }
}
