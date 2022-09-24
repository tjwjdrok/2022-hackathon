package com.rockies.DaeguDay.controller;

import com.rockies.DaeguDay.domain.Category;
import com.rockies.DaeguDay.repository.NewsRepository;
import com.rockies.DaeguDay.service.NewsService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {

    private NewsService newsService;

    @PostMapping(value = "/News/new")
    public String insert(@Param("category") String category){
        int c = Integer.parseInt(category);
        newsService.findByCategory(c);
        return "redirect:/";
    }
}
