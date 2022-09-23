package com.rockies.DaeguDay.service;

import com.rockies.DaeguDay.domain.News;
import com.rockies.DaeguDay.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class NewsService {
    private final NewsRepository newsRepository;
    @Autowired
    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    //전체 뉴스 조회
    public List<News> findNewses(){
        return newsRepository.findAll();
    }


}
