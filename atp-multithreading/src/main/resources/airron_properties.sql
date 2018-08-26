/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50173
Source Host           : 127.0.0.1:3306
Source Database       : airron_properties

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2018-08-27 01:19:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for file_config
-- ----------------------------
DROP TABLE IF EXISTS `file_config`;
CREATE TABLE `file_config` (
  `pf_id` int(11) NOT NULL AUTO_INCREMENT,
  `pf_type` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pf_path` text COLLATE utf8_unicode_ci,
  PRIMARY KEY (`pf_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of file_config
-- ----------------------------

-- ----------------------------
-- Table structure for tb_dict_exchange
-- ----------------------------
DROP TABLE IF EXISTS `tb_dict_exchange`;
CREATE TABLE `tb_dict_exchange` (
  `no` int(11) NOT NULL AUTO_INCREMENT,
  `sys_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `other_nanme` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tb_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tb_dict_exchange
-- ----------------------------
