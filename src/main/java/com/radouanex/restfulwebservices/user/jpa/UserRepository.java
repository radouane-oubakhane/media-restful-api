package com.radouanex.restfulwebservices.user.jpa;

import com.radouanex.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
