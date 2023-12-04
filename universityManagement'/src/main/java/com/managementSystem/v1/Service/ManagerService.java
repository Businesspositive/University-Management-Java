package com.managementSystem.v1.Service;
import com.managementSystem.v1.Entity.Manager;
import com.managementSystem.v1.Repository.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    private ManagerRepo managerRepository;

    /**
     * Get all managers.
     */
    public List<Manager> getAllManagers() {
        return managerRepository.findAll();
    }

    /**
     * Get manager by ID.
     */
    public Manager getManagerById(Long managerId) {
        return managerRepository.findById(managerId).orElse(null);
    }

    /**
     * Create a new manager.
     */
    public Manager createManager(Manager manager) {
        return managerRepository.save(manager);
    }

    /**
     * Update an existing manager.
     */
    public Manager updateManager(Long managerId, Manager updatedManager) {
        Manager existingManager = managerRepository.findById(managerId).orElse(null);
        if (existingManager != null) {
            // Update fields based on your requirements
            // Update other fields

            managerRepository.save(existingManager);
        }
        return existingManager;
    }

    /**
     * Delete a manager by ID.
     */
    public void deleteManager(Long managerId) {
        managerRepository.deleteById(managerId);
    }
}
