package com.sda.adapter.domain;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class Book{

    private Long id;
    private String name;
    private String ISBN;
    private Instant releaseDate;
}
