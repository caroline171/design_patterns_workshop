package com.examples.factory;

public abstract class Dialog {
    Button button;
    OS platform;

    public abstract Button createButton();

    public void display(){
        System.out.println(button.name);
    }
}

enum OS {
    MAC,
    LINUX,
    WINDOWS
}