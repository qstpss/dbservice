package com.example.dbservice.rest.controllers.impl;

import com.example.dbservice.mapper.ExternalValueMapper;
import com.example.dbservice.rest.controllers.DatabaseController;
import com.example.dbservice.rest.model.ExternalValueDto;
import com.example.dbservice.services.DatabaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/db")
@RequiredArgsConstructor
public class DatabaseControllerImpl implements DatabaseController {

    private final DatabaseService dbService;
    private final ExternalValueMapper valueMapper;

    @Override
    @PostMapping("/value")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveExternalValue(@RequestBody ExternalValueDto dto) {
        dbService.writeValueToDatabase(valueMapper.dtoToEntity(dto));
    }

}
