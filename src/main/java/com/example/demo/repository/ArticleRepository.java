package com.example.demo.repository;

import com.example.demo.entity.Article;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ArticleRepository extends ReactiveCrudRepository<Article, Long> {
}