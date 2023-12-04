package com.managementSystem.v1.Service;
import com.managementSystem.v1.Entity.Lecturer;
import com.managementSystem.v1.Repository.LecturerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LecturerService {
    @Autowired
    private LecturerRepo lecturerRepository;

    /**
     * Get all lecturers.
     */
    public List<Lecturer> getAllLecturers() {
        return lecturerRepository.findAll();
    }

    /**
     * Get lecturer by ID.
     */
    public Lecturer getLecturerById(Long lecturerId) {
        return lecturerRepository.findById(lecturerId).orElse(null);
    }

    /**
     * Create a new lecturer.
     */
    public Lecturer createLecturer(Lecturer lecturer) {
        return lecturerRepository.save(lecturer);
    }

    /**
     * Update an existing lecturer.
     */
    public Lecturer updateLecturer(Long lecturerId, Lecturer updatedLecturer) {
        Lecturer existingLecturer = lecturerRepository.findById(lecturerId).orElse(null);
        if (existingLecturer != null) {
            // Update fields based on your requirements
            existingLecturer.setQualification(updatedLecturer.getQualification());
            // Update other fields

            lecturerRepository.save(existingLecturer);
        }
        return existingLecturer;
    }

    /**
     * Delete a lecturer by ID.
     */
    public void deleteLecturer(Long lecturerId) {
        lecturerRepository.deleteById(lecturerId);
    }
}
