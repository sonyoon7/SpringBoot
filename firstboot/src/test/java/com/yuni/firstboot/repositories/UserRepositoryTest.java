package com.yuni.firstboot.repositories;

import com.yuni.firstboot.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;
    @Test
    public void name() {
        assertEquals("hello","hello");
    }

    @Test
    public void save() {
        User user = new User("yuni","1234","yuni");
        assertEquals(0, userRepository.count());
        userRepository.save(user);
        assertEquals(1, userRepository.count());
        userRepository.deleteById(user.getId());
        assertEquals(0, userRepository.count());

    }

    @Test
    public void select() {
        User user = new User("yuni","1234","yuni");
        userRepository.save(user);
        System.out.println(userRepository.findById(user.getId()));
    }
}