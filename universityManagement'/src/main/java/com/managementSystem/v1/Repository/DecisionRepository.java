package com.managementSystem.v1.Repository;
import com.managementSystem.v1.Entity.Decision;
import com.managementSystem.v1.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DecisionRepository extends JpaRepository<Decision, Long> {

    List<Decision> findByStudent(Student student);
}

