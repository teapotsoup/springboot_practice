package r2ware.practice2.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;
import r2ware.practice2.entity.Article;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(null, title, content);
    }
}