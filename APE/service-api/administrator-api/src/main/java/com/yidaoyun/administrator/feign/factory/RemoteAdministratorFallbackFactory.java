package com.yidaoyun.administrator.feign.factory;

import com.yidaoyun.administrator.feign.RemoteAdministratorService;
import com.yidaoyun.base.util.R;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RemoteAdministratorFallbackFactory implements FallbackFactory<RemoteAdministratorService> {

    @Override
    public RemoteAdministratorService create(Throwable throwable) {
        return new RemoteAdministratorService() {
            @Override
            public Boolean permissionVerify(String authority, String account) {
                return null;
            }

            @Override
            public R administratorGet(Integer id) {
                return null;
            }
        };
    }

}
