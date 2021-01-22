package Geolocation;

import Requests.IRequest;
import Requests.IRequestSender;
import Requests.LocationRequest;
import Requests.RequestSender;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Optional;

public class GeoService {
    private final IRequest locationRequest;

    /**
     * Создает объект геосервисов.
     *
     * @param apiURL url запроса
     * @throws MalformedURLException если передан некорректный url
     */
    public GeoService(String apiURL) throws MalformedURLException {
        locationRequest = new LocationRequest(apiURL);
    }

    /**
     * Получает текущее местоположение.
     *
     * @return текущее местоположение, если удалось содать объект класса UserLocation.
     * @throws IOException если возникли ошибки при совершении запроса.
     */
    public Optional<UserLocation> getCurrentLocation() throws IOException {
        IRequestSender sender = new RequestSender(locationRequest);
        var response = sender.sendRequest();
        return new Parser().parse(response);

    }
}
