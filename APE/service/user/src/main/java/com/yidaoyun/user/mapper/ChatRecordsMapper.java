package com.yidaoyun.user.mapper;


import com.yidaoyun.user.domain.ChatRecords;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 *  聊天记录表(ChatRecords)表数据库访问层
 */
@Repository
public interface ChatRecordsMapper extends Mapper<ChatRecords> {



}