package com.rockies.DaeguDay.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="NEWSLIST")
public class News {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    private String date;
    private String headline;
    @Id
    private String url;
    private long category;

}
