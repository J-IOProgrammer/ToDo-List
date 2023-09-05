package io.jio.todolist.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PersonLoginDto {
    String username;
    String password;
}
