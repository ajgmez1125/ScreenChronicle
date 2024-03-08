package org.humber.project.controllers;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import org.humber.project.domain.Movie;

@Controller
public class MVCController
{
    private RestTemplate restTemplate;

    public MVCController(RestTemplateBuilder restTemplate)
    {
        this.restTemplate = restTemplate.build();
    }

    @GetMapping()
    public String homepage(Model model)
    {
        ResponseEntity<Movie[]> moviesResponse = restTemplate.getForEntity("http://localhost:8000/rest/movie", Movie[].class);
        Movie[] movies = moviesResponse.getBody();
        model.addAttribute("movies", movies);
        //System.out.println(model.toString());
        return "index";
    }
}
