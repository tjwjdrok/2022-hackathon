package com.rockies.DaeguDay.domain;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //IDENTITY
    private Long id;

    private String date;
    private String headline;
    private String url;
    private int category;
}
