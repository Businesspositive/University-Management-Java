package com.managementSystem.v1.Controller;
import com.managementSystem.v1.Entity.Student;
import com.managementSystem.v1.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/signup")
    public Student signup(@RequestBody Student student) {
        return studentService.signup(student);
    }

    @PostMapping("/login")
    public Student login(@RequestParam String email, @RequestParam String password) {
        return studentService.login(email, password);
    }

    @PutMapping("/{studentId}/update-password")
    public void updatePassword(@PathVariable Long studentId, @RequestParam String newPassword) {
        studentService.updatePassword(studentId, newPassword);
    }

    @GetMapping("/{studentId}/enrolled-courses")
    public List<Course> viewEnrolledCourses(@PathVariable Long studentId) {
        return studentService.viewEnrolledCourses(studentId);
    }

    @GetMapping("/{studentId}/enrolled-modules")
    public List<Module> viewEnrolledModules(@PathVariable Long studentId) {
        return studentService.viewEnrolledModules(studentId);
    }

    @GetMapping("/{studentId}/download-module-material/{moduleId}")
    public void downloadModuleMaterial(@PathVariable Long studentId, @PathVariable Long moduleId) {
        studentService.downloadModuleMaterial(studentId, moduleId);
    }

    @GetMapping("/{studentId}/view-decisions")
    public List<Decision> viewDecisions(@PathVariable Long studentId) {
        return studentService.viewDecisions(studentId);
    }

    // Add other endpoints for student-related HTTP requests
}

