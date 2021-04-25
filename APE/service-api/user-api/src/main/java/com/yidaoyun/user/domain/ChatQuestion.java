package com.yidaoyun.user.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 聊天对话框表(ChatQuestion)实体类
 */
public class ChatQuestion implements Serializable {
    private static final long serialVersionUID = 841992852874549041L;
    /**
    * id
    */
    private Integer id;
    /**
    * 问题
    */
    private String question;
    /**
    * 回答
    */
    private String answer;
    /**
    * 创建时间
    */
    private Date createTime;


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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}