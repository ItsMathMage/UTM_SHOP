package com.utm.utmshop;

import java.io.Serializable;

public class User implements Serializable {
    private String email = "";
    private String login = "";
    private String password = "";
    private String id = "";

    public Basket basket = new Basket();

    public User() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public Basket getBasket() { return basket; }

    public void setBasket(Basket basket) { this.basket = basket; }
}
