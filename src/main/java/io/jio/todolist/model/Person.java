package io.jio.todolist.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Person extends BaseEntity{
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String accessKey;
}
