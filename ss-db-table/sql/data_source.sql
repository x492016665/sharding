/*
 Navicat Premium Data Transfer

 Source Server         : localhostt3306
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : data_source

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 24/04/2020 13:42:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for area
-- ----------------------------
DROP TABLE IF EXISTS `area`;
CREATE TABLE `area`  (
  `id` bigint(20) UNSIGNED NOT NULL COMMENT 'id',
  `area_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '地区编号',
  `area_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '地区名称',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '地区表（单库单表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of area
-- ----------------------------
INSERT INTO `area` VALUES (1252894829990465537, '110000', '北京市', '2020-04-22 17:39:40', '2020-04-22 17:39:40');
INSERT INTO `area` VALUES (1252894833933111297, '110101', '东城区', '2020-04-22 17:39:42', '2020-04-22 17:39:42');
INSERT INTO `area` VALUES (1252894833941499906, '110102', '西城区', '2020-04-22 17:39:42', '2020-04-22 17:39:42');
INSERT INTO `area` VALUES (1252894833945694209, '110106', '丰台区', '2020-04-22 17:39:42', '2020-04-22 17:39:42');
INSERT INTO `area` VALUES (1253127290766794753, '110000', '北京市', '2020-04-23 09:03:23', '2020-04-23 09:03:23');
INSERT INTO `area` VALUES (1253127292574539778, '110101', '东城区', '2020-04-23 09:03:23', '2020-04-23 09:03:23');
INSERT INTO `area` VALUES (1253127292599705602, '110102', '西城区', '2020-04-23 09:03:23', '2020-04-23 09:03:23');
INSERT INTO `area` VALUES (1253127292599705603, '110106', '丰台区', '2020-04-23 09:03:23', '2020-04-23 09:03:23');
INSERT INTO `area` VALUES (1253127990993235970, '110000', '北京市', '2020-04-23 09:06:10', '2020-04-23 09:06:10');
INSERT INTO `area` VALUES (1253127992847118337, '110101', '东城区', '2020-04-23 09:06:10', '2020-04-23 09:06:10');
INSERT INTO `area` VALUES (1253127992855506945, '110102', '西城区', '2020-04-23 09:06:10', '2020-04-23 09:06:10');
INSERT INTO `area` VALUES (1253127992859701250, '110106', '丰台区', '2020-04-23 09:06:10', '2020-04-23 09:06:10');
INSERT INTO `area` VALUES (1253128695036538881, '110000', '北京市', '2020-04-23 09:08:58', '2020-04-23 09:08:58');
INSERT INTO `area` VALUES (1253128696999473154, '110101', '东城区', '2020-04-23 09:08:58', '2020-04-23 09:08:58');
INSERT INTO `area` VALUES (1253128697007861762, '110102', '西城区', '2020-04-23 09:08:58', '2020-04-23 09:08:58');
INSERT INTO `area` VALUES (1253128697012056066, '110106', '丰台区', '2020-04-23 09:08:58', '2020-04-23 09:08:58');
INSERT INTO `area` VALUES (1253128998561542146, '110000', '北京市', '2020-04-23 09:10:09', '2020-04-23 09:10:09');
INSERT INTO `area` VALUES (1253128998662205442, '110101', '东城区', '2020-04-23 09:10:09', '2020-04-23 09:10:09');
INSERT INTO `area` VALUES (1253128998662205443, '110102', '西城区', '2020-04-23 09:10:09', '2020-04-23 09:10:09');
INSERT INTO `area` VALUES (1253128998662205444, '110106', '丰台区', '2020-04-23 09:10:09', '2020-04-23 09:10:09');
INSERT INTO `area` VALUES (1253130139168960514, '110000', '北京市', '2020-04-23 09:14:41', '2020-04-23 09:14:41');
INSERT INTO `area` VALUES (1253130139194126337, '110101', '东城区', '2020-04-23 09:14:41', '2020-04-23 09:14:41');
INSERT INTO `area` VALUES (1253130139202514946, '110102', '西城区', '2020-04-23 09:14:41', '2020-04-23 09:14:41');

-- ----------------------------
-- Table structure for config
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config`  (
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`code`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '配置表（单库单表,UUID主键）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of config
-- ----------------------------
INSERT INTO `config` VALUES ('0ed3bc37cfc24420b548cf3164204fa5', '停止', '2020-04-23 09:45:14', '2020-04-23 09:45:14');
INSERT INTO `config` VALUES ('1857e8c0462b4a7e9b9721211cc2d19d', '结束', '2020-04-23 09:45:14', '2020-04-23 09:45:14');
INSERT INTO `config` VALUES ('3b8367aa39f84b8d86b011abeefda9eb', '结束', '2020-04-23 09:44:51', '2020-04-23 09:44:51');
INSERT INTO `config` VALUES ('7d994341ee0d4d018e43659f9928fde4', '开始', '2020-04-23 09:45:14', '2020-04-23 09:45:14');
INSERT INTO `config` VALUES ('7f3ccd9c5b814b28939c0ec16ba974f1', '开始', '2020-04-23 09:46:17', '2020-04-23 09:46:17');
INSERT INTO `config` VALUES ('91b5bfac57544255aeaf7c6750029e5f', '停止', '2020-04-23 09:44:51', '2020-04-23 09:44:51');
INSERT INTO `config` VALUES ('9c6bceaa38354f1c9f84bae59886bb05', '静止', '2020-04-23 09:45:14', '2020-04-23 09:45:14');
INSERT INTO `config` VALUES ('9f23028c792048eb86f0e07cc3f5f2d2', '静止', '2020-04-23 09:44:51', '2020-04-23 09:44:51');
INSERT INTO `config` VALUES ('a0190eee639140a88886794dc3c286e3', '关闭', '2020-04-23 09:44:51', '2020-04-23 09:44:51');
INSERT INTO `config` VALUES ('a7fe2d935ea64ce4b90281225d1073e2', '开始', '2020-04-23 09:44:51', '2020-04-23 09:44:51');
INSERT INTO `config` VALUES ('a898eb0c7af8430b99a85d4c0274fef7', '停止', '2020-04-23 09:46:17', '2020-04-23 09:46:17');
INSERT INTO `config` VALUES ('c1c109aad93e43bea209c4815c093ffb', '静止', '2020-04-23 09:46:17', '2020-04-23 09:46:17');
INSERT INTO `config` VALUES ('c453070235f344c5b153e138cd7d25b4', '关闭', '2020-04-23 09:46:17', '2020-04-23 09:46:17');
INSERT INTO `config` VALUES ('fa45566df09142fd963c88badb810bae', '结束', '2020-04-23 09:46:17', '2020-04-23 09:46:17');
INSERT INTO `config` VALUES ('fc8e4099cc3c4c29981d22c5b0f9ac4e', '天津市', '2020-04-23 09:45:14', '2020-04-23 09:45:14');

-- ----------------------------
-- Table structure for factory
-- ----------------------------
DROP TABLE IF EXISTS `factory`;
CREATE TABLE `factory`  (
  `factory_id` bigint(20) UNSIGNED NOT NULL COMMENT '工厂id',
  `factory_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '工厂名称',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`factory_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '工厂表（广播表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of factory
-- ----------------------------
INSERT INTO `factory` VALUES (1253145436781338625, '富土康', '2020-04-23 10:15:29', '2020-04-23 10:15:29');
INSERT INTO `factory` VALUES (1253145439478276097, '血汗工厂', '2020-04-23 10:15:30', '2020-04-23 10:15:30');
INSERT INTO `factory` VALUES (1253145439495053313, '深圳厂', '2020-04-23 10:15:30', '2020-04-23 10:15:30');
INSERT INTO `factory` VALUES (1253145439503441921, '南宁厂', '2020-04-23 10:15:30', '2020-04-23 10:15:30');
INSERT INTO `factory` VALUES (1253146102031507457, '富土康', '2020-04-23 10:18:07', '2020-04-23 10:18:07');
INSERT INTO `factory` VALUES (1253146102115393538, '血汗工厂', '2020-04-23 10:18:07', '2020-04-23 10:18:07');
INSERT INTO `factory` VALUES (1253146102123782146, '深圳厂', '2020-04-23 10:18:07', '2020-04-23 10:18:07');
INSERT INTO `factory` VALUES (1253146102136365057, '南宁厂', '2020-04-23 10:18:07', '2020-04-23 10:18:07');

-- ----------------------------
-- Table structure for warehouse
-- ----------------------------
DROP TABLE IF EXISTS `warehouse`;
CREATE TABLE `warehouse`  (
  `warehouse_id` bigint(20) UNSIGNED NOT NULL COMMENT '仓库id',
  `warehouse_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '仓库名称',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`warehouse_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '仓库表（广播表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of warehouse
-- ----------------------------
INSERT INTO `warehouse` VALUES (1253150081998163970, '湖南仓', '2020-04-23 10:33:57', '2020-04-23 10:33:57');
INSERT INTO `warehouse` VALUES (1253150084200173570, '北京仓', '2020-04-23 10:33:57', '2020-04-23 10:33:57');
INSERT INTO `warehouse` VALUES (1253150084208562177, '深圳仓', '2020-04-23 10:33:57', '2020-04-23 10:33:57');
INSERT INTO `warehouse` VALUES (1253150084216950785, '广西仓', '2020-04-23 10:33:57', '2020-04-23 10:33:57');

SET FOREIGN_KEY_CHECKS = 1;
