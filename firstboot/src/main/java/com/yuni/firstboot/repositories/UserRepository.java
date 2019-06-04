package com.yuni.firstboot.repositories;

import com.yuni.firstboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
