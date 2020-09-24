/*
Navicat MySQL Data Transfer

Source Server         : 192.168.31.203
Source Server Version : 50506
Source Host           : 192.168.31.203:3306
Source Database       : shijuan

Target Server Type    : MYSQL
Target Server Version : 50506
File Encoding         : 65001

Date: 2020-07-07 09:46:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admininfo`
-- ----------------------------
DROP TABLE IF EXISTS `admininfo`;
CREATE TABLE `admininfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员ID',
  `adminname` varchar(255) DEFAULT NULL COMMENT '管理员用户名',
  `adminpassword` varchar(255) DEFAULT NULL COMMENT '管理员密码',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='管理员';

-- ----------------------------
-- Records of admininfo
-- ----------------------------

-- ----------------------------
-- Table structure for `questionbank`
-- ----------------------------
DROP TABLE IF EXISTS `questionbank`;
CREATE TABLE `questionbank` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '题库ID',
  `title` varchar(255) DEFAULT NULL COMMENT '题干',
  `sorttype` varchar(255) DEFAULT NULL COMMENT '类型',
  `imgnums` varchar(255) DEFAULT NULL COMMENT '图片数量',
  `img1` varchar(255) DEFAULT NULL COMMENT '图片1',
  `img2` varchar(255) DEFAULT NULL COMMENT '图片2',
  `img3` varchar(255) DEFAULT NULL COMMENT '图片3',
  `img4` varchar(255) DEFAULT NULL COMMENT '图片4',
  `selecta` varchar(255) DEFAULT NULL COMMENT '选项A',
  `selectb` varchar(255) DEFAULT NULL COMMENT '选项B',
  `selectc` varchar(255) DEFAULT NULL COMMENT '选项C',
  `selectd` varchar(255) DEFAULT NULL COMMENT '选项D',
  `selectinfo` varchar(255) DEFAULT NULL COMMENT '正确答案',
  `scorenum` int(11) DEFAULT NULL COMMENT '题目分数',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='题库信息';

-- ----------------------------
-- Records of questionbank
-- ----------------------------

-- ----------------------------
-- Table structure for `studentinfo`
-- ----------------------------
DROP TABLE IF EXISTS `studentinfo`;
CREATE TABLE `studentinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '考生ID',
  `stuname` varchar(255) DEFAULT NULL COMMENT '考生姓名',
  `stusex` varchar(255) DEFAULT NULL COMMENT '考生性别',
  `stuidcard` varchar(255) DEFAULT NULL COMMENT '身份证号',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='考生信息';

-- ----------------------------
-- Records of studentinfo
-- ----------------------------
INSERT INTO `studentinfo` VALUES ('1', '王二小', '男', '123456789987654321', '2020-07-07 09:30:18');
INSERT INTO `studentinfo` VALUES ('2', '熊王', '女', '46545456', '2020-07-07 09:36:01');
INSERT INTO `studentinfo` VALUES ('3', '熊22', '女', '46545456', '2020-07-07 09:36:08');

-- ----------------------------
-- Table structure for `userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '面试官ID',
  `username` varchar(255) DEFAULT NULL COMMENT '面试官用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '面试官密码',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='面试官';

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', '面试官1', '123456', '2020-07-07 09:20:56');
INSERT INTO `userinfo` VALUES ('2', 'test', '123456', '2020-07-07 09:20:56');
INSERT INTO `userinfo` VALUES ('3', '张三', '123456', '2020-07-07 09:20:56');
