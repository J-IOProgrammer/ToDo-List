package io.jio.todolist.repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryProducer {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
}

