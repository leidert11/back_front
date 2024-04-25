package com.prueba.back_front.domain.repository;

import com.prueba.back_front.persistence.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}
