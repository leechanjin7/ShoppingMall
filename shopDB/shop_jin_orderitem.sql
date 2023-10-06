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
-- Table structure for table `jin_orderitem`
--

DROP TABLE IF EXISTS `jin_orderitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jin_orderitem` (
  `orderItemId` int NOT NULL AUTO_INCREMENT,
  `orderId` varchar(50) DEFAULT NULL,
  `bookId` int DEFAULT NULL,
  `bookCount` int NOT NULL,
  `bookPrice` int NOT NULL,
  `bookDiscount` int NOT NULL,
  `savePoint` int NOT NULL,
  PRIMARY KEY (`orderItemId`),
  KEY `orderId` (`orderId`),
  KEY `bookId` (`bookId`),
  CONSTRAINT `jin_orderitem_ibfk_1` FOREIGN KEY (`orderId`) REFERENCES `jin_order` (`orderId`),
  CONSTRAINT `jin_orderitem_ibfk_2` FOREIGN KEY (`bookId`) REFERENCES `jin_book` (`bookId`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jin_orderitem`
--

LOCK TABLES `jin_orderitem` WRITE;
/*!40000 ALTER TABLE `jin_orderitem` DISABLE KEYS */;
INSERT INTO `jin_orderitem` VALUES (8,'admin_2023091219',22,5,15000,0,727),(9,'admin_2023091219',64,2,15000,0,727),(10,'admin_2023091220',3065,5,15000,0,727),(11,'admin_2023091222',4097,1,20000,0,770),(12,'admin_2023091226',4089,1,40000,0,1920),(13,'admin_2023091231',3059,1,15000,0,727),(14,'admin_2023091232',4095,1,202321,0,10014),(15,'test1_2023091235',3065,1,15000,0,727),(16,'test1_2023091238',3065,1,15000,0,727),(17,'test1_2023091248',4100,1,60000,0,2910),(18,'admin_2023091320',3059,2,15000,0,727),(19,'admin_2023091359',4095,1,202321,0,10014),(20,'admin_2023091338',4100,1,60000,0,2910),(21,'admin_2023091402',4100,1,60000,0,2910),(22,'admin_2023092220',4100,1,60000,0,2910);
/*!40000 ALTER TABLE `jin_orderitem` ENABLE KEYS */;
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
