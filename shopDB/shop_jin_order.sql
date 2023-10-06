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
-- Table structure for table `jin_order`
--

DROP TABLE IF EXISTS `jin_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jin_order` (
  `orderId` varchar(50) NOT NULL,
  `addressee` varchar(50) NOT NULL,
  `memberId` varchar(50) DEFAULT NULL,
  `memberAddr1` varchar(100) NOT NULL,
  `memberAddr2` varchar(100) NOT NULL,
  `memberAddr3` varchar(100) NOT NULL,
  `orderState` varchar(30) NOT NULL,
  `deliveryCost` int NOT NULL,
  `usePoint` int NOT NULL,
  `orderDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`orderId`),
  KEY `memberId` (`memberId`),
  CONSTRAINT `jin_order_ibfk_1` FOREIGN KEY (`memberId`) REFERENCES `book_member` (`memberId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jin_order`
--

LOCK TABLES `jin_order` WRITE;
/*!40000 ALTER TABLE `jin_order` DISABLE KEYS */;
INSERT INTO `jin_order` VALUES ('2021_test1','test','admin','test','test','test','주문취소',3000,1000,'2023-09-12 10:06:05'),('admin_2023091219','admin','admin','admin','admin','admin','주문취소',0,4000,'2023-09-12 10:19:16'),('admin_2023091220','admin','admin','admin','admin','admin','주문취소',0,11089,'2023-09-12 10:20:23'),('admin_2023091222','admin','admin','admin','admin','admin','주문취소',3000,5,'2023-09-12 10:22:40'),('admin_2023091226','admin','admin','admin','admin','admin','주문취소',0,2000,'2023-09-12 10:26:27'),('admin_2023091231','admin','admin','admin','admin','admin','주문취소',3000,0,'2023-09-12 10:31:41'),('admin_2023091232','admin','admin','admin','admin','admin','주문취소',0,0,'2023-09-12 10:32:51'),('admin_2023091320','admin','admin','admin','admin','admin','주문취소',3000,10000,'2023-09-13 00:20:50'),('admin_2023091338','admin','admin','admin','admin','admin','주문취소',0,0,'2023-09-13 07:38:29'),('admin_2023091359','admin','admin','admin','admin','admin','주문취소',0,5182,'2023-09-13 03:59:04'),('admin_2023091402','admin','admin','admin','admin','admin','주문취소',0,6944,'2023-09-14 08:02:25'),('admin_2023092220','admin','admin','admin','admin','admin','주문취소',0,0,'2023-09-22 02:20:06'),('test1_2023091235','test1','test1','05237','서울 강동구 아리수로 46 (암사동)','test1','주문취소',3000,2000,'2023-09-12 10:35:46'),('test1_2023091238','test1','test1','05237','서울 강동구 아리수로 46 (암사동)','test1','주문취소',3000,500,'2023-09-12 10:38:09'),('test1_2023091248','test1','test1','05237','서울 강동구 아리수로 46 (암사동)','test1','주문취소',0,3954,'2023-09-12 10:48:24');
/*!40000 ALTER TABLE `jin_order` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-06  9:45:18
