package com.rockies.DaeguDay.controller;

import com.rockies.DaeguDay.domain.Category;
import com.rockies.DaeguDay.domain.News;
import com.rockies.DaeguDay.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class NewsController {
    private final NewsService newsService;
    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/News")
    public String list(Model model){
        List<News> newses = newsService.findAll();
        model.addAttribute("newses", newses);
        return "News/newslist1";
    }

    @GetMapping("/News/new")
    public String insertForm(){
        return "/News/insertcategory";
    }



}
