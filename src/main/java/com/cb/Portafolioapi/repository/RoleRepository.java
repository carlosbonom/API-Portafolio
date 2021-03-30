package com.cb.Portafolioapi.repository;

import com.cb.Portafolioapi.models.ERol;
import com.cb.Portafolioapi.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERol name);
}
