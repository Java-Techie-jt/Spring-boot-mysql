package com.javatechie.spring.mysql.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.javatechie.spring.mysql.api.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
