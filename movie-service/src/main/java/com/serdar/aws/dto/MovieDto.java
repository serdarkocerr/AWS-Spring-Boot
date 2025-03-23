package com.serdar.aws.dto;

import com.serdar.aws.domain.Genre;

public record MovieDto(Integer id,
                       String title,
                       Integer releaseYear,
                       Genre genre) {
}
