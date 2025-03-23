package com.serdar.aws.controller;

import com.serdar.aws.domain.Genre;
import com.serdar.aws.dto.MovieDto;
import com.serdar.aws.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MoviceController {

    private final MovieService service;

    public MoviceController(MovieService
                                   service) {
        this.service = service;
    }

    @GetMapping
    public List<MovieDto> getAll(){
        return this.service.getAll();
    }

    @GetMapping("{genre}")
    public List<MovieDto> getAllByGenre(@PathVariable Genre genre){
        return this.service.getAll(genre);
    }
}
