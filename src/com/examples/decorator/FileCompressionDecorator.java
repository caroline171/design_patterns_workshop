package com.examples.decorator;

public class FileCompressionDecorator {
    DataSource file;

    FileCompressionDecorator(DataSource file){
        this.file = file;
    }

    DataSource compress(){
        System.out.println("Processing file compression");
        // file updated
        return file;
    }
}
