package api.openWeather.currentWeather;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Weather {
    int id;
    String main;
    String description;
    String icon;

}
