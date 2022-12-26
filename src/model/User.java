package model;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String username;
    private String password;
    private boolean isActive; // default is false


    public User() {
        this.id = UUID.randomUUID();
    }

    public User(String name, String username, String password) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.username = username;
        this.password = password;
        this.isActive = true;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
