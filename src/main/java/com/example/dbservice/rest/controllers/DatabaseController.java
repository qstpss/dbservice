package com.example.dbservice.rest.controllers;

import external.dto.ExternalValueDto;

public interface DatabaseController {
    void saveExternalValue(ExternalValueDto value);
}
