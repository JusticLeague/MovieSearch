-- MySQL Script generated by MySQL Workbench
-- Mon Aug  6 15:38:53 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema movie
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema movie
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `movie` DEFAULT CHARACTER SET utf8 ;
USE `movie` ;

-- -----------------------------------------------------
-- Table `movie`.`vip`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `movie`.`vip` (
  `vip_id` INT NOT NULL AUTO_INCREMENT,
  `vip_phone` CHAR(11) NOT NULL,
  `vip_password` CHAR(32) NOT NULL,
  `vip_name` VARCHAR(20) NOT NULL,
  `vip_pic` VARCHAR(255) NULL,
  PRIMARY KEY (`vip_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `movie`.`director`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `movie`.`director` (
  `director_id` INT NOT NULL AUTO_INCREMENT,
  `director_name` VARCHAR(20) NULL,
  `director_sex` INT NULL,
  `director_birth` DATE NULL,
  `director_country` VARCHAR(10) NULL,
  `director_desc` TEXT NULL,
  PRIMARY KEY (`director_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `movie`.`movie`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `movie`.`movie` (
  `movie_id` INT NOT NULL AUTO_INCREMENT,
  `movie_name` VARCHAR(20) NULL,
  `movie_type` VARCHAR(10) NULL,
  `movie_country` VARCHAR(10) NULL,
  `movie_score` DECIMAL(3,1) NULL,
  `movie_date` DATE NULL,
  `movie_desc` TEXT NULL,
  `director_id` INT NULL,
  `movie_ratings` VARCHAR(20) NULL,
  `movie_dimension` INT NULL,
  PRIMARY KEY (`movie_id`),
  INDEX `movie_fk_director_idx` (`director_id` ASC),
  CONSTRAINT `movie_fk_director`
    FOREIGN KEY (`director_id`)
    REFERENCES `movie`.`director` (`director_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `movie`.`collect`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `movie`.`collect` (
  `collect_id` INT NOT NULL AUTO_INCREMENT,
  `vip_id` INT NULL,
  `movie_id` INT NULL,
  PRIMARY KEY (`collect_id`),
  INDEX `vip_id_idx` (`vip_id` ASC),
  INDEX `movie_id_idx` (`movie_id` ASC),
  CONSTRAINT `collect_fk_vip`
    FOREIGN KEY (`vip_id`)
    REFERENCES `movie`.`vip` (`vip_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `collect_fk_movie`
    FOREIGN KEY (`movie_id`)
    REFERENCES `movie`.`movie` (`movie_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `movie`.`comment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `movie`.`comment` (
  `cmt_id` INT NOT NULL AUTO_INCREMENT,
  `vip_id` INT NULL,
  `movie_id` INT NULL,
  `cmt_comment` TEXT NULL,
  INDEX `id_vip_idx` (`vip_id` ASC),
  INDEX `id_movie_idx` (`movie_id` ASC),
  PRIMARY KEY (`cmt_id`),
  CONSTRAINT `comment_fk_vip`
    FOREIGN KEY (`vip_id`)
    REFERENCES `movie`.`vip` (`vip_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `comment_fk_movie`
    FOREIGN KEY (`movie_id`)
    REFERENCES `movie`.`movie` (`movie_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `movie`.`actor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `movie`.`actor` (
  `actor_id` INT NOT NULL AUTO_INCREMENT,
  `actor_name` VARCHAR(20) NULL,
  `actor_sex` INT NULL,
  `actor_birth` DATE NULL,
  `actor_country` VARCHAR(10) NULL,
  `actor_desc` TEXT NULL,
  PRIMARY KEY (`actor_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `movie`.`movie_item`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `movie`.`movie_item` (
  `movie_id` INT NULL,
  `actor_id` INT NULL,
  INDEX `movie_fk_movie_idx` (`movie_id` ASC),
  INDEX `movie_fk_actor_idx` (`actor_id` ASC),
  CONSTRAINT `movieitem_fk_movie`
    FOREIGN KEY (`movie_id`)
    REFERENCES `movie`.`movie` (`movie_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `movie_fk_actor`
    FOREIGN KEY (`actor_id`)
    REFERENCES `movie`.`actor` (`actor_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `movie`.`poster`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `movie`.`poster` (
  `movie_id` INT NULL,
  `poster_pic` VARCHAR(255) NULL,
  INDEX `poster_fk_movie_idx` (`movie_id` ASC),
  CONSTRAINT `poster_fk_movie`
    FOREIGN KEY (`movie_id`)
    REFERENCES `movie`.`movie` (`movie_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `movie`.`director_pic`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `movie`.`director_pic` (
  `director_id` INT NULL,
  `director_pic` VARCHAR(255) NULL,
  INDEX `directorPic_fk_director_idx` (`director_id` ASC),
  CONSTRAINT `directorPic_fk_director`
    FOREIGN KEY (`director_id`)
    REFERENCES `movie`.`director` (`director_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `movie`.`actor_pic`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `movie`.`actor_pic` (
  `actor_id` INT NULL,
  `actor_pic` VARCHAR(255) NULL,
  INDEX `actorPic_fk_actor_idx` (`actor_id` ASC),
  CONSTRAINT `actorPic_fk_actor`
    FOREIGN KEY (`actor_id`)
    REFERENCES `movie`.`actor` (`actor_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `movie`.`score`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `movie`.`score` (
  `vip_id` INT NULL,
  `movie_id` INT NULL,
  `score` DECIMAL(3,1) NULL,
  INDEX `score_fk_movie_idx` (`movie_id` ASC),
  INDEX `score_fk_vip_idx` (`vip_id` ASC),
  CONSTRAINT `score_fk_movie`
    FOREIGN KEY (`movie_id`)
    REFERENCES `movie`.`movie` (`movie_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `score_fk_vip`
    FOREIGN KEY (`vip_id`)
    REFERENCES `movie`.`vip` (`vip_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
