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
    @Id
    private String content;
    private String url;
    private String category;

}
