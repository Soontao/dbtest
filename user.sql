/*
Navicat SQLite Data Transfer

Source Server         : dbtest
Source Server Version : 30808
Source Host           : :0

Target Server Type    : SQLite
Target Server Version : 30808
File Encoding         : 65001

Date: 2016-06-13 16:17:09
*/

PRAGMA foreign_keys = OFF;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS "main"."user";
CREATE TABLE "user" (
"id"  INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
"name"  TEXT NOT NULL,
"phone"  TEXT,
"address"  TEXT,
"comment"  TEXT
);
