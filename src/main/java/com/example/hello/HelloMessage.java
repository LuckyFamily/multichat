package com.example.hello;

/**
 * Created by jiangyiming on 12/27/16.
 */
public class HelloMessage {
    private String name;

    public HelloMessage() {
    }
    public HelloMessage(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
