CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nick_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '真实姓名',
  `telephone` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '电话号码',
  `register_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录入库时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;