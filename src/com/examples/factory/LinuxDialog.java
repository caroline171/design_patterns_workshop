package com.examples.factory;

public class LinuxDialog extends Dialog {
    @Override
    public Button createButton() {
        return new LinuxBtn();
    }
}
