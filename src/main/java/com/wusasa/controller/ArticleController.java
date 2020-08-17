package com.wusasa.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wusasa.bean.Article;
import com.wusasa.service.ArticleServiceImpl;
import com.wusasa.utils.CommenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("v1/article/")
@CrossOrigin
public class ArticleController {
    @Autowired
    ArticleServiceImpl articleService;

    @RequestMapping("getAllList")
    @ResponseBody
    public String getAllList(){
        JSONObject back = new JSONObject();
        List<Article> articleList = this.articleService.getAllArticleList();
        back.put("msg","get all article list success");
        back.put("success",true);
        back.put("data",articleList);
        return JSON.toJSONString(back);
    }

    @RequestMapping("createArticle")
    @ResponseBody
    public String createArticle(@RequestBody Article article){
        JSONObject back = new JSONObject();
        // 生成随机id
        int count = 0;
        while (count++ < 50){
            article.setId(CommenUtils.getRandomId(10));
            if(!this.articleService.idExisted(article.getId())){
                break;
            }

        }
        if(count > 50){
            back.put("msg","create article failed");
            back.put("success",true);
            back.put("data",null);
            return JSON.toJSONString(back);
        }
        Article result  = this.articleService.insertArticle(article);
        back.put("msg","create article success");
        back.put("success",true);
        back.put("data",result);
        return JSON.toJSONString(back);
    }
}
