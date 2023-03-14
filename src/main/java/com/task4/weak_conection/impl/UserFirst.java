package com.task4.weak_conection.impl;

import com.task4.weak_conection.Age;
import com.task4.weak_conection.Name;
import com.task4.weak_conection.Status;
import com.task4.weak_conection.User;

public class UserFirst implements User {
    private Age age;
    private Name name;
    private Status status;
    public UserFirst() {
    }
    public UserFirst(Age age, Name name, Status status) {
        this.age = age;
        this.name = name;
        this.status = status;
    }
    @Override
    public void giveDescription() {
        name.getName();
        age.getAge();
        status.getStatus();

    }

}
