package main.lectionegro10.decorator__pattern;

public interface ExternalClient {
    /*
    Запитує данні у сервера і їх повертає
     */

    Object requestData(int userId) throws Exception;

    /*
    Поверне якіс дані або поверне ексепшн
     */

}
