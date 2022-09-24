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
public class CategoryController {

    private final NewsService newsService;
    @Autowired
    public CategoryController(NewsService newsService) {
        this.newsService = newsService;
    }

    @PostMapping(value = "/front/newsList")
    public String insert(Category category, Model model){
        List<News> newsList = newsService.findAllByCategory(category.getCategory());
        model.addAttribute("newsList", newsList);
        return "News/newsList";
    }
    @PostMapping(value="/front/newsList/korona")
    public String world(Category category, Model model){
        List<News> newsList=newsService.findAllByCategory("코로나");
        model.addAttribute("newsList",newsList);
        return "News/newList";
    }


}
