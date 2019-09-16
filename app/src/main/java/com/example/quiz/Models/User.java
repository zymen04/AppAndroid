package com.example.quiz.Models;

public class User {

        private String Name;

    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "Full name='" + Name + '\'' +
                '}';
    }
}
