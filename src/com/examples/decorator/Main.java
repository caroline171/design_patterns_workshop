package com.examples.decorator;

public class Main {

    public static void main(String[] args){
        DataSource file = new FileDataSource("file name");
        FileCompressionDecorator compressionDecorator = new FileCompressionDecorator(file);
        file = compressionDecorator.compress();
        FileEncryptionDecorator encryptionDecorator = new FileEncryptionDecorator(file);
        file = encryptionDecorator.encrypt();

        file = new FileCompressionDecorator(
                    (new FileEncryptionDecorator(file)).encrypt()
                ).compress();
    }
}
