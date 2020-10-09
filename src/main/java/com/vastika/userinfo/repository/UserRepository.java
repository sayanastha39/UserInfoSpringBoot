package com.vastika.userinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vastika.userinfo.model.User;

@Repository
public interface UserRepository extends JpaRepository <User, Integer>{

}
