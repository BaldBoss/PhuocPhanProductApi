/*
 Navicat Premium Data Transfer

 Source Server         : product
 Source Server Type    : PostgreSQL
 Source Server Version : 140001
 Source Host           : localhost:5432
 Source Catalog        : product
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 140001
 File Encoding         : 65001

 Date: 10/02/2022 22:14:05
*/


-- ----------------------------
-- Sequence structure for product_seuqence
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."product_seuqence";
CREATE SEQUENCE "public"."product_seuqence" 
INCREMENT 50
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS "public"."product";
CREATE TABLE "public"."product" (
  "id" int8 NOT NULL,
  "brand" varchar(255) COLLATE "pg_catalog"."default",
  "category" varchar(255) COLLATE "pg_catalog"."default",
  "code" varchar(255) COLLATE "pg_catalog"."default",
  "description" varchar(255) COLLATE "pg_catalog"."default",
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "type" varchar(255) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO "public"."product" VALUES (1, 'Apple', 'phone', 'IpX', 'Iphone X designed by Apple', 'iphone X', 'Electronic');
INSERT INTO "public"."product" VALUES (2, 'Samsung', 'phone', 'SG7', 'Samsung galaxy 7 designed by Samsung', 'Samsung Galaxy 7', 'Electronic');

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
SELECT setval('"public"."product_seuqence"', 51, true);

-- ----------------------------
-- Primary Key structure for table product
-- ----------------------------
ALTER TABLE "public"."product" ADD CONSTRAINT "product_pkey" PRIMARY KEY ("id");
