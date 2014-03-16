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

DROP TABLE IF EXISTS `ezhao`.`product`;
CREATE TABLE `ezhao`.`product` (
  `id` int(11) DEFAULT NULL,
  `product_name` varchar(1000) DEFAULT NULL,
  `description` blob,
  `product_category` int(11) DEFAULT NULL,
  `thumbnails` varchar(1000) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `ezhao`.`product_category`;
CREATE TABLE `ezhao`.`product_category` (
  `id` int(11) NOT NULL,
  `category_name` varchar(1000) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `category_parent` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


--公司介绍表
CREATE TABLE `ez_companyinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `companyName` varchar(100) NOT NULL,
  `introduce` varchar(2000) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `telephone` varchar(50) DEFAULT NULL,
  `cellphone` varchar(50) DEFAULT NULL,
  `faxphone` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `keywords` varchar(1000) DEFAULT NULL,
  `contactPerson` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;