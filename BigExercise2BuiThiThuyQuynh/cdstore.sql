CREATE DATABASE cdstore;
ALTER DATABASE cdstore charset=utf8;
USE cdstore;
CREATE TABLE `cd` (
    `id` int(11) not null AUTO_INCREMENT PRIMARY key,
    `name` varchar(150) not null,
    `singer` varchar(150) not null,
    `numbersongs` int(11) not null,
    `price` double not null
    );

INSERT INTO cd(`name`, `singer`, `numbersongs`, `price`) values ('Anh cứ đi đi', 'Hariwon', 7, 10000);
INSERT INTO cd(`name`, `singer`, `numbersongs`, `price`) values ('Take me to your heart', 'Michael Jackson', 18, 30000);
INSERT INTO cd(`name`, `singer`, `numbersongs`, `price`) values ('Cơn mưa ngang qua', 'Sơn Tùng MTP', 5, 5000);
INSERT INTO cd(`name`, `singer`, `numbersongs`, `price`) values ('Lý mồ côi', 'Phi Nhung', 17, 40000);