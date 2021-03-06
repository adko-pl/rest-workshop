package com.workshop.rest;

public class UserDtoV2 {

    private Long id;
    private String name;

    UserDtoV2() { }

    public UserDtoV2(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User convert() {
        return new User(id, name);
    }
}
