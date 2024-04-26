package main.lectionegro10.decorator__pattern;

public class MyApp {

    private ExternalClient client;

    public MyApp (ExternalClient client) {
        this.client = client;
    }

    public void doSmthng () {

        try {
            Object o = client.requestData(1);
        } catch (Exception e) {
            throw new RuntimeException(e);


        }


    }


}
