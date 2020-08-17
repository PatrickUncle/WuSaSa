package com.wusasa.bean;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    @Id
    private String id;
    private String title;
    private String content;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public Article() {
    }

    public Article(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
