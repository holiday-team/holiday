drop table if exists user;

create table user
(
	uid int auto_increment,
	ucode varchar(10), --����QQ��
	name varchar(16),
	mobile varchar(15),
	email varchar(30),
	address varchar(10),
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
	rid int auto_increment, --��������ID
	parent_rid int , --����������ID
	level int, --��������
	name varchar(100), --��������
	post_code varchar(20), --��������
	primary key(rid)
);