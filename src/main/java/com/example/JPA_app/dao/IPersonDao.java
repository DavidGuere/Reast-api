package com.example.JPA_app.dao;

import com.example.JPA_app.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IPersonDao {

//    int insertPerson( Person person);

    default int insertPerson(Person person){
        return 1;
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPeopleById(Long id);

    int deletePersonById(Long id);

    int updatePersonByI(Long id, String person);
}
