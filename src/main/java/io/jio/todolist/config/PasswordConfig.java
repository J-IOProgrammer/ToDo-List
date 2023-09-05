package io.jio.todolist.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordConfig {
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
