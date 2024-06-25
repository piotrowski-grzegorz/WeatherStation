package api.openWeather.currentAirPollution;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
public class OWcurrentAirPollutionResponse {
    @JsonIgnore
    Coord coord;
    List<api.openWeather.currentAirPollution.List> list;
}
