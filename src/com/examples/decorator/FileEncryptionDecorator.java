package com.examples.decorator;

public class FileEncryptionDecorator {
    DataSource file;

    FileEncryptionDecorator(DataSource file){
        this.file = file;
    }

    DataSource encrypt(){
        System.out.println("Processing file compression");
        // file updated
        return file;
    }
}
