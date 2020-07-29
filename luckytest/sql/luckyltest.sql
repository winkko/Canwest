DROP TABLE `jurisdiction`;
CREATE TABLE `jurisdiction`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`juName` VARCHAR(25) NOT NULL
)
INSERT INTO `lucky`.`jurisdiction` (`juName`) VALUES('医生') ;
INSERT INTO `lucky`.`jurisdiction` (`juName`) VALUES('患者') ;
INSERT INTO `lucky`.`jurisdiction` (`juName`) VALUES('管理员') ;

DROP TABLE `user`;
CREATE TABLE `user`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`username` VARCHAR(25) NOT NULL,
`password` VARCHAR(25) NOT NULL,
`juId` INT(1) NOT NULL
)
INSERT INTO `lucky`.`user` (`username`, `password`, `juId`) VALUES('admin', '1234', 3) ;
INSERT INTO `lucky`.`user` (`username`, `password`, `juId`) VALUES('lxhs', '1111', 1) ;
INSERT INTO `lucky`.`user` (`username`, `password`, `juId`) VALUES('mmhz', '1234', 2) ;