package com.serdar.customer_service.dto;

import com.serdar.customer_service.domain.Genre;

public record MovieDto(Integer id,
                       String title,
                       Integer releaseYear,
                       Genre genre) {
}