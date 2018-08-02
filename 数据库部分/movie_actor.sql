-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: movie
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `actor`
--

DROP TABLE IF EXISTS `actor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `actor` (
  `actor_id` int(11) NOT NULL AUTO_INCREMENT,
  `actor_name` varchar(20) DEFAULT NULL,
  `actor_sex` int(11) DEFAULT NULL,
  `actor_age` date DEFAULT NULL,
  `actor_country` varchar(10) DEFAULT NULL,
  `actor_desc` text,
  PRIMARY KEY (`actor_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actor`
--

LOCK TABLES `actor` WRITE;
/*!40000 ALTER TABLE `actor` DISABLE KEYS */;
INSERT INTO `actor` VALUES (1,'蒂姆·罗宾斯',1,'1958-10-16','美国',NULL),(2,'摩根·弗里曼',1,'1937-06-01','美国',NULL),(3,'张国荣',1,'1956-09-12','中国香港',NULL),(4,'张丰毅',1,'1956-09-01','中国',NULL),(5,'让·雷诺',1,'1948-07-30','摩洛哥',NULL),(6,'娜塔莉·波特曼',0,'1981-06-09','以色列',NULL),(7,'汤姆·汉克斯',1,'1956-07-09','美国',NULL),(8,'罗宾·怀特',0,'1966-04-08','美国',NULL),(9,'罗伯托·贝尼尼',1,'1952-10-27','意大利',NULL),(10,'尼可莱塔·布拉斯基',0,'1960-04-19','意大利',NULL),(11,'莱昂纳多·迪卡普里奥',1,'1974-11-11','美国',NULL),(12,'凯特·温丝莱特',0,'1975-10-05','英国',NULL),(13,'柊瑠美',0,'1987-08-01','日本',NULL),(14,'入野自由',1,'1988-02-19','日本',NULL),(15,'连姆·尼森',1,'1952-06-07','英国',NULL),(16,'本·金斯利',1,'1943-12-31','英国',NULL);
/*!40000 ALTER TABLE `actor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-02  8:40:22
