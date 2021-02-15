package com.example.JPA_app.service;

import com.example.JPA_app.dao.IPersonDao;
import com.example.JPA_app.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final IPersonDao iPersonDao;  // TestPersonDataAccessService class

    @Autowired
    public PersonService(@Qualifier("PostgresDao") IPersonDao iPersonDao) {
        this.iPersonDao = iPersonDao;
    }

    public int addPerson(Person person){
        return iPersonDao.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return iPersonDao.selectAllPeople();
    }

    public Optional<Person> getPersonById(Long id){
        return iPersonDao.selectPeopleById(id);
    }

    public int deletePerson(Long id){
        return iPersonDao.deletePersonById(id);
    }

    public int updatePerson(Long id, String nameUpdate){
        return iPersonDao.updatePersonByI(id, nameUpdate);
    }
}
