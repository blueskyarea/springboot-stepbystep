package com.itstudy365.step03dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itstudy365.step03dataaccess.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
