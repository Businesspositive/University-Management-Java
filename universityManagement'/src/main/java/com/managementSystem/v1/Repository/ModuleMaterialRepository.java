package com.managementSystem.v1.Repository;
import com.managementSystem.v1.Entity.ModuleMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleMaterialRepository extends JpaRepository<ModuleMaterial, Long> {
}

