package com.yidaoyun.base.feign.factory;

import com.yidaoyun.base.condition.ScheduleCondition;
import com.yidaoyun.base.feign.RemoteScheduleService;
import com.yidaoyun.base.util.R;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RemoteScheduleFallbackFactory  implements FallbackFactory<RemoteScheduleService> {
    @Override
    public RemoteScheduleService create(Throwable throwable) {
        return new RemoteScheduleService() {
            @Override
            public R addTask(ScheduleCondition condition) {
                return null;
            }

            @Override
            public R updateTask(ScheduleCondition condition) {
                return null;
            }

            @Override
            public R delTask(ScheduleCondition condition) {
                return null;
            }
        };
    }
}
