package com.sda.write_object_to_file;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Config configuration = new Config();

        WeatherService weatherService = new WeatherService(configuration.loadProperties().getUrl(), configuration.loadProperties().getKey());

                /*"http://api.apixu.com/v1/current.json",
                "336d39b18670470196780108180709"*/
        weatherService.getCityWeather("paris");

        List<Weather> weathers = new ArrayList<>();

        weathers.add(new Weather("Poznan", "www", 24.00, 25.00, "cloudy", 34.35, 12.56));
        weathers.add(new Weather("Wroclaw", "www", 13.00, 10.00, "sunny", 34.54, 13.90));
        weathers.add(new Weather("Bydgoszcz", "www", 20.00, 21.00, "rainy", 52.00, 34.00));
        weathers.add(new Weather("Gdansk", "www", 7.00, 7.00, "cloudy", 23.00, 34.89));
        weathers.add(new Weather("Warszawa", "www", 15.00, 12.00, "windy", 40.00, 32.00));

        Weather weather = new Weather(
                "Torun",
                "www",
                40.00,
                60.00,
                "sunny",
                54.54,
                21.23
        );

        ObjectMapper objectMapper = new ObjectMapper();
        File filename = new File("weather.json");
        try {
            objectMapper.writeValue(filename, weathers);
            // objectMapper.writeValue(filename, weather);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Weather[] readWeather = objectMapper.readValue(filename, Weather[].class);

            for (Weather w : readWeather) {
                System.out.println(w.getCity());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Config.saveConfiguration();
    }
}
