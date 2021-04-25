package com.yidaoyun.user.feign.factory;

import com.yidaoyun.base.util.R;
import com.yidaoyun.user.domain.MyAttention;
import com.yidaoyun.user.feign.RemoteUserService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class RemoteUserFallbackFactory implements FallbackFactory<RemoteUserService> {

    @Override
    public RemoteUserService create(Throwable throwable) {

        return new RemoteUserService() {

            @Override
            public R enterCompanyGet(Integer id) {
                return null;
            }

            @Override
            public R commonUserGet(Integer id) {
                return null;
            }

            @Override
            public R toDoReminder(Integer enterCompanyId, String remark) {
                return null;
            }

            @Override
            public R eventIsAboutToStart(Integer commonUserId, String name, String time, String addr) {
                return null;
            }

        };
    }

}
