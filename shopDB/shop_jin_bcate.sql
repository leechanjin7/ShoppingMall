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
-- Table structure for table `jin_bcate`
--

DROP TABLE IF EXISTS `jin_bcate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jin_bcate` (
  `tier` int NOT NULL,
  `cateName` varchar(30) NOT NULL,
  `cateCode` varchar(30) NOT NULL,
  `cateParent` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`cateCode`),
  KEY `cateParent` (`cateParent`),
  CONSTRAINT `jin_bcate_ibfk_1` FOREIGN KEY (`cateParent`) REFERENCES `jin_bcate` (`cateCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jin_bcate`
--

LOCK TABLES `jin_bcate` WRITE;
/*!40000 ALTER TABLE `jin_bcate` DISABLE KEYS */;
INSERT INTO `jin_bcate` VALUES (1,'국내','100000',NULL),(2,'소설','101000','100000'),(3,'한국소설','101001','101000'),(3,'영미소설','101002','101000'),(3,'일본소설','101003','101000'),(2,'시/에세이','102000','100000'),(3,'한국시','102001','102000'),(3,'해외시','102002','102000'),(2,'경제/경영','103000','100000'),(3,'경영일반','103001','103000'),(3,'경영이론','103002','103000'),(3,'경제일반','103003','103000'),(3,'경제이론','103004','103000'),(2,'자기계발','104000','100000'),(3,'성공/처세','104001','104000'),(3,'자기능력계발','104002','104000'),(3,'인간관계','104003','104000'),(2,'인문','105000','100000'),(3,'심리학','105001','105000'),(3,'교육학','105002','105000'),(3,'철학','105003','105000'),(2,'역사/문화','106000','100000'),(3,'역사일반','106001','106000'),(3,'세계사','106002','106000'),(3,'한국사','106003','106000'),(2,'과학','107000','100000'),(3,'과학이론','107001','107000'),(3,'수학','107002','107000'),(3,'물리학','107003','107000'),(1,'국외','200000',NULL),(2,'문학','201000','200000'),(3,'소설','201001','201000'),(3,'시','201002','201000'),(3,'희곡','201003','201000'),(2,'인문/사회','202000','200000'),(3,'교양','202001','202000'),(3,'철학','202002','202000'),(2,'경제/경영','203000','200000'),(3,'경제학','203001','203000'),(3,'경영학','203002','203000'),(3,'투자','203003','203000'),(2,'과학/기술','204000','200000'),(3,'교양과학','204001','204000'),(3,'물리학','204002','204000'),(3,'수학','204003','204000');
/*!40000 ALTER TABLE `jin_bcate` ENABLE KEYS */;
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
