use student_management;

-- Tạo bảng class
create table `class` (
	`id_class` int not null,
    `name_class` varchar(10),
    primary key (`id_class`)
);

-- Tạo bảng teacher
create table `teacher` (
	`id_teacher` int not null,
    `name_teacher` varchar(10),
    `age_teacher` int,
    `country_teacher` varchar(45),
    primary key (`id_teacher`)
);