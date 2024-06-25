package api.openWeather.currentWeather;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Wind {
    float speed;
    int deg;
    float gust;
}
