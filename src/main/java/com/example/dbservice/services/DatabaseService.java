package com.example.dbservice.services;

import com.example.dbservice.dao.entities.ExternalValue;

public interface DatabaseService {
    void writeValueToDatabase(ExternalValue value);
}
