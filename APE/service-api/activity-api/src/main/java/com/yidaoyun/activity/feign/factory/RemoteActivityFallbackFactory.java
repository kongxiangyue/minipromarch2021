package com.yidaoyun.activity.feign.factory;

import com.yidaoyun.activity.domain.Activity;
import com.yidaoyun.activity.domain.SignUpTable;
import com.yidaoyun.activity.feign.RemoteActivityService;
import com.yidaoyun.base.util.R;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class RemoteActivityFallbackFactory implements FallbackFactory<RemoteActivityService> {

    @Override
    public RemoteActivityService create(Throwable throwable) {

        return new RemoteActivityService() {


            @Override
            public R activityGet(Integer id) {
                return null;
            }

            @Override
            public Activity getByActivityNumber(String activityNumber) {
                return null;
            }

            @Override
            public R activityUpdate(Activity activity) {
                return null;
            }

            @Override
            public R activityEventIsAboutToStart(Integer activityId) {
                return null;
            }

            @Override
            public SignUpTable signUpTableSelectByCommonUserIdAndActivityId(Integer commonUserId, Integer activityId) {
                return null;
            }
        };
    }

}
