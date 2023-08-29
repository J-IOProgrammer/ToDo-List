package io.jio.todolist.services;

import io.jio.todolist.dto.PersonLoginDto;
import io.jio.todolist.model.Person;
import io.jio.todolist.repository.PersonRepository;

public class PersonService {
    PersonRepository personRepository = PersonRepository.getInstance();

    public Person singIn(PersonLoginDto loginDto) {
        return personRepository.findByUsername(loginDto);
    }
}
