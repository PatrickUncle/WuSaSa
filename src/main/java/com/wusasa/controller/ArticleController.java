package com.wusasa.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wusasa.bean.Article;
import com.wusasa.service.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
}
