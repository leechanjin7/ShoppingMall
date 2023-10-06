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
-- Table structure for table `book_member`
--

DROP TABLE IF EXISTS `book_member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book_member` (
  `memberId` varchar(50) NOT NULL,
  `memberPw` varchar(100) NOT NULL,
  `memberName` varchar(30) NOT NULL,
  `memberMail` varchar(100) NOT NULL,
  `memberAddr1` varchar(100) NOT NULL,
  `memberAddr2` varchar(100) NOT NULL,
  `memberAddr3` varchar(100) NOT NULL,
  `adminCk` int NOT NULL,
  `regDate` date NOT NULL,
  `money` int NOT NULL,
  `point` int NOT NULL,
  PRIMARY KEY (`memberId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_member`
--

LOCK TABLES `book_member` WRITE;
/*!40000 ALTER TABLE `book_member` DISABLE KEYS */;
INSERT INTO `book_member` VALUES ('admin','admin','admin','admin','admin','admin','admin',1,'2023-09-05',1043097,6764),('daeuneheart','$2a$10$R37jWLQmgSoZH2RL/Yp2u.mX39SmxyQt2UhQiv4ciRQJR9M3AX4iy','황다은','chanjini7@naver.com','41116','대구 동구 율하동로20길 20 (신기동, 화성아파트)','1235층',0,'2023-09-07',100000,5000),('test','test','test','test','test','test','test',0,'2023-09-07',100000,5000),('test1','test1','test1','chanjini7@naver.com','05237','서울 강동구 아리수로 46 (암사동)','test1',0,'2023-09-07',13154,2910),('test3','test3','test3','test3','test3','test3','test3',0,'2023-09-07',100000,5000),('test5','$2a$10$kr7EgKaJm9CKt5UZbKLZHuE0P.WVaBqR8gbiTzsOjN4LnzLjMe8p6','test5','chanjini7@naver.com','02569','서울 동대문구 약령서길 14 (제기동)','test3',0,'2023-09-07',100000,5000);
/*!40000 ALTER TABLE `book_member` ENABLE KEYS */;
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
