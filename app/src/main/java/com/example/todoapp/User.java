package com.example.todoapp;

public class User {
    private String id, name, email;

    public User(){

    }
    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void setId(String id) {
    }
}
