package com.managementSystem.v1.Controller;
import com.managementSystem.v1.Entity.Lecturer;
import com.managementSystem.v1.Service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lecturers")
public class LecturerController {
    @Autowired
    private LecturerService lecturerService;

    /**
     * Get all lecturers.
     */
    @GetMapping
    public ResponseEntity<List<Lecturer>> getAllLecturers() {
        List<Lecturer> lecturers = lecturerService.getAllLecturers();
        return ResponseEntity.ok(lecturers);
    }

    /**
     * Get lecturer by ID.
     */
    @GetMapping("/{lecturerId}")
    public ResponseEntity<Lecturer> getLecturerById(@PathVariable Long lecturerId) {
        Lecturer lecturer = lecturerService.getLecturerById(lecturerId);
        return ResponseEntity.ok(lecturer);
    }

    /**
     * Create a new lecturer.
     */
    @PostMapping
    public ResponseEntity<Lecturer> createLecturer(@RequestBody Lecturer lecturer) {
        Lecturer newLecturer = lecturerService.createLecturer(lecturer);
        return ResponseEntity.status(HttpStatus.CREATED).body(newLecturer);
    }

    /**
     * Update an existing lecturer.
     */
    @PutMapping("/{lecturerId}")
    public ResponseEntity<Lecturer> updateLecturer(@PathVariable Long lecturerId, @RequestBody Lecturer updatedLecturer) {
        Lecturer updated = lecturerService.updateLecturer(lecturerId, updatedLecturer);
        return ResponseEntity.ok(updated);
    }

    /**
     * Delete a lecturer by ID.
     */
    @DeleteMapping("/{lecturerId}")
    public ResponseEntity<Void> deleteLecturer(@PathVariable Long lecturerId) {
        lecturerService.deleteLecturer(lecturerId);
        return ResponseEntity.noContent().build();
    }
}
