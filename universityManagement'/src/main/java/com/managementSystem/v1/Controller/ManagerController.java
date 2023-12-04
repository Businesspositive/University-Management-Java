package com.managementSystem.v1.Controller;
import com.managementSystem.v1.Entity.Manager;
import com.managementSystem.v1.Service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/managers")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    /**
     * Get all managers.
     */
    @GetMapping
    public ResponseEntity<List<Manager>> getAllManagers() {
        List<Manager> managers = managerService.getAllManagers();
        return ResponseEntity.ok(managers);
    }

    /**
     * Get manager by ID.
     */
    @GetMapping("/{managerId}")
    public ResponseEntity<Manager> getManagerById(@PathVariable Long managerId) {
        Manager manager = managerService.getManagerById(managerId);
        return ResponseEntity.ok(manager);
    }

    /**
     * Create a new manager.
     */
    @PostMapping
    public ResponseEntity<Manager> createManager(@RequestBody Manager manager) {
        Manager newManager = managerService.createManager(manager);
        return ResponseEntity.status(HttpStatus.CREATED).body(newManager);
    }

    /**
     * Update an existing manager.
     */
    @PutMapping("/{managerId}")
    public ResponseEntity<Manager> updateManager(@PathVariable Long managerId, @RequestBody Manager updatedManager) {
        Manager updated = managerService.updateManager(managerId, updatedManager);
        return ResponseEntity.ok(updated);
    }

    /**
     * Delete a manager by ID.
     */
    @DeleteMapping("/{managerId}")
    public ResponseEntity<Void> deleteManager(@PathVariable Long managerId) {
        managerService.deleteManager(managerId);
        return ResponseEntity.noContent().build();
    }
}
