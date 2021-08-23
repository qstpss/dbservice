package com.example.dbservice.dao.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(schema = "extvaldb", name = "external_value")
@NoArgsConstructor
@Data
public class ExternalValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String value;
    private String source;
}

