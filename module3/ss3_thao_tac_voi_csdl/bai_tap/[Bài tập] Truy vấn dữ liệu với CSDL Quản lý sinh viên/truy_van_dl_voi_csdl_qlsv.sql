use quanlysinhvien;

-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select StudentName from student where StudentName like 'h%';

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select * from class where month(StartDate) = 12;

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select* from subject;
select * from subject where Credit between 3 and 5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
select * from student;
set SQL_SAFE_UPDATES = 0;
update student set ClassID = 2 where StudentName = 'Hung';
set SQL_SAFE_UPDATES = 1;

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select * from mark;
select st.StudentName, sb.SubName, m.Mark from student st
inner join mark m on  st.StudentId = m.StudentId
inner join subject sb on sb.SubId = m.SubId
order by m.Mark desc, st.StudentName;