package com.sprilutsky.firebasesample.data.models;

/**
 * Created by Sergey Prilutsky on 09.02.16.
 */
public class User implements IModel {

    @SerializeName(fieldName = "user_id")
    private int userId;

    @SerializeName(fieldName = "first_name")
    private String firstName;

    @SerializeName(fieldName = "last_name")
    private String lastName;

    @SerializeName(fieldName = "email")
    private String email;

    @SerializeName(fieldName = "password")
    private String password;

    @SerializeName(fieldName = "location")
    private String location;

    @SerializeName(fieldName = "color_scheme")
    private String colorScheme;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getColorScheme() {
        return colorScheme;
    }

    public void setColorScheme(String colorScheme) {
        this.colorScheme = colorScheme;
    }
}
