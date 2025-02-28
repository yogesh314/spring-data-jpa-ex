package com.yogesh.spring_data_jpa_ex;

import com.yogesh.spring_data_jpa_ex.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);

		s1.setRollNo(1);
		s1.setName("Aman");
		s1.setMarks(99);

		repo.save(s1);

	}

}
