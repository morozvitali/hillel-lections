package main.userfilerepo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class UserFileStoreRepo {

    public void save (User user) {

        // Буферизований метод, зберігає запис про юзера у файлі

        try {

            FileOutputStream file = new FileOutputStream("text.txt");
            PrintWriter print = new PrintWriter(file);
            print.write(String.format( "%s", user.name));
            print.flush();
            print.close();

        } catch (FileNotFoundException e) {
            // не виштовхуйте ексепшн назовні
        }
    }
}


class User {
    String name = "Boby";
}