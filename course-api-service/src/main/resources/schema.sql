DROP TABLE IF EXISTS courses;

CREATE TABLE `courses` (
 `course_id` int(11) NOT NULL AUTO_INCREMENT,
 `course_code` varchar(5) NOT NULL,
 `course_name` varchar(200) NOT NULL,
 PRIMARY KEY (`course_id`)
 );