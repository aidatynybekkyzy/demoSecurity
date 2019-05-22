package com.example.demoSecurity.entity;

import javax.persistence.*;

@Entity
@Table(name = "userRoles")
public class UserRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User users;

    @Column(name = "role", nullable = false, length = 100)
    private String role;

    public UserRoles() {
    }

    public UserRoles(User users, String role) {
        this.users = users;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
