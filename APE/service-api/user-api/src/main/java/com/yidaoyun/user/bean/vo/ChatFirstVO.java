package com.yidaoyun.user.bean.vo;

import com.yidaoyun.base.util.BaseEntity;

import java.util.List;


public class ChatFirstVO extends BaseEntity {
    //对话框id
    private Integer dialogBoxId;
    //微信客服二维码
    private String wxCustomerCode;
    //问题集合
    private List<QuestionVO>  questionList;

    public Integer getDialogBoxId() {
        return dialogBoxId;
    }

    public void setDialogBoxId(Integer dialogBoxId) {
        this.dialogBoxId = dialogBoxId;
    }

    public String getWxCustomerCode() {
        return wxCustomerCode;
    }

    public void setWxCustomerCode(String wxCustomerCode) {
        this.wxCustomerCode = wxCustomerCode;
    }

    public List<QuestionVO> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<QuestionVO> questionList) {
        this.questionList = questionList;
    }
}
