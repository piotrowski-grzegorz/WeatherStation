package service;

import api.openWeather.currentAirPollution.OWcurrentAirPollutionResponse;
import api.openWeather.currentWeather.OWResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.IOException;

@Getter
@NoArgsConstructor
public class OWService {

    private String url = "https://api.openweathermap.org/data/2.5/weather?lat=50.25965208&lon=19.01806025&lang=pl&appid=449dd40fd82f8653fa2228a555a7d27f&units=metric";
    private String currentPollutionURL = "http://api.openweathermap.org/data/2.5/air_pollution?lat=50.25965208&lon=19.01806025&appid=449dd40fd82f8653fa2228a555a7d27f";
    private HttpClientService<String> httpClientService = new HttpClientService<>();
    private ObjectMapper objectMapper = new ObjectMapper();

    public OWResponse getResponseOWcurrentWeather() throws IOException, InterruptedException {
        String json = httpClientService.getResponse(url);
        OWResponse responseObject = objectMapper.readValue(json, OWResponse.class);
        return responseObject;
    }

    public OWcurrentAirPollutionResponse getResponseOWcurrentAirPollution() throws IOException, InterruptedException {
        String json = httpClientService.getResponse(currentPollutionURL);
        OWcurrentAirPollutionResponse responseObject = objectMapper.readValue(json, OWcurrentAirPollutionResponse.class);
        return responseObject;
    }
    public void getWeatherNowInfo() throws IOException, InterruptedException {;
        System.out.println("Temperature: " + getResponseOWcurrentWeather().getMain().getTemp());
        System.out.println("Feels like..: " + getResponseOWcurrentWeather().getMain().getFeels_like());
        System.out.println("Max temp: " + getResponseOWcurrentWeather().getMain().getTemp_max());
        System.out.println("Min temp: " + getResponseOWcurrentWeather().getMain().getTemp_min());
        System.out.println("Pressure: " + getResponseOWcurrentWeather().getMain().getPressure());
        System.out.println("CLOUDS: " + getResponseOWcurrentWeather().getClouds());
        System.out.println("VISIBILITY: " + getResponseOWcurrentWeather().getVisibility());
        System.out.println("WIND: " + getResponseOWcurrentWeather().getWind());
    }

    public void getAirPollutionInfo() throws IOException, InterruptedException {
        System.out.println(getResponseOWcurrentAirPollution().getList().getFirst().getComponents());
    }
}
