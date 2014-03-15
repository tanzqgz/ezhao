create database ezhao;


CREATE TABLE `ezhao`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `loginName` VARCHAR(50) NOT NULL,
  `password` VARCHAR(50) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `loginName_UNIQUE` (`loginName` ASC))
ENGINE = InnoDB
COMMENT = '用户登录表';

insert into `ezhao`.user(loginName,password) values('admin','admin');