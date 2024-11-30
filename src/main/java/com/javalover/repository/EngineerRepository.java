package com.javalover.repository;

import com.javalover.entity.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineerRepository extends JpaRepository<Engineer, Integer> {
}
