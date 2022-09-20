package br.com.feignwebflux.webfluxreactivefeignstarwars.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Mono;
import response.FilmsResponse;
import response.PeopleResponse;

@ReactiveFeignClient(url = "https://swapi.dev.api/", name = "star-wars")
public interface StarWarsFeignClient {

    @GetMapping("/people/{id}")
    Mono<PeopleResponse> getPeopleById(@RequestParam(value = "id") String id);

    @GetMapping("/movie/{id}")
    Mono<FilmsResponse> getFilmById(@RequestParam(value = "id") String id);
}
