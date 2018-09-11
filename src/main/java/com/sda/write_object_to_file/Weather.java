package com.sda.write_object_to_file;

public class Weather {

    private String city;
    private String iconUrl;
    private double temperature;
    private double feelsLikeC;
    private String conditionText;
    private double lat;
    private double lon;

    public Weather() {
    }

    @Override
    public String toString() {
        return "Weather {" +
                "city='" + city + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                ", temperature=" + temperature +
                ", feelsLikeC=" + feelsLikeC +
                ", conditionText='" + conditionText + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }

    public Weather(String city, String iconUrl, double temperature, double feelsLikeC, String conditionText, double lat, double lon) {
        this.city = city;
        this.iconUrl = iconUrl;
        this.temperature = temperature;
        this.feelsLikeC = feelsLikeC;
        this.conditionText = conditionText;
        this.lat = lat;
        this.lon = lon;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getFeelsLikeC() {
        return feelsLikeC;
    }

    public void setFeelsLikeC(double feelsLikeC) {
        this.feelsLikeC = feelsLikeC;
    }

    public String getConditionText() {
        return conditionText;
    }

    public void setConditionText(String conditionText) {
        this.conditionText = conditionText;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
