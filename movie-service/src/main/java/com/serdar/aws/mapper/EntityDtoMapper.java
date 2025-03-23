package com.serdar.aws.mapper;

import com.serdar.aws.dto.MovieDto;
import com.serdar.aws.entity.Movie;

public class EntityDtoMapper {

    public static MovieDto toDto(Movie movie){


        return  new MovieDto(
                movie.getId(),
                movie.getTitle(),
                movie.getReleaseYear(),
                movie.getGenre()
        );
    }
}
