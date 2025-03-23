package com.serdar.customer_service.mapper;

import com.serdar.customer_service.dto.CustomerDto;
import com.serdar.customer_service.dto.MovieDto;
import com.serdar.customer_service.entity.Customer;

import java.util.List;

public class EntityDtoMapper {

    public static CustomerDto toDto(Customer customer, List<MovieDto> movies){
        return new CustomerDto(
                customer.getId(),
                customer.getName(),
                customer.getFavoriteGenre(),
                movies
        );
    }

}