CREATE DATABASE  IF NOT EXISTS `shop` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `shop`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: shop
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `jin_reply`
--

DROP TABLE IF EXISTS `jin_reply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jin_reply` (
  `replyId` int NOT NULL AUTO_INCREMENT,
  `bookId` int NOT NULL,
  `memberId` varchar(50) NOT NULL,
  `regDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `content` varchar(3500) DEFAULT NULL,
  `rating` decimal(2,1) NOT NULL,
  PRIMARY KEY (`replyId`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jin_reply`
--

LOCK TABLES `jin_reply` WRITE;
/*!40000 ALTER TABLE `jin_reply` DISABLE KEYS */;
INSERT INTO `jin_reply` VALUES (1,95,'admin','2023-09-13 01:09:42','댓글 테스트',3.5),(2,3065,'admin','2023-09-13 01:27:51','리뷰 테스트',3.0),(3,1,'test','2023-09-13 02:08:47','테스트입니다.',3.0),(4,1,'test','2023-09-13 02:08:50','테스트입니다.',3.0),(5,1,'test','2023-09-13 02:08:51','테스트입니다.',3.0),(6,1,'test','2023-09-13 02:08:51','테스트입니다.',3.0),(7,1,'test','2023-09-13 02:08:52','테스트입니다.',3.0),(8,1,'test','2023-09-13 02:08:52','테스트입니다.',3.0),(9,1,'test','2023-09-13 02:08:52','테스트입니다.',3.0),(10,1,'test','2023-09-13 02:08:52','테스트입니다.',3.0),(11,1,'test','2023-09-13 02:08:52','테스트입니다.',3.0),(12,1,'test','2023-09-13 02:08:52','테스트입니다.',3.0),(13,1,'test','2023-09-13 02:08:53','테스트입니다.',3.0),(14,1,'test','2023-09-13 02:09:37','테스트입니다.',3.0),(16,4100,'test','2023-09-13 02:11:11','테스트입니다.',3.0),(17,4100,'test','2023-09-13 02:11:11','테스트입니다.',3.0),(18,4100,'test','2023-09-13 02:11:11','테스트입니다.',3.0),(19,4100,'test','2023-09-13 02:11:11','테스트입니다.',3.0),(20,4100,'test','2023-09-13 02:11:11','테스트입니다.',3.0),(21,4100,'test','2023-09-13 02:11:12','테스트입니다.',3.0),(22,4100,'test','2023-09-13 02:11:12','테스트입니다.',3.0),(23,4100,'test','2023-09-13 02:11:12','테스트입니다.',3.0),(24,4100,'test','2023-09-13 02:11:12','테스트입니다.',3.0),(25,4100,'test','2023-09-13 02:11:12','테스트입니다.',3.0),(26,4100,'test','2023-09-13 02:11:12','테스트입니다.',3.0),(27,4100,'test','2023-09-13 02:11:12','테스트입니다.',3.0),(28,4100,'test','2023-09-13 02:11:13','테스트입니다.',3.0),(29,4100,'test','2023-09-13 02:11:13','테스트입니다.',3.0),(30,4100,'test','2023-09-13 02:11:13','테스트입니다.',3.0),(31,4100,'test','2023-09-13 02:11:13','테스트입니다.',3.0),(32,4100,'test','2023-09-13 02:11:13','테스트입니다.',3.0),(33,4098,'admin','2023-09-13 02:13:26','gafdgadg',2.5),(34,33,'admin','2023-09-13 02:13:33','dasfasdfasdf',0.5),(35,95,'admin','2023-09-13 02:18:50','댓글 테스트',3.5),(36,4098,'test1','2023-09-13 04:13:17','ㅇㄻㅇㄻㅇㄴㄹ',0.5),(37,4098,'test','2023-09-13 04:13:52','테스트입니다.',2.5),(38,4098,'test','2023-09-13 04:13:52','테스트입니다.',2.5),(39,4098,'test','2023-09-13 04:13:52','테스트입니다.',2.5),(40,4098,'test','2023-09-13 04:13:52','테스트입니다.',2.5),(41,4098,'test','2023-09-13 04:13:52','테스트입니다.',2.5),(45,4098,'test','2023-09-13 04:15:22','테스트입니다.',4.0),(46,4098,'test','2023-09-13 04:15:22','테스트입니다.',4.0),(50,4100,'admin','2023-09-14 08:36:32','황다은 밥오22222',3.5);
/*!40000 ALTER TABLE `jin_reply` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-06  9:45:19
