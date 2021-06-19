  
create database if not exists not_yelp;

use not_yelp;

drop table if exists dishes;
drop table if exists restaurants;
drop table if exists users;

create table user (
  user_id int primary key auto_increment not null,
  first_name varchar(50) not null,
  last_name varchar(50) not null,
  email varchar(384) not null,
  username varchar(50) not null,
  user_bio text,
  password varchar(64) not null
);

create table restaurant (
  restaurant_id int primary key auto_increment not null,
  user_id int not null,
  resta_name varchar(50) not null,
  visit_date timestamp not null default current_timestamp,
  resta_score tinyint(1) not null,
  resta_city varchar(50) not null,
  foreign key (user_id) references user (user_id) on delete cascade
);
  
create table dish (
  dish_id int primary key auto_increment not null,
  user_id int not null,
  restaurant_id int not null,
  dish_name varchar(50) not null,
  order_date timestamp not null default current_timestamp,
  dish_comment text,
  dish_price decimal(5,2) not null,
  resta_score tinyint(1) not null,
  foreign key (restaurant_id) references restaurant (restaurant_id),
  foreign key (user_id) references user (user_id)
);