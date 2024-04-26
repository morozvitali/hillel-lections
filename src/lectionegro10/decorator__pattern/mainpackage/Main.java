package lectionegro10.decorator__pattern.mainpackage;

import lectionegro10.decorator__pattern.ClientRetryDecorator;
import lectionegro10.decorator__pattern.ExternalClient;
import lectionegro10.decorator__pattern.MyApp;
import lectionegro10.decorator__pattern.UserClient;

public class Main {

    public static void main(String[] args) {

        ExternalClient client = new UserClient();
        /*
        обгортаємо  замість простого new MyApp(client)
         */
        new MyApp(new ClientRetryDecorator(client));



    }
}
