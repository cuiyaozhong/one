package com.example.one.anonymous;

/**
 * @author 崔耀中
 * @since 2020-12-19
 */
public abstract class Dog {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int eat();
}
