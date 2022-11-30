package com.example.demo.controller;

import com.example.demo.entity.Article;
import com.example.demo.repository.ArticleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
@CrossOrigin
public class ArticleController {

    private final ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/articles")
    public Flux<Article> getArticles() {
        return articleRepository.findAll();
    }

    @GetMapping("/articles/{id}")
    public Mono<Article> findArticle(@PathVariable(name = "id") long id) {
        return articleRepository.findById(id);
    }

    @PostMapping("/articles")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Article> createArticle(@RequestBody Article article) {
        return articleRepository.save(article);
    }

    @PutMapping("/articles/{id}")
    public Mono<Article> updateArticle(@RequestBody Article article) {
        return articleRepository.save(article);
    }

    @DeleteMapping("/articles/{id}")
    public Mono<Void> remove(@PathVariable(name = "id") long id) {
        return articleRepository.deleteById(id);
    }
}
