package com.example.JPA_app.dao;

import com.example.JPA_app.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("PostgresDao")
public class PersonDataAccessService implements IPersonDao {

    private final IPersonRepository iPersonRepository;

    @Autowired
    public PersonDataAccessService(IPersonRepository iPersonRepository) {
        this.iPersonRepository = iPersonRepository;
    }

    @Override
    public int insertPerson(Person person) {

        iPersonRepository.save(person);
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return iPersonRepository.findAll();
    }

    @Override
    public Optional<Person> selectPeopleById(Long id) {

        Optional<Person> result = iPersonRepository.findById(id);
        return result;
    }

    @Override
    public int deletePersonById(Long id) {
        iPersonRepository.deleteById(id);
        return 0;
    }

    @Override
    public int updatePersonByI(Long id, Person person) {
        return 0;
    }
}
