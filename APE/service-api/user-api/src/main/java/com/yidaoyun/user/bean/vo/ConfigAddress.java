package com.yidaoyun.user.bean.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**

 **/
@Component
@ConfigurationProperties(prefix = "config.user")
public class ConfigAddress {

    private String pythonAddress;

    private String excleAddress;

    public String getExcleAddress() {
        return excleAddress;
    }

    public void setExcleAddress(String excleAddress) {
        this.excleAddress = excleAddress;
    }

    public String getPythonAddress() {
        return pythonAddress;
    }

    public void setPythonAddress(String pythonAddress) {
        this.pythonAddress = pythonAddress;
    }
}
