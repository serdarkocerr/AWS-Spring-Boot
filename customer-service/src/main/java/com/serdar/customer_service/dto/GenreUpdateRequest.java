package com.serdar.customer_service.dto;

import com.serdar.customer_service.domain.Genre;

public record GenreUpdateRequest(Genre favoriteGenre) {
}