package com.wusasa.service;

import com.wusasa.bean.Article;
import com.wusasa.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ArticleServiceImpl {
    @Autowired
    ArticleMapper articleMapper;

    public List<Article> getAllArticleList() {
        return this.articleMapper.selectAll();
    }

    public Article insertArticle(Article article) {
        article.setCreateTime(new Date());
        this.articleMapper.insertSelective(article);
        return article;
    }

    public boolean idExisted(String id) {
        return this.articleMapper.selectCount(new Article(id)) > 0;
    }
}
