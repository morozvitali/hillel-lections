package main.lectionegro10.decorator__pattern.mainpackage;

import main.lectionegro10.decorator__pattern.ClientRetryDecorator;
import main.lectionegro10.decorator__pattern.ExternalClient;
import main.lectionegro10.decorator__pattern.MyApp;
import main.lectionegro10.decorator__pattern.UserClient;

public class Main {

    public static void main(String[] args) {

        ExternalClient client = new UserClient();
        /*
        обгортаємо  замість простого new MyApp(client)
         */
        new MyApp(new ClientRetryDecorator(client));



    }
}
