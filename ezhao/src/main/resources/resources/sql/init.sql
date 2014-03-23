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
  `companyName` varchar(200) NOT NULL,
  `introduce` varchar(5000) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `telephone` varchar(50) DEFAULT NULL,
  `cellphone` varchar(50) DEFAULT NULL,
  `faxphone` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `keywords` varchar(2000) DEFAULT NULL,
  `contactPerson` varchar(100) DEFAULT NULL,
  `companyNameEN` varchar(200) NOT NULL,
  `introduceEN` varchar(5000) DEFAULT NULL,
  `addressEN` varchar(200) DEFAULT NULL,
  `telephoneEN` varchar(50) DEFAULT NULL,
  `cellphoneEN` varchar(50) DEFAULT NULL,
  `faxphoneEN` varchar(50) DEFAULT NULL,
  `emailEN` varchar(50) DEFAULT NULL,
  `keywordsEN` varchar(2000) DEFAULT NULL,
  `contactPersonEN` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--证书表,保存证书图片的链接
CREATE TABLE `ez_certificate` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(100) DEFAULT NULL,
  `url` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--成功案例分类
CREATE TABLE `ez_successful_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `CATEGORYNAME` varchar(45) NOT NULL,
  `PARENTID` int(11) NOT NULL,
  `ISLEAF` varchar(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--成功案例细节
CREATE TABLE `ez_successfulcasedetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(4000) NOT NULL,
  `name` varchar(500) NOT NULL,
  `descriptionEN` varchar(5000) NOT NULL,
  `nameEN` varchar(500) NOT NULL,
  `pictureURL` varchar(300) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


--产品分类
CREATE TABLE `ez_product_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `CATEGORYNAME` varchar(45) NOT NULL,
  `PARENTID` int(11) NOT NULL,
  `ISLEAF` varchar(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


--广告类型表
CREATE TABLE `ez_ad_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adCategoryName` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='广告类型';

--广告表
CREATE TABLE `ez_advertise` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `advertiseURL` varchar(200) NOT NULL,
  `advertiseLink` varchar(500) NOT NULL,
  `typeId` int(11) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `advertiseURLEN` varchar(200) DEFAULT NULL,
  `advertiseLinkEN` varchar(500) DEFAULT NULL,
  `descriptionEN` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='广告位置图片';

