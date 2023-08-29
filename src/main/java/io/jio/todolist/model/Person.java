package io.jio.todolist.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Person extends BaseEntity{
    private String firstname;
    private String lastname;
    @Column(unique = true)
    private String username;
    private String password;
    private String accessKey;
}
