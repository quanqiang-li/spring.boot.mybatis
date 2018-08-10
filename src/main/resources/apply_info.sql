/*
Navicat MySQL Data Transfer

Source Server         : 172.16.16.36
Source Server Version : 50627
Source Host           : 172.16.16.36:3306
Source Database       : ixinnuo_financial_v2

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2018-08-10 09:01:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for apply_info
-- ----------------------------
DROP TABLE IF EXISTS `apply_info`;
CREATE TABLE `apply_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_update` datetime DEFAULT NULL,
  `apply_no` char(20) DEFAULT NULL COMMENT '贷款申请流水号',
  `user_uuk` varchar(40) DEFAULT NULL COMMENT '贷款申请用户唯一标志',
  `nsrsbh` varchar(30) DEFAULT NULL COMMENT '纳税人识别号',
  `etr_name` varchar(20) DEFAULT NULL COMMENT ' 企业名称',
  `product_id` int(11) DEFAULT NULL COMMENT '产品ID',
  `product_name` varchar(50) DEFAULT NULL COMMENT '产品名称',
  `loan_term` int(11) DEFAULT NULL COMMENT '贷款申请期限(3/6)',
  `loan_amount` double DEFAULT NULL COMMENT '贷款额度（万）',
  `contact_mobile` varchar(20) DEFAULT NULL COMMENT '联系方式',
  `contact_person` varchar(20) DEFAULT NULL COMMENT '联系人',
  `data_source` varchar(200) DEFAULT NULL COMMENT '客户来源渠道',
  `mcode` varchar(20) DEFAULT NULL COMMENT '营销推荐代码',
  `bank_id` varchar(5) DEFAULT NULL COMMENT '银行ID（支行ID）',
  `bank_code` varchar(10) DEFAULT NULL COMMENT '银行CODE',
  `bank_name` varchar(20) DEFAULT NULL COMMENT '银行名称（支行）',
  `area_code` varchar(10) DEFAULT NULL COMMENT '行政区划代码',
  `area_name` varchar(50) DEFAULT NULL COMMENT '行政区划名称',
  `status_code` varchar(20) DEFAULT NULL COMMENT '状态代码',
  `status_name` varchar(20) DEFAULT NULL COMMENT '状态名称',
  `permit_loan_term` int(11) DEFAULT NULL COMMENT '银行授信的贷款期限(3/6)',
  `permit_loan_amount` double DEFAULT NULL COMMENT '银行授信的贷款额度（万）',
  `access_template_id` int(11) DEFAULT NULL COMMENT '准入计算模板ID',
  `input_page_one` mediumtext COMMENT '表单输入第一页(JSON)',
  `input_page_two` mediumtext COMMENT '表单输入第二页(JSON)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1037 DEFAULT CHARSET=utf8;
