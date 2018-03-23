drop schema if exists `learn-boot-step1`;
create schema `learn-boot-step1`;
use `learn-boot-step1`;

drop table if exists `test`;
# 建表
create table `test` (
  `id`   bigint not null,
  `name` varchar(255),
  primary key (`id`)
)
  engine = innodb
  default charset = utf8;

INSERT INTO `test` (`id`, `name`) VALUES (1, 'Test1');