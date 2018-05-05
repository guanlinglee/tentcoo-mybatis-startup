CREATE TABLE tb_class (
	f_class_id VARCHAR(32) PRIMARY KEY,
	f_class_name VARCHAR(64)
);

CREATE TABLE tb_student (
	f_student_number VARCHAR(32) PRIMARY KEY,
	f_student_name  VARCHAR(64),
	f_class_id VARCHAR(32),
	CONSTRAINT fk_student_class FOREIGN KEY (f_class_id) REFERENCES tb_class(f_class_id)
);