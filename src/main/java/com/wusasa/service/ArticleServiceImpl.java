package com.wusasa.service;

import com.wusasa.bean.Article;
import com.wusasa.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl {
    @Autowired
    ArticleMapper articleMapper;

    public List<Article> getAllArticleList() {
        return this.articleMapper.selectAll();
    }
}
