package com.example.demoSecurity.repository;

import com.example.demoSecurity.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRolesRepo extends JpaRepository<UserRoles, Long> {
}
