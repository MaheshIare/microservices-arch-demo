DROP TABLE IF EXISTS courses;

CREATE TABLE `students` (
 `student_id` int(11) NOT NULL AUTO_INCREMENT,
 `student_name` varchar(200) NOT NULL,
 `student_email` varchar(200) NOT NULL,
 `course_code` varchar(5) NOT NULL,
 PRIMARY KEY (`student_id`)
 );