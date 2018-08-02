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
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `movie` (
  `movie_id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_name` varchar(20) DEFAULT NULL,
  `movie_type` varchar(10) DEFAULT NULL,
  `movie_country` varchar(10) DEFAULT NULL,
  `movie_score` decimal(10,0) DEFAULT NULL,
  `movie_date` date DEFAULT NULL,
  `movie_desc` text,
  `director_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`movie_id`),
  KEY `movie_fk_director_idx` (`director_id`),
  CONSTRAINT `movie_fk_director` FOREIGN KEY (`director_id`) REFERENCES `director` (`director_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (1,'肖申克的救赎','犯罪 剧情','美国',NULL,'1994-10-14',NULL,1),(2,'霸王别姬','剧情 爱情 同性','中国',NULL,'1993-01-01',NULL,2),(3,'这个杀手不太冷','动作 犯罪','法国',NULL,'1994-09-14',NULL,3),(4,'阿甘正传','剧情 爱情','美国',NULL,'1994-06-23',NULL,4),(5,'美丽人生','剧情 喜剧 爱情','意大利',NULL,'1997-12-20',NULL,5),(6,'泰坦尼克号','剧情 爱情 灾难','美国',NULL,'1997-12-19',NULL,6),(7,'千与千寻','剧情 动画 奇幻','日本',NULL,'2001-07-20',NULL,7),(8,'辛德勒的名单',' 剧情 历史 战争','美国',NULL,'1993-11-30',NULL,8);
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-02  8:40:21
