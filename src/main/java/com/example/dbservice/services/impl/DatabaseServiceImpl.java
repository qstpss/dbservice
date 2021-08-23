package com.example.dbservice.services.impl;

import com.example.dbservice.dao.ExternalValueRepository;
import com.example.dbservice.dao.entities.ExternalValue;
import com.example.dbservice.services.DatabaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DatabaseServiceImpl implements DatabaseService {

    private final ExternalValueRepository valueRepository;

    @Override
    public void writeValueToDatabase(ExternalValue value) {
        valueRepository.save(value);
    }
}
