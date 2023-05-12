#创建数据库
create database game;
use game;

#创建用户表
create table t_user(
`user_id` int not null primary key auto_increment,
`username` varchar(32) not null DEFAULT '',
`password` varchar(32) not null DEFAULT '',
account_type varchar(32) not null DEFAULT '',
last_login TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP,
islogin TINYINT(1) not null DEFAULT 0
);

#创建角色表
create table t_player(
player_name varchar(32) not null DEFAULT '',
user_id int not null DEFAULT 0,
player_id int not null primary key auto_increment,
weapon_id int references t_weapon(weapon_id)
);

#创建武器表
create table t_weapon(
weapon_id int PRIMARY key not null auto_increment,
weapon_name varchar(32) not null DEFAULT '',
weapon_damage int not null DEFAULT 0
);

#创建角色和装备的联系表
create table t_playerdata(
player_id int references t_player(player_id),
weapon_id int references t_weapon(weapon_id)
);

#创建用户和角色的联系表
create table t_userdata(
user_id int references t_user(user_id),
player_id int references t_player(player_id)
);