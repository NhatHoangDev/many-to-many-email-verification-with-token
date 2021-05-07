package com.example.manytomanyemailverificationwithtoken.repository;

import com.example.manytomanyemailverificationwithtoken.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    List<User> findByEmail(String email);

}
