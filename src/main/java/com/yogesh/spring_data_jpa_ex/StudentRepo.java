package com.yogesh.spring_data_jpa_ex;

import com.yogesh.spring_data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    @Query("select s from Student s where s.name = ?1")             //This is JPA Query not sql here s is object and Student is class name and after ? -> 1 means take first parameter
    List<Student> findByName(String name);

    List<Student> findByMarks(int marks);                         //The good thing is that for class variable we can use functions without Query

    List<Student> findByMarksGreaterThan(int marks);
}
