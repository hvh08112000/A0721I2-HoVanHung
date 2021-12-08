use quanlysinhvien;

select * from subject;
select * from mark;
select * from student;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * from subject order by Credit desc limit 1;

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select sb.SubId, sb.SubName, m.Mark from subject sb, mark m
where m.SubId = sb.SubId
order by m.Mark desc
limit 1;

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select s.StudentId, s.StudentName, avg(m.Mark) as DTB from student s, mark m
where s.StudentId = m.StudentId
group by s.StudentId
order by DTB;