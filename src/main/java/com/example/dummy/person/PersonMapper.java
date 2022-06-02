package com.example.dummy.person;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonDto toDto(Person person);

    Person toEntity(PersonDto personDto);
}
