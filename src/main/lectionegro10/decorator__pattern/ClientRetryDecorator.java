package main.lectionegro10.decorator__pattern;

public class ClientRetryDecorator implements ExternalClient {

    /*
    Кількість спроб отримання даних
     */

    private static final int RETRY_AMOUNT = 5;

    /*
    клас декоратор
    1. імплементує інтерфейс для цього клієнта (ExternalClient)
    2. в ньому буде посилання на цього клієнта
     */
    private ExternalClient client;

    public ClientRetryDecorator (ExternalClient client) {
        this.client = client;
    }

    @Override
    public Object requestData(int userId) throws Exception {
        int retries = RETRY_AMOUNT;
        while (retries > 0) {


            try {
                client.requestData(userId);
            } catch (Exception e){
                retries --;
            }
        }

        throw new Exception();
    }
}
