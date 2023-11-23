package me.haeri.projectblog.controller;

import lombok.RequiredArgsConstructor;
import me.haeri.projectblog.dto.AddArticleRequestDto;
import me.haeri.projectblog.entity.Article;
import me.haeri.projectblog.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RequiredArgsConstructor
@RestController
public class BlogController {

    private final BlogService blogService;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequestDto requestDto, Principal principal){
        Article savedArticle = blogService.save(requestDto, principal.getName());

        return ResponseEntity.status(HttpStatus.CREATED).body(savedArticle);
    }
}
