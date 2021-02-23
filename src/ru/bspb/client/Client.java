package ru.bspb.client;

import java.util.Objects;

public class Client {
    String fio;
    String sex;
    int age;

    public Client(){

    }
    public Client(String fio, String sex, int age){
        this.fio = fio;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client[ " + fio + ", " + sex + ", " + age + " ]";
    }

}
