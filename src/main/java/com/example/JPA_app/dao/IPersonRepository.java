package com.example.JPA_app.dao;

import com.example.JPA_app.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IPersonRepository extends JpaRepository<Person, Long> {
}
