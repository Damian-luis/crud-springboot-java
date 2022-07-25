package com.example.demo.repositorio;

import com.example.demo.person.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface interfacePerson extends CrudRepository<Person,Integer> {

}
