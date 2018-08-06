INSERT INTO director 
(director_name,director_sex,director_birth,director_country) 
VALUES
('弗兰克·德拉邦特',1,'1959-01-28','法国');

INSERT INTO director 
(director_name,director_sex,director_birth,director_country) 
VALUES
('陈凯歌',1,'1952-08-12','中国');

INSERT INTO director 
(director_name,director_sex,director_birth,director_country) 
VALUES
('吕克·贝松',1,'1959-01-28','法国');

INSERT INTO director 
(director_name,director_sex,director_birth,director_country) 
VALUES
('罗伯特·泽米吉斯',1,'1952-05-14','美国');

INSERT INTO director 
(director_name,director_sex,director_birth,director_country) 
VALUES
('罗伯托·贝尼尼',1,'1952-10-27','意大利');

INSERT INTO director 
(director_name,director_sex,director_birth,director_country) 
VALUES
('詹姆斯·卡梅隆',1,'1954-08-16','加拿大');

INSERT INTO director 
(director_name,director_sex,director_birth,director_country) 
VALUES
('宫崎骏',1,'1941-01-05','日本');

INSERT INTO director 
(director_name,director_sex,director_birth,director_country) 
VALUES
('史蒂文·斯皮尔伯格',1,'1946-12-18','美国');


-- movie

INSERT INTO movie 
(movie_name,movie_type,movie_country,movie_date,director_id)
VALUES
('肖申克的救赎','犯罪 剧情','美国','1994-10-14',1);

INSERT INTO movie 
(movie_name,movie_type,movie_country,movie_date,director_id)
VALUES
('霸王别姬','剧情 爱情 同性','中国','1993-01-01',2);

INSERT INTO movie 
(movie_name,movie_type,movie_country,movie_date,director_id)
VALUES
('这个杀手不太冷','动作 犯罪','法国','1994-09-14',3);

INSERT INTO movie 
(movie_name,movie_type,movie_country,movie_date,director_id)
VALUES
('阿甘正传','剧情 爱情','美国','1994-06-23',4);

INSERT INTO movie 
(movie_name,movie_type,movie_country,movie_date,director_id)
VALUES
('美丽人生','剧情 喜剧 爱情','意大利','1997-12-20',5);

INSERT INTO movie 
(movie_name,movie_type,movie_country,movie_date,director_id)
VALUES
('泰坦尼克号','剧情 爱情 灾难','美国','1997-12-19',6);

INSERT INTO movie 
(movie_name,movie_type,movie_country,movie_date,director_id)
VALUES
('千与千寻','剧情 动画 奇幻','日本','2001-07-20',7);

INSERT INTO movie 
(movie_name,movie_type,movie_country,movie_date,director_id)
VALUES
('辛德勒的名单',' 剧情 历史 战争','美国','1993-11-30',8);



-- actor
INSERT INTO actor 
(actor_name,actor_sex,actor_birth,actor_country) 
VALUES
('蒂姆·罗宾斯',1,'1958-10-16','美国');

INSERT INTO actor 
(actor_name,actor_sex,actor_birth,actor_country)
VALUES
('摩根·弗里曼',1,'1937-06-01','美国');

INSERT INTO actor 
(actor_name,actor_sex,actor_birth,actor_country)
VALUES
('张国荣',1,'1956-09-12','中国香港');

INSERT INTO actor 
(actor_name,actor_sex,actor_birth,actor_country)
VALUES
('张丰毅',1,'1956-09-01','中国');

INSERT INTO actor 
(actor_name,actor_sex,actor_birth,actor_country)
VALUES
('让·雷诺',1,'1948-07-30','摩洛哥');

INSERT INTO actor 
(actor_name,actor_sex,actor_birth,actor_country)
VALUES
('娜塔莉·波特曼',0,'1981-06-09','以色列');

INSERT INTO actor 
(actor_name,actor_sex,actor_birth,actor_country)
VALUES
('汤姆·汉克斯',1,'1956-07-09','美国');

INSERT INTO actor 
(actor_name,actor_sex,actor_birth,actor_country)
VALUES
('罗宾·怀特',0,'1966-04-08','美国');

INSERT INTO actor 
(actor_name,actor_sex,actor_birth,actor_country) 
VALUES
('罗伯托·贝尼尼',1,'1952-10-27','意大利');

INSERT INTO actor 
(actor_name,actor_sex,actor_birth,actor_country)
VALUES
('尼可莱塔·布拉斯基',0,'1960-04-19','意大利');

INSERT INTO actor 
(actor_name,actor_sex,actor_birth,actor_country)
VALUES
('莱昂纳多·迪卡普里奥',1,'1974-11-11','美国');

INSERT INTO actor 
(actor_name,actor_sex,actor_birth,actor_country)
VALUES
('凯特·温丝莱特',0,'1975-10-05','英国');

INSERT INTO actor 
(actor_name,actor_sex,actor_birth,actor_country)
VALUES
('柊瑠美',0,'1987-08-01','日本');

INSERT INTO actor 
(actor_name,actor_sex,actor_birth,actor_country)
VALUES
('入野自由',1,'1988-02-19','日本');

INSERT INTO actor 
(actor_name,actor_sex,actor_birth,actor_country)
VALUES
('连姆·尼森',1,'1952-06-07','英国');

INSERT INTO actor 
(actor_name,actor_sex,actor_birth,actor_country)
VALUES
('本·金斯利',1,'1943-12-31','英国');


-- movie_item

INSERT INTO movie_item
(movie_id,actor_id)
VALUES
(1,1);
INSERT INTO movie_item
(movie_id,actor_id)
VALUES
(1,2);
INSERT INTO movie_item
(movie_id,actor_id)
VALUES
(2,3);
INSERT INTO movie_item
(movie_id,actor_id)
VALUES
(2,4);
INSERT INTO movie_item
(movie_id,actor_id)
VALUES
(3,5);
INSERT INTO movie_item
(movie_id,actor_id)
VALUES
(3,6);
INSERT INTO movie_item
(movie_id,actor_id)
VALUES
(4,7);
INSERT INTO movie_item
(movie_id,actor_id)
VALUES
(4,8);
INSERT INTO movie_item
(movie_id,actor_id)
VALUES
(5,9);
INSERT INTO movie_item
(movie_id,actor_id)
VALUES
(5,10);
INSERT INTO movie_item
(movie_id,actor_id)
VALUES
(6,11);
INSERT INTO movie_item
(movie_id,actor_id)
VALUES
(6,12);
INSERT INTO movie_item
(movie_id,actor_id)
VALUES
(7,13);
INSERT INTO movie_item
(movie_id,actor_id)
VALUES
(7,14);
INSERT INTO movie_item
(movie_id,actor_id)
VALUES
(8,15);
INSERT INTO movie_item
(movie_id,actor_id)
VALUES
(8,16);




