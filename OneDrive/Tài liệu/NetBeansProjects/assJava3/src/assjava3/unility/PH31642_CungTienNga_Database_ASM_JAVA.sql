create database PH31642_CungTienNga_ASM1_JAVA3
go
use PH31642_CungTienNga_ASM1_JAVA3
go
create table Users
(
    userName varchar(50) NOT NULL primary key,
    passWord varchar(50) ,
    role nvarchar(50) ,
);
go

create table Students
(
    MASV varchar(50) NOT NULL primary key ,
    HoTen nvarchar(50) ,
    Email varchar(50) ,
    SoDT varchar(15) ,
    Gioitinh bit ,
    Diachi nvarchar(50) ,
    Hinh varchar(50) ,
);
go
create table Grade
(
    ID int IDENTITY(1,1) NOT NULL primary key ,
    MASV varchar(50) references Students(MASV),
    TiengAnh int ,
    TinHoc int ,
    GDTC int ,
);
go
INSERT Users (userName, passWord, role)
    VALUES ('quang', '123', 'admin')
INSERT Users (userName, passWord, role)
    VALUES ('son', '123', 'admin')
INSERT Users (userName, passWord, role)
    VALUES ('thang', '123', 'user')
go
select *
from Users;
go
INSERT students (MASV, HoTen, Email, SoDT, Gioitinh, Diachi, Hinh)
    VALUES ('SV001', N'Cung Tiến Ngà', 'cungnga@gmail.com', '0386611583', 1, N'Quảng Ninh', 'p3.jpg')
INSERT students (MASV, HoTen, Email, SoDT, Gioitinh, Diachi, Hinh)
    VALUES ('SV002', N'Phạm Thị Huyền Vy', 'vyntt81@gmail.com', '0903414749', 0, N'Thái Bình','P1.jpg')
INSERT students (MASV, HoTen, Email, SoDT, Gioitinh, Diachi, Hinh)
    VALUES ('SV003', N'Hoàng Kiểu Trinh', 'trinhhoang250@gmail.com', '0776274144', 0, N'Hà Nội', 'P2.jpg')
go
select *
from Students;
go
insert into Grade (MASV, TiengAnh, TinHoc, GDTC)
    values ('SV001',6,5,8)
insert into Grade (MASV, TiengAnh, TinHoc, GDTC)
    values ('SV002',7,9,6)
insert into Grade (MASV, TiengAnh, TinHoc, GDTC)
    values ('SV003',8,7,10)
go
select *
from Grade;