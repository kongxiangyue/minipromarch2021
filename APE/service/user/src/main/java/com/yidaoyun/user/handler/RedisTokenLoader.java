package com.yidaoyun.user.handler;

import cn.hutool.core.util.StrUtil;
import com.yidaoyun.base.util.Constants;
import com.yidaoyun.redis.util.RedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.weixin4j.loader.ITokenLoader;
import org.weixin4j.model.base.Token;

/**
 * redis缓存公众号access_token
 */
@Slf4j
@Component
public class RedisTokenLoader implements ITokenLoader {

    @Autowired
    private RedisUtils redis;

    @Override
    public Token get() {
        String wxAccessPrefix = redis.generateRedisKey(Constants.WX_PREFIX, Constants.PUBLIC_ACCESS_TOKEN);
        String accessToken = redis.get(wxAccessPrefix);
        if (StrUtil.isBlank(accessToken)) {
            return null;
        }
        Token token = new Token();
        token.setAccess_token(accessToken);
        log.info("wechat access_token:{}", accessToken);
        return token;
    }

    @Override
    public void refresh(Token token) {
        log.info("refresh wechat access_token:{}", token.toString());
        String accessToken = token.getAccess_token();
        //ticket.getExpires_in() - 600L，是为了提前10分钟过期
        String wxAccessPrefix = redis.generateRedisKey(Constants.WX_PREFIX, Constants.PUBLIC_ACCESS_TOKEN);
        redis.set(wxAccessPrefix,accessToken,token.getExpires_in() - 600L);

    }

}
