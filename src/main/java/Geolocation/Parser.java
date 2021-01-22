package Geolocation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.util.Optional;

public class Parser implements IParser {
    /**
     * Создает экземпляр класса UserLocation из его json представления
     *
     * @param json строковое представление объекта
     * @return объект класса UserLocation.
     * Если была передана некорректная json строка, то возвращается Optional.empty().
     */
    public Optional<UserLocation> parse(String json) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        try {
            return Optional.of(gson.fromJson(json, UserLocation.class));
        } catch (JsonSyntaxException ex) {
            return Optional.empty();
        }
    }
}
