package Geolocation;

import java.util.Optional;

public interface IParser {
    Optional<UserLocation> parse(String json);
}
