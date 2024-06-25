package api.openWeather.currentWeather;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Main {
    float temp;
    float feels_like;
    float temp_min;
    float temp_max;
    float pressure;
    float sea_level;
    float grnd_level;
    float humidity;
    float temp_kf;

}
