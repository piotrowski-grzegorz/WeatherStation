package api.openWeather.currentWeather;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class OWResponse {
    @JsonIgnore
    private Coord coord;
    private List<Weather> weather;
    private String base;
    private Main main;
    private String visibility;
    private int dt;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;
    private Wind wind;
    private Clouds clouds;
    @JsonIgnore
    private Rain rain;

public OWResponse(){};
}
