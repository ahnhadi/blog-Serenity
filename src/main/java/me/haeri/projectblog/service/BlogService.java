package me.haeri.projectblog.service;

import lombok.RequiredArgsConstructor;
import me.haeri.projectblog.dto.AddArticleRequestDto;
import me.haeri.projectblog.entity.Article;
import me.haeri.projectblog.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor //final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가
    public Article save(AddArticleRequestDto requestDto, String userName){
        return blogRepository.save(requestDto.toEntity(userName));
    }
}
