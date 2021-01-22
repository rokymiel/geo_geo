package Requests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Optional;

public class RequestSender implements IRequestSender {
    private final IRequest request;

    public RequestSender(IRequest request) {
        this.request = request;
    }

    /**
     * Отправляет запрос.
     *
     * @return ответ на запрос
     * @throws IOException если возникла ошибка при совершении запроса или чтени ответа.
     */
    public String sendRequest() throws IOException {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(request.getRequest()))) {
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            return response.toString();
        }

    }
}
