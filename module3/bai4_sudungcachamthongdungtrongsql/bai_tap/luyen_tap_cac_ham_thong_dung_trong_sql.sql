CREATE DATABASE QuanLySinhVien;
use QuanLySinhVien;
CREATE TABLE Class
(
    ClassID   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ClassName VARCHAR(60) NOT NULL,
    StartDate DATETIME    NOT NULL,
    Status    BIT
);
CREATE TABLE Student
(
    StudentId   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    StudentName VARCHAR(30) NOT NULL,
    Address     VARCHAR(50),
    Phone       VARCHAR(20),
    Status      BIT,
    ClassId     INT         NOT NULL,
    FOREIGN KEY (ClassId) REFERENCES Class (ClassID)
);
CREATE TABLE Subject
(
    SubId   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    SubName VARCHAR(30) NOT NULL,
    Credit  TINYINT     NOT NULL DEFAULT 1 CHECK ( Credit >= 1 ),
    Status  BIT                  DEFAULT 1
);
CREATE TABLE Mark
(
    MarkId    INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    SubId     INT NOT NULL,
    StudentId INT NOT NULL,
    Mark      FLOAT   DEFAULT 0 CHECK ( Mark BETWEEN 0 AND 100),
    ExamTimes TINYINT DEFAULT 1,
    UNIQUE (SubId, StudentId),
    FOREIGN KEY (SubId) REFERENCES Subject (SubId),
    FOREIGN KEY (StudentId) REFERENCES Student (StudentId)
);
select * from Class;
insert into Mark
values (1,2,1,8.3,1);
insert into Mark
values (2,2,2,9.3,1);
select * from Mark;
insert into Mark
values (3,2,3,9.0,1);
insert into Mark
values (4,1,1,7.0,1);
insert into Mark
values (5,3,1,5.0,1);
insert into Mark
values (6,3,4,5.5,1);
insert into Mark
values (7,4,4,8.5,1);
insert into Mark
values (8,4,5,4.5,1);
select * from Subject;
INSERT INTO Class
VALUES (1, 'A1', '2008-12-20', 1);
INSERT INTO Class
VALUES (2, 'A2', '2008-12-22', 1);
INSERT INTO Class
VALUES (3, 'B3', current_date, 0);
INSERT INTO Subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO Student (StudentName, Address, Status, ClassId)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);
SELECT *
FROM Student;
SELECT *
FROM Student
WHERE Status = true;
SELECT *
FROM Subject
WHERE Credit < 10;
SELECT S.StudentId, S.StudentName, C.ClassName
FROM Student S join Class C on S.ClassId = C.ClassID;
SELECT S.StudentId, S.StudentName, Sub.SubName, M.Mark
FROM Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId
WHERE Sub.SubName = 'CF';
-- bai 3------------------------------------------------
select * from Student where StudentName LIKE 'H%';
select * from Student;

select * from Class;
select * from Class where month(StartDate)=12;
select * from Subject;
select * from Subject where Subject.Credit between 3 and 5;
SET SQL_SAFE_UPDATES = 0;
 update Student set ClassId = 2 where StudentName = 'Hung';
 select Student.StudentName, Subject.SubName, Mark.Mark from Student,Subject,Mark where Student.StudentID = Mark.StudentID and Subject.SubId = Mark.SubId order by Mark.Mark ASC, Student.StudentName DESC;
 select * from Mark;
 -- bai 4-thuchanh------------------------------------------------
 SELECT Address, COUNT(StudentId) AS 'Số lượng học viên'
FROM Student
GROUP BY Address;

SELECT S.StudentId,S.StudentName, AVG(Mark)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName;

SELECT S.StudentId,S.StudentName, AVG(Mark)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName
HAVING AVG(Mark) > 15;

SELECT S.StudentId, S.StudentName, AVG(Mark)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName;

SELECT S.StudentId, S.StudentName, AVG(Mark)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName
HAVING AVG(Mark) >= ALL (SELECT AVG(Mark) FROM Mark GROUP BY Mark.StudentId);
-- bai 4 - bai_tap-----------------------------------------
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * ,MAX(Credit) from Subject group by Subject.SubName having MAX(Credit) = ALL (select MAX(Credit) from Subject) ;
-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select * from Subject; 
select * from Subject left join Mark on Subject.SubId = Mark.SubId having MAX(Mark.Mark) = ALL(select Max(Mark) from Mark);
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select Student.StudentId,StudentName, AVG(Mark.Mark) as diem_trung_binh from Student left join Mark on Student.StudentId = Mark.StudentId group by Student.StudentName order by diem_trung_binh DESC;