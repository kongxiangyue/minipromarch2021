package com.yidaoyun.user.handler;

import org.springframework.stereotype.Component;
import org.weixin4j.model.message.OutputMessage;
import org.weixin4j.model.message.normal.*;
import org.weixin4j.spi.INormalMessageHandler;

/**
 * 普通微信消息处理类
 */
@Component
public class MyNormalMessageHandler implements INormalMessageHandler {
    @Override
    public OutputMessage textTypeMsg(TextInputMessage msg) {
        return null;
    }

    @Override
    public OutputMessage imageTypeMsg(ImageInputMessage msg) {
        return null;
    }

    @Override
    public OutputMessage voiceTypeMsg(VoiceInputMessage msg) {
        return null;
    }

    @Override
    public OutputMessage videoTypeMsg(VideoInputMessage msg) {
        return null;
    }

    @Override
    public OutputMessage shortvideoTypeMsg(ShortVideoInputMessage msg) {
        return null;
    }

    @Override
    public OutputMessage locationTypeMsg(LocationInputMessage msg) {
        return null;
    }

    @Override
    public OutputMessage linkTypeMsg(LinkInputMessage msg) {
        return null;
    }
}
