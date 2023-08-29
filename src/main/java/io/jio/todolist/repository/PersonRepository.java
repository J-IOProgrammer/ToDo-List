package io.jio.todolist.repository;

import io.jio.todolist.dto.PersonLoginDto;
import io.jio.todolist.exceptions.PersonNotFoundException;
import io.jio.todolist.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Objects;

public class PersonRepository {

    private static PersonRepository instance;

    private PersonRepository() {
    }

    public static PersonRepository getInstance() {
        if (instance == null)
            instance = new PersonRepository();
        return instance;
    }

    EntityManager entityManager = EntityManagerFactoryProducer.emf.createEntityManager();

    public Person findByUsername(PersonLoginDto loginDto) {
        Person person;
        entityManager.getTransaction().begin();
        String hql = "from Person where username=:username";
        Query query = entityManager.createQuery(hql, Person.class);
        query.setParameter("username", loginDto.getUsername());
        person = (Person) query.getSingleResult();
        entityManager.getTransaction().commit();
        entityManager.close();
        if (Objects.isNull(person))
            throw new PersonNotFoundException("Username is not true or you have not an account");
        return person;
    }
}
