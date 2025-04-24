package com.example.uber.controller;

import com.example.uber.model.MovieLocation;
import com.example.uber.service.MovieLocationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieLocationController {

  private final MovieLocationService service;

  public MovieLocationController(MovieLocationService service) {
    this.service = service;
  }

  @GetMapping
  public List<MovieLocation> getAllMovies(@RequestParam Optional<String> title){
    return title.map(service::filterByTitle).orElseGet(service::getAllMovies);
  }

  @GetMapping("/autocomplete")
  public List<String> autoComplete(@RequestParam("q") String prefix){
    return service.autoComplete(prefix);
  }
}