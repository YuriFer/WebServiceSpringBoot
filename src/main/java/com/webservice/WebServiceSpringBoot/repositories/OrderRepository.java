package com.webservice.WebServiceSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.WebServiceSpringBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
