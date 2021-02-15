//package com.example.JPA_app.dao;
//
//import com.example.JPA_app.model.Person;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//@Repository("TestingDao")
//public class TestPersonDataAccessService {
//
//    private  static List<Person> DB = new ArrayList<>();
//
//    @Override
//    public Long insertPerson( Person person) {
//        DB.add(person);
//        return 1L;
//    }
//
//    @Override
//    public List<Person> selectAllPeople() {
//        return DB;
//    }
//
//    @Override
//    public Optional<Person> selectPeopleById(int id) {
//            Optional<Person> result = DB.stream().filter(person -> person.getId().equals(id)).findFirst();
//        return result;
//    }
//
//    @Override
//    public int deletePersonById(int id) {
//        Optional<Person> selectedPerson = selectPeopleById(id);
//
//        if (selectedPerson.isEmpty()){
//            return 0;
//        } else {
//            DB.remove(selectedPerson.get());
//            return 1;
//        }
//
//    }
//
//    @Override
//    public Long updatePersonByI(Long id, Person person) {
//        Optional<Person> selectedPerson = selectPeopleById(id);
//        Long indexOfSelectedPerson = DB.indexOf(selectedPerson.get());
//
//        if (indexOfSelectedPerson >= 0 ){
//            DB.set(indexOfSelectedPerson, new Person(id, person.getName()));
//        }
//        return 0;
//    }
//}
