package com.webservice.WebServiceSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.WebServiceSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
