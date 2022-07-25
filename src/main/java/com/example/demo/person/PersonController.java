package com.example.demo.person;

import com.example.demo.repositorio.interfacePerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(path = "person")
public class PersonController {

    @Autowired
    private interfacePerson interfacePerson;
    @GetMapping
    public List<Person> helloWorld(){
        return (List<Person>) interfacePerson.findAll();
    }
    @PostMapping
    public void agregar(@RequestBody Person persona){
        interfacePerson.save(
                persona
        );

    }

    @PutMapping
    public void modificar(@RequestBody Person persona) {
        interfacePerson.save(
                persona
        );
    }

    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") Integer id){

        interfacePerson.deleteAllById(Collections.singleton(id));
    }


}
