package com.yidaoyun.user.mapper;


import com.yidaoyun.user.domain.ChatQuestion;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * 聊天对话框表(ChatQuestion)表数据库访问层
 */
@Repository
public interface ChatQuestionMapper extends Mapper<ChatQuestion> {



}