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
    private String press;
    private String headline;
    private String content;
    @Id
    private String url;
    private String category;

}
