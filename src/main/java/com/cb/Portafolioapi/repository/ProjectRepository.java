package com.cb.Portafolioapi.repository;

import com.cb.Portafolioapi.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository  extends JpaRepository<Project, Long> {

    Optional<Project> findByName(String name);

    Boolean existsByName(String name);
}
