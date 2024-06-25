package api.openWeather.currentWeather;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Sys {
//    type": 2,
//            "id": 2012565,
//            "country": "DE",
//            "sunrise": 1716693862,
//            "sunset": 1716751195
    int type;
    int id;
    String country;
    int sunrise;
    int sunset;
}
