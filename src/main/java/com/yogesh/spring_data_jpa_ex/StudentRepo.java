package com.yogesh.spring_data_jpa_ex;

import com.yogesh.spring_data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}
