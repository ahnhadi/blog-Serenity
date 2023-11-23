package me.haeri.projectblog.repository;

import me.haeri.projectblog.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
