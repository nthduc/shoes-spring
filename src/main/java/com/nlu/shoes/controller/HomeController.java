package com.nlu.shoes.controller;

import java.util.List;

import com.nlu.shoes.domain.Article;
import com.nlu.shoes.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {

    @Autowired
    private ArticleService articleService;


    @RequestMapping("/")
    public String index(Model model) {
        List<Article> articles = articleService.findFirstArticles();
        model.addAttribute("articles", articles);
        return "index";
    }


}
