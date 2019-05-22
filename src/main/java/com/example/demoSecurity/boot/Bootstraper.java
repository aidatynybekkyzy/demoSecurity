package com.example.demoSecurity.boot;

import com.example.demoSecurity.entity.User;
import com.example.demoSecurity.entity.UserRoles;
import com.example.demoSecurity.repository.UserRepo;
import com.example.demoSecurity.repository.UserRolesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Bootstraper implements CommandLineRunner {

    @Autowired
    private UserRepo userRepository;

    @Autowired
    private UserRolesRepo userRolesRepository;

    @Override
    public void run(String... args) throws Exception {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        User user1 = new User("aida",  passwordEncoder.encode("123"), 1);
        userRepository.save(user1);

        User user2 = new User("another", passwordEncoder.encode("456"), 0);
        userRepository.save(user2);

        UserRoles userRoles1 = new UserRoles(user1, "ADMIN");
        userRolesRepository.save(userRoles1);

        UserRoles userRoles2 = new UserRoles(user2, "USER");
        userRolesRepository.save(userRoles2);

    }
}
