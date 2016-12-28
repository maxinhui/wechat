/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50611
Source Host           : localhost:3306
Source Database       : wechat

Target Server Type    : MYSQL
Target Server Version : 50611
File Encoding         : 65001

Date: 2016-12-28 15:59:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `permission_id` int(11) NOT NULL,
  `permission_name` varchar(255) NOT NULL,
  `permission_sys` varchar(255) NOT NULL,
  `permission_level` int(5) DEFAULT NULL COMMENT '权限等级',
  `parentid` int(11) DEFAULT NULL,
  PRIMARY KEY (`permission_id`),
  KEY `FKj8im8q5ryubaobx0ndx5ryktr` (`parentid`),
  CONSTRAINT `FKj8im8q5ryubaobx0ndx5ryktr` FOREIGN KEY (`parentid`) REFERENCES `permission` (`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL,
  `role_name` varchar(255) NOT NULL,
  `role_sys` varchar(255) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for rolepermission
-- ----------------------------
DROP TABLE IF EXISTS `rolepermission`;
CREATE TABLE `rolepermission` (
  `role_id` int(11) NOT NULL,
  `permission_id` int(11) NOT NULL,
  KEY `FKkurk04cjrududtol48btuetdn` (`permission_id`),
  KEY `FK42xkoy26myhxhwiep4panhs1r` (`role_id`),
  CONSTRAINT `FK42xkoy26myhxhwiep4panhs1r` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`),
  CONSTRAINT `FKkurk04cjrududtol48btuetdn` FOREIGN KEY (`permission_id`) REFERENCES `permission` (`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_Id` bigint(20) NOT NULL,
  `create_By_Date` datetime NOT NULL,
  `create_By_Id` bigint(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `Icons` varchar(255) NOT NULL,
  `nickname` varchar(255) NOT NULL,
  `on_Line_Status` int(11) NOT NULL,
  `password` varchar(255) NOT NULL,
  `update_by_date` datetime NOT NULL,
  `update_by_id` bigint(20) NOT NULL,
  `user_type` int(11) NOT NULL,
  PRIMARY KEY (`user_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
