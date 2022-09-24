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
    @GetMapping("/front/newsList")
    public String list(Model model){
        List<News> newses = newsService.findAll();
        model.addAttribute("newsList", newses);
        return "newsList";
    }
    @GetMapping("/front/newsList/ItScience")
    public String ItScience(Model model){
        List<News> newsList=newsService.findAllByCategory("IT과학");
        model.addAttribute("newsList",newsList);
        return "/tag/ItScience";
    }
    @GetMapping("/front/newsList/economy")
    public String eocnomy(Category category, Model model){
        List<News> newsList=newsService.findAllByCategory("경제");
        model.addAttribute("newsList",newsList);
        return "/tag/economy";
    }
    @GetMapping("/front/newsList/society")
    public String society(Model model){
        List<News> newsList=newsService.findAllByCategory("사회");
        model.addAttribute("newsList",newsList);
        return "/tag/society";
    }
    @GetMapping("/front/newsList/culture")
    public String culture(Model model){
        List<News> newsList=newsService.findAllByCategory("생활문화");
        model.addAttribute("newsList",newsList);
        return "/tag/culture";
    }
    @GetMapping("/front/newsList/world")
    public String world( Model model){
        List<News> newsList=newsService.findAllByCategory("세계");
        model.addAttribute("newsList",newsList);
        return "/tag/world";
    }
    @GetMapping("/front/newsList/sports")
    public String sports( Model model){
        List<News> newsList=newsService.findAllByCategory("스포츠");
        model.addAttribute("newsList",newsList);
        return "/tag/sports";
    }
    @GetMapping("/front/newsList/politics")
    public String politics( Model model){
        List<News> newsList=newsService.findAllByCategory("정치");
        model.addAttribute("newsList",newsList);
        return "/tag/politics";
    }
    @GetMapping("/front/newsList/corona")
    public String corona(Model model){
        List<News> newsList=newsService.findAllByCategory("코로나");
        model.addAttribute("newsList",newsList);
        return "/tag/corona";
    }
    @GetMapping("/News/new")
    public String insertForm(){
        return "/News/insertcategory";
    }
}
