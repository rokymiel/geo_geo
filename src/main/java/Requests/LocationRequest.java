package Requests;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class LocationRequest implements IRequest {
    private final URL url;
    private final String REQUEST_METHOD = "GET";

    /**
     * Создает запрос местоположения.
     *
     * @param urlString url запроса
     * @throws MalformedURLException если передан некорректный url
     */
    public LocationRequest(String urlString) throws MalformedURLException {
        url = new URL(urlString);
    }

    /**
     * Возвращает входной поток, который читает из запроса.
     *
     * @return входной поток, который читает из запроса
     * @throws IOException если возникла ошибка при открытии соединения или создания входного потока.
     */
    public InputStream getRequest() throws IOException {
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(REQUEST_METHOD);
        return connection.getInputStream();

    }
}
