create database holiday_db;

use holiday_db;

drop table if exists user;

create table user
(
	uid int auto_increment,
	ucode varchar(10), --类似QQ号
	name varchar(16),
	mobile varchar(15),
	email varchar(30),
	password varchar(18),
	create_time datetime,
	primary key(uid)
);


drop table if exists address;

create table address
(
	addr_id int auto_increment,
);

drop table if exists region;

create table region
(
	rid int auto_increment, /*行政地区ID*/
	parent_rid int , /*父行政地区ID*/
	level int, /*行政级别*/
	name varchar(100), /*地区中文名称*/
	english_name varchar(100), /*英文名称*/
	code varchar(20), /*行政编码*/
	primary key(rid)
)charset gbk;

insert into region (parent_rid, level, name, english_name, code) values (0, 1, '中国', 'china', '100000');