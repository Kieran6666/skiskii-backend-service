package com.skiskii.skiskiibackendservice.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 用户 Model
 */
@Table(name = "m_user")
public class User {
    /**
     * 用户ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 性别 1-男性，2-女性
     */
    private Integer sex;

    /**
     * 微信openid用户标识
     */
    @Column(name = "open_id")
    private String openId;

    /**
     * 佩戴的徽章id
     */
    @Column(name = "badge_id")
    private Long badgeId;

    /**
     * 使用状态 0-正常 1-封号
     */
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * ip信息
     */
    @Column(name = "ip_info")
    private String ipInfo;

    /**
     * 获取用户ID
     *
     * @return id - 用户ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置用户ID
     *
     * @param id 用户ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户昵称
     *
     * @return nickname - 用户昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置用户昵称
     *
     * @param nickname 用户昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取用户头像
     *
     * @return avatar - 用户头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置用户头像
     *
     * @param avatar 用户头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取性别 1-男性，2-女性
     *
     * @return sex - 性别 1-男性，2-女性
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别 1-男性，2-女性
     *
     * @param sex 性别 1-男性，2-女性
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取微信openid用户标识
     *
     * @return open_id - 微信openid用户标识
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置微信openid用户标识
     *
     * @param openId 微信openid用户标识
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 获取佩戴的徽章id
     *
     * @return badge_id - 佩戴的徽章id
     */
    public Long getBadgeId() {
        return badgeId;
    }

    /**
     * 设置佩戴的徽章id
     *
     * @param badgeId 佩戴的徽章id
     */
    public void setBadgeId(Long badgeId) {
        this.badgeId = badgeId;
    }

    /**
     * 获取使用状态 0-正常 1-封号
     *
     * @return status - 使用状态 0-正常 1-封号
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置使用状态 0-正常 1-封号
     *
     * @param status 使用状态 0-正常 1-封号
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取ip信息
     *
     * @return ip_info - ip信息
     */
    public String getIpInfo() {
        return ipInfo;
    }

    /**
     * 设置ip信息
     *
     * @param ipInfo ip信息
     */
    public void setIpInfo(String ipInfo) {
        this.ipInfo = ipInfo;
    }
}
