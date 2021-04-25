package com.yidaoyun.base.feign.factory;

import com.yidaoyun.base.feign.RemoteDFSService;
import com.yidaoyun.base.util.R;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@Component
public class RemoteDFSFallbackFactory implements FallbackFactory<RemoteDFSService> {

    @Override
    public RemoteDFSService create(Throwable throwable) {

        return new RemoteDFSService() {

            @Override
            public R upload(MultipartFile file) {
                return null;
            }

        };
    }

}
