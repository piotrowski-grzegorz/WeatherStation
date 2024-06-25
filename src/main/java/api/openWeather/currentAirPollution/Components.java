package api.openWeather.currentAirPollution;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class Components {
    float co;
    float no;
    float no2;
    float o3;
    float so2;
    float pm2_5;
    float pm10;
    float nh3;
}
