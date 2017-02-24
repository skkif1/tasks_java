package HelloImpl.HelloProviderImpl;

import HelloInterfaces.HelloProvider;

import java.io.*;

public class FileProvider implements HelloProvider {

    private String message;

    public String provideHello() {

        int ch;

        try {

            FileInputStream in = new FileInputStream("D:\\hello.txt");
            while ((ch = in.read()) != -1) {
                message += (char) ch;
            }

        } catch (IOException e) {
            System.out.println(e);
            System.out.println("problem with file");
        }
        return message;
    }
}
