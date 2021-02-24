/*
 Navicat Premium Data Transfer

 Source Server         : localhostt3306
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : data_source2

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 24/04/2020 13:42:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for code_relate0
-- ----------------------------
DROP TABLE IF EXISTS `code_relate0`;
CREATE TABLE `code_relate0`  (
  `relate_id` bigint(20) UNSIGNED NOT NULL COMMENT '关联id',
  `stack_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '垛码,跟task_upload的stack_code关联',
  `box_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '箱码',
  `bottle_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '瓶码',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `task_id` bigint(20) UNSIGNED NOT NULL COMMENT '任务id,跟task的主键关联',
  PRIMARY KEY (`relate_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '瓶箱垛关联表（绑定表子表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of code_relate0
-- ----------------------------
INSERT INTO `code_relate0` VALUES (1253241175725428737, '0ee563e8-28e4-49ba-b2c9-7134c271b20f', 'box0', 'bottle0', '2020-04-23 16:35:55', '2020-04-23 16:35:55', 1253227687716069377);
INSERT INTO `code_relate0` VALUES (1253241175746400258, '0ee563e8-28e4-49ba-b2c9-7134c271b20f', 'box1', 'bottle1', '2020-04-23 16:35:55', '2020-04-23 16:35:55', 1253227687716069377);
INSERT INTO `code_relate0` VALUES (1253241175767371777, '0ee563e8-28e4-49ba-b2c9-7134c271b20f', 'box2', 'bottle2', '2020-04-23 16:35:55', '2020-04-23 16:35:55', 1253227687716069377);
INSERT INTO `code_relate0` VALUES (1253241175767371778, '0ee563e8-28e4-49ba-b2c9-7134c271b20f', 'box3', 'bottle3', '2020-04-23 16:35:55', '2020-04-23 16:35:55', 1253227687716069377);
INSERT INTO `code_relate0` VALUES (1253241175788343297, '0ee563e8-28e4-49ba-b2c9-7134c271b20f', 'box4', 'bottle4', '2020-04-23 16:35:55', '2020-04-23 16:35:55', 1253227687716069377);
INSERT INTO `code_relate0` VALUES (1253241175788343298, '0ee563e8-28e4-49ba-b2c9-7134c271b20f', 'box5', 'bottle5', '2020-04-23 16:35:55', '2020-04-23 16:35:55', 1253227687716069377);
INSERT INTO `code_relate0` VALUES (1253241175805120513, '0ee563e8-28e4-49ba-b2c9-7134c271b20f', 'box6', 'bottle6', '2020-04-23 16:35:55', '2020-04-23 16:35:55', 1253227687716069377);
INSERT INTO `code_relate0` VALUES (1253241175813509121, '0ee563e8-28e4-49ba-b2c9-7134c271b20f', 'box7', 'bottle7', '2020-04-23 16:35:55', '2020-04-23 16:35:55', 1253227687716069377);
INSERT INTO `code_relate0` VALUES (1253241175817703426, '0ee563e8-28e4-49ba-b2c9-7134c271b20f', 'box8', 'bottle8', '2020-04-23 16:35:55', '2020-04-23 16:35:55', 1253227687716069377);
INSERT INTO `code_relate0` VALUES (1253241175817703427, '0ee563e8-28e4-49ba-b2c9-7134c271b20f', 'box9', 'bottle9', '2020-04-23 16:35:55', '2020-04-23 16:35:55', 1253227687716069377);
INSERT INTO `code_relate0` VALUES (1253241175838674945, '0ee563e8-28e4-49ba-b2c9-7134c271b20f', 'box10', 'bottle10', '2020-04-23 16:35:55', '2020-04-23 16:35:55', 1253227687716069377);
INSERT INTO `code_relate0` VALUES (1253241175838674946, '0ee563e8-28e4-49ba-b2c9-7134c271b20f', 'box11', 'bottle11', '2020-04-23 16:35:55', '2020-04-23 16:35:55', 1253227687716069377);
INSERT INTO `code_relate0` VALUES (1253241175851257857, '0ee563e8-28e4-49ba-b2c9-7134c271b20f', 'box12', 'bottle12', '2020-04-23 16:35:55', '2020-04-23 16:35:55', 1253227687716069377);
INSERT INTO `code_relate0` VALUES (1253241175851257858, '0ee563e8-28e4-49ba-b2c9-7134c271b20f', 'box13', 'bottle13', '2020-04-23 16:35:55', '2020-04-23 16:35:55', 1253227687716069377);
INSERT INTO `code_relate0` VALUES (1253241175859646466, '0ee563e8-28e4-49ba-b2c9-7134c271b20f', 'box14', 'bottle14', '2020-04-23 16:35:55', '2020-04-23 16:35:55', 1253227687716069377);

-- ----------------------------
-- Table structure for code_relate1
-- ----------------------------
DROP TABLE IF EXISTS `code_relate1`;
CREATE TABLE `code_relate1`  (
  `relate_id` bigint(20) UNSIGNED NOT NULL COMMENT '关联id',
  `stack_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '垛码,跟task_upload的stack_code关联',
  `box_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '箱码',
  `bottle_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '瓶码',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `task_id` bigint(20) UNSIGNED NOT NULL COMMENT '任务id,跟task的主键关联',
  PRIMARY KEY (`relate_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '瓶箱垛关联表（绑定表子表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of code_relate1
-- ----------------------------
INSERT INTO `code_relate1` VALUES (1253234707794071554, 'ae9bdd58-231e-4d9f-8a9e-0714b31c10e3', 'box0', 'bottle0', '2020-04-23 16:10:13', '2020-04-23 16:10:13', 0);
INSERT INTO `code_relate1` VALUES (1253234707831820290, 'ae9bdd58-231e-4d9f-8a9e-0714b31c10e3', 'box1', 'bottle1', '2020-04-23 16:10:13', '2020-04-23 16:10:13', 0);
INSERT INTO `code_relate1` VALUES (1253234707831820291, 'ae9bdd58-231e-4d9f-8a9e-0714b31c10e3', 'box2', 'bottle2', '2020-04-23 16:10:13', '2020-04-23 16:10:13', 0);
INSERT INTO `code_relate1` VALUES (1253234707831820292, 'ae9bdd58-231e-4d9f-8a9e-0714b31c10e3', 'box3', 'bottle3', '2020-04-23 16:10:13', '2020-04-23 16:10:13', 0);
INSERT INTO `code_relate1` VALUES (1253234707869569026, 'ae9bdd58-231e-4d9f-8a9e-0714b31c10e3', 'box4', 'bottle4', '2020-04-23 16:10:13', '2020-04-23 16:10:13', 0);
INSERT INTO `code_relate1` VALUES (1253234707886346242, 'ae9bdd58-231e-4d9f-8a9e-0714b31c10e3', 'box5', 'bottle5', '2020-04-23 16:10:13', '2020-04-23 16:10:13', 0);
INSERT INTO `code_relate1` VALUES (1253234707894734849, 'ae9bdd58-231e-4d9f-8a9e-0714b31c10e3', 'box6', 'bottle6', '2020-04-23 16:10:13', '2020-04-23 16:10:13', 0);
INSERT INTO `code_relate1` VALUES (1253234707903123457, 'ae9bdd58-231e-4d9f-8a9e-0714b31c10e3', 'box7', 'bottle7', '2020-04-23 16:10:13', '2020-04-23 16:10:13', 0);
INSERT INTO `code_relate1` VALUES (1253234707911512066, 'ae9bdd58-231e-4d9f-8a9e-0714b31c10e3', 'box8', 'bottle8', '2020-04-23 16:10:13', '2020-04-23 16:10:13', 0);
INSERT INTO `code_relate1` VALUES (1253234707919900673, 'ae9bdd58-231e-4d9f-8a9e-0714b31c10e3', 'box9', 'bottle9', '2020-04-23 16:10:13', '2020-04-23 16:10:13', 0);
INSERT INTO `code_relate1` VALUES (1253234707924094978, 'ae9bdd58-231e-4d9f-8a9e-0714b31c10e3', 'box10', 'bottle10', '2020-04-23 16:10:13', '2020-04-23 16:10:13', 0);
INSERT INTO `code_relate1` VALUES (1253234707932483585, 'ae9bdd58-231e-4d9f-8a9e-0714b31c10e3', 'box11', 'bottle11', '2020-04-23 16:10:13', '2020-04-23 16:10:13', 0);
INSERT INTO `code_relate1` VALUES (1253234707936677890, 'ae9bdd58-231e-4d9f-8a9e-0714b31c10e3', 'box12', 'bottle12', '2020-04-23 16:10:13', '2020-04-23 16:10:13', 0);
INSERT INTO `code_relate1` VALUES (1253234707945066498, 'ae9bdd58-231e-4d9f-8a9e-0714b31c10e3', 'box13', 'bottle13', '2020-04-23 16:10:13', '2020-04-23 16:10:13', 0);
INSERT INTO `code_relate1` VALUES (1253234707953455106, 'ae9bdd58-231e-4d9f-8a9e-0714b31c10e3', 'box14', 'bottle14', '2020-04-23 16:10:13', '2020-04-23 16:10:13', 0);

-- ----------------------------
-- Table structure for customer0
-- ----------------------------
DROP TABLE IF EXISTS `customer0`;
CREATE TABLE `customer0`  (
  `customer_id` bigint(20) UNSIGNED NOT NULL COMMENT '用户id',
  `customer_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户姓名',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`customer_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表（水平拆分表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer0
-- ----------------------------
INSERT INTO `customer0` VALUES (1253152256845455362, '千手柱间', '2020-04-23 10:42:35', '2020-04-23 10:42:35');
INSERT INTO `customer0` VALUES (1253154909411348482, '天天', '2020-04-23 10:53:07', '2020-04-23 10:53:07');

-- ----------------------------
-- Table structure for customer1
-- ----------------------------
DROP TABLE IF EXISTS `customer1`;
CREATE TABLE `customer1`  (
  `customer_id` bigint(20) UNSIGNED NOT NULL COMMENT '用户id',
  `customer_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户姓名',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`customer_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表（水平拆分表）' ROW_FORMAT = Dynamic;

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
INSERT INTO `factory` VALUES (1253145436781338625, '富土康', '2020-04-23 10:15:30', '2020-04-23 10:15:30');
INSERT INTO `factory` VALUES (1253145439478276097, '血汗工厂', '2020-04-23 10:15:30', '2020-04-23 10:15:30');
INSERT INTO `factory` VALUES (1253145439495053313, '深圳厂', '2020-04-23 10:15:30', '2020-04-23 10:15:30');
INSERT INTO `factory` VALUES (1253145439503441921, '南宁厂', '2020-04-23 10:15:30', '2020-04-23 10:15:30');
INSERT INTO `factory` VALUES (1253146102031507457, '富土康', '2020-04-23 10:18:07', '2020-04-23 10:18:07');
INSERT INTO `factory` VALUES (1253146102115393538, '血汗工厂', '2020-04-23 10:18:07', '2020-04-23 10:18:07');
INSERT INTO `factory` VALUES (1253146102123782146, '深圳厂', '2020-04-23 10:18:07', '2020-04-23 10:18:07');
INSERT INTO `factory` VALUES (1253146102136365057, '南宁厂', '2020-04-23 10:18:07', '2020-04-23 10:18:07');

-- ----------------------------
-- Table structure for indent0
-- ----------------------------
DROP TABLE IF EXISTS `indent0`;
CREATE TABLE `indent0`  (
  `indent_id` bigint(20) UNSIGNED NOT NULL COMMENT '订单id',
  `customer_id` bigint(20) UNSIGNED NOT NULL COMMENT '用户id,跟customer的主键关联',
  `warehouse_id` bigint(20) UNSIGNED NOT NULL COMMENT '仓库id,跟warehouse主键关联',
  `indent_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单名称',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`indent_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单表（绑定表父表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for indent1
-- ----------------------------
DROP TABLE IF EXISTS `indent1`;
CREATE TABLE `indent1`  (
  `indent_id` bigint(20) UNSIGNED NOT NULL COMMENT '订单id',
  `customer_id` bigint(20) UNSIGNED NOT NULL COMMENT '用户id,跟customer的主键关联',
  `warehouse_id` bigint(20) UNSIGNED NOT NULL COMMENT '仓库id,跟warehouse主键关联',
  `indent_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单名称',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`indent_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单表（绑定表父表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for indent_detail0
-- ----------------------------
DROP TABLE IF EXISTS `indent_detail0`;
CREATE TABLE `indent_detail0`  (
  `detail_id` bigint(20) UNSIGNED NOT NULL COMMENT '详情id',
  `indent_id` bigint(20) UNSIGNED NOT NULL COMMENT '订单id',
  `customer_id` bigint(20) UNSIGNED NOT NULL COMMENT '用户id,跟customer的主键关联',
  `product_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
  `num` int(10) UNSIGNED NULL DEFAULT 0 COMMENT '数量',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`detail_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单详情表（绑定表子表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for indent_detail1
-- ----------------------------
DROP TABLE IF EXISTS `indent_detail1`;
CREATE TABLE `indent_detail1`  (
  `detail_id` bigint(20) UNSIGNED NOT NULL COMMENT '详情id',
  `indent_id` bigint(20) UNSIGNED NOT NULL COMMENT '订单id',
  `customer_id` bigint(20) UNSIGNED NOT NULL COMMENT '用户id,跟customer的主键关联',
  `product_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
  `num` int(10) UNSIGNED NULL DEFAULT 0 COMMENT '数量',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`detail_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单详情表（绑定表子表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for task0
-- ----------------------------
DROP TABLE IF EXISTS `task0`;
CREATE TABLE `task0`  (
  `task_id` bigint(20) UNSIGNED NOT NULL COMMENT '任务id',
  `task_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '任务名称',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`task_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '任务表（水平拆分表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of task0
-- ----------------------------
INSERT INTO `task0` VALUES (1253227687737040898, '任务4', '2020-04-23 15:42:19', '2020-04-23 15:42:19');

-- ----------------------------
-- Table structure for task1
-- ----------------------------
DROP TABLE IF EXISTS `task1`;
CREATE TABLE `task1`  (
  `task_id` bigint(20) UNSIGNED NOT NULL COMMENT '任务id',
  `task_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '任务名称',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`task_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '任务表（水平拆分表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of task1
-- ----------------------------
INSERT INTO `task1` VALUES (1253227687716069377, '任务2', '2020-04-23 15:42:19', '2020-04-23 15:42:19');

-- ----------------------------
-- Table structure for task_upload0
-- ----------------------------
DROP TABLE IF EXISTS `task_upload0`;
CREATE TABLE `task_upload0`  (
  `upload_id` bigint(20) UNSIGNED NOT NULL COMMENT '上传id',
  `factory_id` bigint(20) UNSIGNED NOT NULL COMMENT '工厂id,跟factory的主键关联',
  `stack_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '跺码(UUID)',
  `task_id` bigint(20) UNSIGNED NOT NULL COMMENT '任务id,跟task的主键关联',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`upload_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '任务上传表（绑定表子表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of task_upload0
-- ----------------------------
INSERT INTO `task_upload0` VALUES (1253241173221429250, 1253146102136365057, '0ee563e8-28e4-49ba-b2c9-7134c271b20f', 1253227687716069377, '2020-04-23 16:35:55', '2020-04-23 16:35:55');

-- ----------------------------
-- Table structure for task_upload1
-- ----------------------------
DROP TABLE IF EXISTS `task_upload1`;
CREATE TABLE `task_upload1`  (
  `upload_id` bigint(20) UNSIGNED NOT NULL COMMENT '上传id',
  `factory_id` bigint(20) UNSIGNED NOT NULL COMMENT '工厂id,跟factory的主键关联',
  `stack_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '跺码(UUID)',
  `task_id` bigint(20) UNSIGNED NOT NULL COMMENT '任务id,跟task的主键关联',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`upload_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '任务上传表（绑定表子表）' ROW_FORMAT = Dynamic;

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
