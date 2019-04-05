package com.examples.factory;

public class MacDialog extends Dialog {
    @Override
    public Button createButton() {
        return new MacBtn();
    }
}
