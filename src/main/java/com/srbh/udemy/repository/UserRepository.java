package com.srbh.udemy.repository;

import com.srbh.udemy.entity.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
