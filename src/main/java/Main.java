import Geolocation.GeoService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String url = "https://freegeoip.app/json/";
        try {
            GeoService geoService = new GeoService(url);
            geoService.getCurrentLocation().ifPresent(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

