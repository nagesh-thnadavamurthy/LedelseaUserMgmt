package com.ledelsea.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ledelsea.user.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}