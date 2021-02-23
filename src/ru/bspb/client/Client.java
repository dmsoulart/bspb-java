package ru.bspb.client;

public class Client {
    String fio;
    String sex;
    int age;

    public Client() {

    }

    public Client(String fio, String sex, int age) {
        this.fio = fio;
        this.sex = sex;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String toString() {
        return "Client[ " + fio + ", " + sex + ", " + age + " ]";
    }

    @Override
    public boolean equals(Object o) {
        if (this.fio.equals(o)) {
            return true;
        } else {
            return false;
        }
    }
}

