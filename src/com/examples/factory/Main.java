package com.examples.factory;

public class Main {
    public static void main(String[] args){
        Dialog dialog = new WindowsDialog();
        Button btn = dialog.createButton();
        System.out.println(btn.name);
    }
}
