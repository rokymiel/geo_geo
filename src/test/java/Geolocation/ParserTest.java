package Geolocation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {
    @Test
    public void parse_with_correct_json() {
        IParser parser = new Parser();
        String json = "{\"country_name\":\"Arstocka\",\"region_name\":\"Rar\",\"city\":\"City-17\",\"latitude\":666,\"longitude\":666}";
        UserLocation location = new UserLocation("Arstocka", "Rar", "City-17", 666, 666);
        var parsedLocation = parser.parse(json);
        Assertions.assertTrue(parsedLocation.isPresent());
        Assertions.assertEquals(location, parsedLocation.get());
    }
    @Test
    public void parse_with_bad_json() {
        IParser parser = new Parser();
        String json = "\"country_name\":\"Arstocka\",\"region_name\":\"Rar\",\"city\":\"City-17\",\"latitude\":666,\"longitude\":666";
        UserLocation location = new UserLocation("Arstocka", "Rar", "City-17", 666, 666);
        var parsedLocation = parser.parse(json);
        Assertions.assertFalse(parsedLocation.isPresent());
    }
}