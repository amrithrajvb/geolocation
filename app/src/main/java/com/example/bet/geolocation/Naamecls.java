package com.example.bet.geolocation;

/**
 * Created by BE$T on 08-03-2018.
 */

public class Naamecls {
    public String name;
    public  String number;
    public  String location;
    public  String password;


    /*public Naamecls() {
    }*/


    public Naamecls(String name, String number, String location, String password) {
        this.name = name;
        this.number=number;
        this.location=location;
        this.password=password;


    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}


