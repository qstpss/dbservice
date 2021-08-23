package com.example.dbservice.dao;

import com.example.dbservice.dao.entities.ExternalValue;
import org.springframework.data.repository.CrudRepository;

public interface ExternalValueRepository extends CrudRepository<ExternalValue, Long> {
}
