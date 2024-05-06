package com.kevinDev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevinDev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
