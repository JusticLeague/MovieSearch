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
-- Temporary view structure for view `moviedirectoractor`
--

DROP TABLE IF EXISTS `moviedirectoractor`;
/*!50001 DROP VIEW IF EXISTS `moviedirectoractor`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `moviedirectoractor` AS SELECT 
 1 AS `movie_name`,
 1 AS `movie_type`,
 1 AS `movie_country`,
 1 AS `movie_date`,
 1 AS `director_name`,
 1 AS `actor_name`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `moviedirector`
--

DROP TABLE IF EXISTS `moviedirector`;
/*!50001 DROP VIEW IF EXISTS `moviedirector`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `moviedirector` AS SELECT 
 1 AS `movie_name`,
 1 AS `movie_type`,
 1 AS `movie_country`,
 1 AS `movie_date`,
 1 AS `director_name`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `movieactor`
--

DROP TABLE IF EXISTS `movieactor`;
/*!50001 DROP VIEW IF EXISTS `movieactor`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `movieactor` AS SELECT 
 1 AS `movie_name`,
 1 AS `actor_name`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `moviedirectoractor`
--

/*!50001 DROP VIEW IF EXISTS `moviedirectoractor`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = gbk */;
/*!50001 SET character_set_results     = gbk */;
/*!50001 SET collation_connection      = gbk_chinese_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `moviedirectoractor` AS select `m`.`movie_name` AS `movie_name`,`m`.`movie_type` AS `movie_type`,`m`.`movie_country` AS `movie_country`,`m`.`movie_date` AS `movie_date`,`d`.`director_name` AS `director_name`,`a`.`actor_name` AS `actor_name` from (((`movie` `m` join `director` `d`) join `movieitem` `mi`) join `actor` `a`) where ((`m`.`director_id` = `d`.`director_id`) and (`m`.`movie_id` = `mi`.`movie_id`) and (`mi`.`actor_id` = `a`.`actor_id`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `moviedirector`
--

/*!50001 DROP VIEW IF EXISTS `moviedirector`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = gbk */;
/*!50001 SET character_set_results     = gbk */;
/*!50001 SET collation_connection      = gbk_chinese_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `moviedirector` AS select `m`.`movie_name` AS `movie_name`,`m`.`movie_type` AS `movie_type`,`m`.`movie_country` AS `movie_country`,`m`.`movie_date` AS `movie_date`,`d`.`director_name` AS `director_name` from (`movie` `m` join `director` `d`) where (`m`.`director_id` = `d`.`director_id`) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `movieactor`
--

/*!50001 DROP VIEW IF EXISTS `movieactor`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = gbk */;
/*!50001 SET character_set_results     = gbk */;
/*!50001 SET collation_connection      = gbk_chinese_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `movieactor` AS select `m`.`movie_name` AS `movie_name`,`a`.`actor_name` AS `actor_name` from ((`movie` `m` join `movieitem` `mi`) join `actor` `a`) where ((`m`.`movie_id` = `mi`.`movie_id`) and (`mi`.`actor_id` = `a`.`actor_id`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-02  8:40:24
