# 创建第一个数据源
DROP DATABASE IF EXISTS `ds_01`;
CREATE DATABASE `ds_01`;

# 创建用户表并初始化数据
DROP TABLE IF EXISTS `ds_01`.`user`;
CREATE TABLE `ds_01`.`user` (
  `id` BIGINT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '用户ID',
  `user_name` VARCHAR(16) NOT NULL COMMENT '用户名'
);
INSERT INTO `ds_01`.`user` (`user_name`) VALUES
('Dannis'),
('小飞飞');

# 创建第二个数据源
DROP DATABASE IF EXISTS `ds_02`;
CREATE DATABASE `ds_02`;

# 创建订单表并初始化数据
DROP TABLE IF EXISTS `ds_02`.`order`;
CREATE TABLE `ds_02`.`order` (
  `id` BIGINT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '订单ID',
  `user_id` BIGINT(11) NOT NULL COMMENT '用户ID',
  `address` VARCHAR(32) NOT NULL COMMENT '收货地址'
);
INSERT INTO `ds_02`.`order` (`user_id`,`address`) VALUES
(1,'北京市朝阳区'),
(2,'广州市海珠区');