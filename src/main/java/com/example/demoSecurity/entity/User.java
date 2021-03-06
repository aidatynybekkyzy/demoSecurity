package com.example.demoSecurity.entity;

import javax.persistence.*;

@Entity
@Table(name = "a_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Column(name = "login", nullable = false, unique = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "is_enabled", nullable = false,
            columnDefinition = "integer default 1")
    private int enabled;

    public User() {
    }

    public User(Long id, String login, String password, int enabled) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.enabled = enabled;
    }

    public User(String login, String password, int enabled) {
        this.login = login;
        this.password = password;
        this.enabled = enabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }
}
