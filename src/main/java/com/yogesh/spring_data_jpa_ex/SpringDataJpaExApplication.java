package com.yogesh.spring_data_jpa_ex;

import com.yogesh.spring_data_jpa_ex.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);

		s1.setRollNo(1);
		s1.setName("Aman");
		s1.setMarks(99);

		Student s2 = context.getBean(Student.class);

		s2.setRollNo(2);
		s2.setName("Rahul");
		s2.setMarks(70);

		repo.save(s1);
		repo.save(s2);

		System.out.println(repo.findAll());				// Fetching all data

		Optional<Student> s = repo.findById(2);  		//using Optional to secure from NPE and findById to find object using primary key
		System.out.println(s.orElse(new Student()));

		System.out.println(repo.findByName("Rahul"));	//This will return list of values coz multiple students can have same name

		System.out.println(repo.findByMarks(99));

		System.out.println(repo.findByMarksGreaterThan(50));

	}

}
