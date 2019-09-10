package com.kodilla.good.patterns.food2Door2;

public class User {
    private String firstName;
    private String surname;
    private String userName;
    private String address;
    private String email;

    public User(String firstName, String surname, String userName, String address, String email) {
        this.firstName = firstName;
        this.surname = surname;
        this.userName = userName;
        this.address = address;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
