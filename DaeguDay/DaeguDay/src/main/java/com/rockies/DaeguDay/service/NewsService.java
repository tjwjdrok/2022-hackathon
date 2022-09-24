package com.rockies.DaeguDay.service;

import com.rockies.DaeguDay.domain.News;
import com.rockies.DaeguDay.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    private final NewsRepository newsRepository;
    @Autowired
    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    //전체 뉴스 조회
    public List<News> findAll(){
        return newsRepository.findAll();
    }

    public List<News> findByCategory(int c){
        return  newsRepository.findAllByCategory(c);
    }
}
