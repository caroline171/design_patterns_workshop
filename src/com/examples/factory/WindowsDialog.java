package com.examples.factory;

public class WindowsDialog extends Dialog {


    @Override
    public Button createButton() {
        return new WindowsBtn();
    }
}
