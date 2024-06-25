package api.openWeather.currentAirPollution;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class List {
    @JsonIgnore
    Main main;
    Components components;
    int dt;
}
