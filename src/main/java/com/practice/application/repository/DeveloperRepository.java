package com.practice.application.repository;

import com.practice.application.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<Developer, String> {
}
