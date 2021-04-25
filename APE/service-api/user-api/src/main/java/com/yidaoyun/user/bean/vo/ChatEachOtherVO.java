package com.yidaoyun.user.bean.vo;

import com.yidaoyun.base.util.BaseEntity;


public class ChatEachOtherVO extends BaseEntity{
    //对话框id
    private Integer dialogBoxId;
    //回答
    private String answer;

    public Integer getDialogBoxId() {
        return dialogBoxId;
    }

    public void setDialogBoxId(Integer dialogBoxId) {
        this.dialogBoxId = dialogBoxId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
