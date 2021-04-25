package com.yidaoyun.user.bean.dto;


public class ChatEachOtherDTO {
    //对话框id
    private Integer id;
    //问题
    private String question;

    //问题id
    private Integer questionId;
    //用户id
    private Integer commonUserId;

    public Integer getCommonUserId() {
        return commonUserId;
    }

    public void setCommonUserId(Integer commonUserId) {
        this.commonUserId = commonUserId;
    }

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

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
}
