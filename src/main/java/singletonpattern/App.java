package singletonpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings settings1 = Settings.getInstance();
        Settings settings2;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
            out.writeObject(settings1);
        }

        // 역직렬화시에 인스턴스를 생성할 때에는 생성자를 사용하여 인스턴스를 생성하게 된다.
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
            settings2 = (Settings) in.readObject();
        }

        System.out.println(settings1 == settings2);
    }

}
