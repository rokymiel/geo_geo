package Geolocation;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class UserLocation {//
    @SerializedName("country_name")
    private final String countryName;
    @SerializedName("region_name")
    private final String regionName;
    private final String city;
    private final double latitude;
    private final double longitude;

    public String getCountryName() {
        return countryName;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getCity() {
        return city;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public UserLocation(String countryName, String regionName, String city, double latitude, double longitude) {
        this.countryName = countryName;
        this.regionName = regionName;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Location:\n" +
                "countryName='" + countryName + "\n" +
                "regionName='" + regionName + "\n" +
                "city='" + city + "\n" +
                "latitude=" + latitude + "\n" +
                "longitude=" + longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLocation that = (UserLocation) o;
        return Double.compare(that.getLatitude(), getLatitude()) == 0 &&
                Double.compare(that.getLongitude(), getLongitude()) == 0 &&
                Objects.equals(getCountryName(), that.getCountryName()) &&
                Objects.equals(getRegionName(), that.getRegionName()) &&
                Objects.equals(getCity(), that.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountryName(), getRegionName(), getCity(), getLatitude(), getLongitude());
    }
}

