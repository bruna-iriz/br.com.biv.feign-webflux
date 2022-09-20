package br.com.feignwebflux.webfluxreactivefeignstarwars.controller;

import br.com.feignwebflux.webfluxreactivefeignstarwars.client.StarWarsFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import br.com.feignwebflux.webfluxreactivefeignstarwars.response.FilmsResponse;
import br.com.feignwebflux.webfluxreactivefeignstarwars.response.PeopleResponse;

@RestController
@AllArgsConstructor
@RequestMapping("v1/reactive-feign")
public class StarWarsController {

    StarWarsFeignClient starWarsFeignClient;

    @GetMapping("/person/{id}")
    public Mono<PeopleResponse> findPersonById(@PathVariable String id) {
        return starWarsFeignClient.getPeopleById(id);
    }

    @GetMapping("/movie/{id}")
    public Mono<FilmsResponse> findMovieById(@PathVariable String id) {
        return starWarsFeignClient.getFilmById(id);
    }
}
