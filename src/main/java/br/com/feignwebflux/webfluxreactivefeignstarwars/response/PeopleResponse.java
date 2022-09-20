package br.com.feignwebflux.webfluxreactivefeignstarwars.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PeopleResponse {

    private String bith_year;
    private String eye_color;
    private List<String> films;
    private String gender;
    private String homeworld;
    private String name;
    private List<String> species;
    private List<String> starships;
    private List<String> vehicles;
}
