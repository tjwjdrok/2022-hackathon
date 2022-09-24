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
    @PostMapping(value="/front/newsList/ItScience")
    public String ItScience(Category category, Model model){
        List<News> newsList=newsService.findAllByCategory("IT과학");
        model.addAttribute("newsList",newsList);
        return "News/newList";
    }
    @PostMapping(value="/front/newsList/economy")
    public String eocnomy(Category category, Model model){
        List<News> newsList=newsService.findAllByCategory("경제");
        model.addAttribute("newsList",newsList);
        return "News/newList";
    }
    @PostMapping(value="/front/newsList/society")
    public String society(Category category, Model model){
        List<News> newsList=newsService.findAllByCategory("사회");
        model.addAttribute("newsList",newsList);
        return "News/newList";
    }
    @PostMapping(value="/front/newsList/culture")
    public String culture(Category category, Model model){
        List<News> newsList=newsService.findAllByCategory("생활문화");
        model.addAttribute("newsList",newsList);
        return "News/newList";
    }
    @PostMapping(value="/front/newsList/world")
    public String world(Category category, Model model){
        List<News> newsList=newsService.findAllByCategory("세계");
        model.addAttribute("newsList",newsList);
        return "News/newList";
    }
    @PostMapping(value="/front/newsList/sports")
    public String sports(Category category, Model model){
        List<News> newsList=newsService.findAllByCategory("스포츠");
        model.addAttribute("newsList",newsList);
        return "News/newList";
    }
    @PostMapping(value="/front/newsList/politics")
    public String politics(Category category, Model model){
        List<News> newsList=newsService.findAllByCategory("정치");
        model.addAttribute("newsList",newsList);
        return "News/newList";
    }
    @PostMapping(value="/front/newsList/corona")
    public String corona(Category category, Model model){
        List<News> newsList=newsService.findAllByCategory("코로나");
        model.addAttribute("newsList",newsList);
        return "News/newList";
    }


}
