package com.rockies.DaeguDay.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;
    private String headline;
    private String url;
    private int category;

}
