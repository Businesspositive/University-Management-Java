package com.managementSystem.v1.Repository;
import com.managementSystem.v1.Entity.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {
    Module findByCode(String code);
}

