package ru.netology.library;

public abstract class User {
    private String name;
    private int age;

    protected User(String name, int age) {
        this.setName(name);
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.getName();
    }
}
