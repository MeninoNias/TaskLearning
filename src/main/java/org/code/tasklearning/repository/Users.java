package org.code.tasklearning.repository;

import jakarta.persistence.EntityManager;
import org.code.tasklearning.model.User;

import java.io.Serializable;
import java.util.List;

public class Users implements Serializable {

    private EntityManager manager;

    public Users() {

    }

    public Users(EntityManager manager) {
        this.manager = manager;
    }

    public User getById(Long id) {
        return null;
    }

    public List<User> usersSearch(String title){
        return null;
    }

    public User saveUser(User user){
        return null;
    }

    public void deleteUser(User user){

    }
}
