package com.managementSystem.v1.Service;
import com.managementSystem.v1.Entity.Course;
import com.managementSystem.v1.Entity.Decision;
import com.managementSystem.v1.Entity.Student;
import com.managementSystem.v1.Repository.CourseRepository;
import com.managementSystem.v1.Repository.DecisionRepository;
import com.managementSystem.v1.Repository.ModuleRepository;
import com.managementSystem.v1.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final DecisionRepository decisionRepository;  // Assuming you have a DecisionRepository
    private final CourseRepository courseRepository;      // Assuming you have a CourseRepository
    private final ModuleRepository moduleRepository;      // Assuming you have a ModuleRepository

    @Autowired
    public StudentService(StudentRepository studentRepository, DecisionRepository decisionRepository,
                          CourseRepository courseRepository, ModuleRepository moduleRepository) {
        this.studentRepository = studentRepository;
        this.decisionRepository = decisionRepository;
        this.courseRepository = courseRepository;
        this.moduleRepository = moduleRepository;
    }

    public Student signup(Student student) {
        // Implement signup logic, e.g., check if email is already registered
        return studentRepository.save(student);
    }

    public Student login(String email, String password) {
        // Implement login logic, validate credentials
        return studentRepository.findByEmailAndPassword(email, password);
    }

    public void updatePassword(Long studentId, String newPassword) {
        // Implement password update logic
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalArgumentException("Student not found"));

        // Update password and save to the database
        student.setPassword(newPassword);
        studentRepository.save(student);
    }

    public List<Course> viewEnrolledCourses(Long studentId) {
        // Implement logic to retrieve and return a list of enrolled courses for the student
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalArgumentException("Student not found"));

        return student.getEnrolledCourses();
    }

    public List<Module> viewEnrolledModules(Long studentId) {
        // Implement logic to retrieve and return a list of enrolled modules for the student
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalArgumentException("Student not found"));

        return student.getEnrolledModules();
    }

    public void downloadModuleMaterial(Long studentId, Long moduleId) {
        // Implement logic to handle downloading module material
        // For example, you might retrieve the file path or download link from the Module entity
        Module module = moduleRepository.findById(moduleId)
                .orElseThrow(() -> new IllegalArgumentException("Module not found"));

        // Implement logic to provide the module material to the student
        // This could involve file handling or returning a download link
    }

    public List<Decision> viewDecisions(Long studentId) {
        // Implement logic to retrieve and return a list of decisions for the student
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalArgumentException("Student not found"));

        return decisionRepository.findByStudent(student);
    }

    // Add other student-specific methods as needed
}

