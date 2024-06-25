package api.openWeather.currentWeather;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coord {
    float lon;
    float lat;
}
