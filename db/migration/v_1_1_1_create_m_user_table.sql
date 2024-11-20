CREATE TABLE `m_user` (
                        `id` bigint(20) unsigned AUTO_INCREMENT NOT NULL COMMENT '用户ID',
                        `nickname` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户昵称',
                        `avatar` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户头像',
                        `sex` int(1) DEFAULT NULL COMMENT '性别 1-男性，2-女性',
                        `open_id` char(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '微信openid用户标识',
                        `ip_info` json DEFAULT NULL COMMENT 'ip信息',
                        `badge_id` bigint(20) DEFAULT NULL COMMENT '佩戴的徽章id',
                        `status` int(1) DEFAULT 0 COMMENT '使用状态 0-正常 1-封号',
                        `create_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
                        `update_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '修改时间',
                        PRIMARY KEY (`id`) USING BTREE,
                        UNIQUE KEY `uniq_open_id` (`open_id`) USING BTREE,
                        UNIQUE KEY `uniq_nickname` (`nickname`) USING BTREE,
                        KEY `idx_create_time` (`create_time`) USING BTREE,
                        KEY `idx_update_time` (`update_time`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC COMMENT='用户表';
