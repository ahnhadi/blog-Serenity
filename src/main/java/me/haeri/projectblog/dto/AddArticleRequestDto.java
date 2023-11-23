package me.haeri.projectblog.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.haeri.projectblog.entity.Article;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequestDto {

    private String title;
    private String content;

    // 빌더 패턴을 사용해 dto를 엔티티로 만들어주는 엔티티
    // 블로그 글을 추가할 때 저장할 엔티티로 변환하는 용도로 사용
    public Article toEntity(String author) {
        return Article.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
