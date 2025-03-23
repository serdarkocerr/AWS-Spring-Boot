package com.serdar.aws.service;

import com.serdar.aws.domain.Genre;
import com.serdar.aws.dto.MovieDto;
import com.serdar.aws.mapper.EntityDtoMapper;
import com.serdar.aws.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    private final MovieRepository repository;

    public MovieService(MovieRepository repository){
        this.repository=repository;
    }

    public List<MovieDto> getAll(){
        return  this.repository.findAll()
                .stream().map(EntityDtoMapper::toDto).toList();
    }

    public List<MovieDto> getAll(Genre genre) {
        return this.repository.findByGenre(genre)
                .stream()
                .map(EntityDtoMapper::toDto)
                .toList();
    }
}
