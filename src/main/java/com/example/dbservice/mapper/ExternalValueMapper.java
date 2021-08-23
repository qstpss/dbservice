package com.example.dbservice.mapper;

import com.example.dbservice.dao.entities.ExternalValue;
import com.example.dbservice.rest.model.ExternalValueDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExternalValueMapper {
    ExternalValue dtoToEntity(ExternalValueDto dto);
}
