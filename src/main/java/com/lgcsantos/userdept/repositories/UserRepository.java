package com.lgcsantos.userdept.repositories;

import com.lgcsantos.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}


