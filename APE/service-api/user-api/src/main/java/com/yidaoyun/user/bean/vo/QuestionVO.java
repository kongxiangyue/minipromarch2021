package com.yidaoyun.user.bean.vo;

import com.yidaoyun.base.util.BaseEntity;

public class QuestionVO extends BaseEntity {
    //问题表主键
    private Integer id;
    //问题
    private String question;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
