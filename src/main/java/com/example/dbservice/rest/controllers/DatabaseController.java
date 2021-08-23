package com.example.dbservice.rest.controllers;

import com.example.dbservice.rest.model.ExternalValueDto;

public interface DatabaseController {
    void saveExternalValue(ExternalValueDto value);
}
