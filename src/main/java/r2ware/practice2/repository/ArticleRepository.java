package r2ware.practice2.repository;
import org.springframework.data.repository.CrudRepository;
import r2ware.practice2.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}