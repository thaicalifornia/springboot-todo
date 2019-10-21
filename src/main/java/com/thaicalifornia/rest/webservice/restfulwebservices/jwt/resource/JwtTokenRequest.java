package com.thaicalifornia.rest.webservice.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    //"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtaWNoZWxlIiwiZXhwIjoxNTcyMjE5MjA3LCJpYXQiOjE1NzE2MTQ0MDd9.RtYriOJz0ne9bhXhShP49qJ2YWdZDoccHDgmqyEE7O3jQFodGf2R4lvtG-dKqfaE1SZ1YiOIgDbz4SS_PAX7Ow"

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

