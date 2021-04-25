package com.yidaoyun.base.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CronUtil {

    public static String getCron(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("ss mm HH dd MM ? yyyy");
        String formatTimeStr = "";
        if (date != null) {
            formatTimeStr = sdf.format(date);
        }
        return formatTimeStr;
    }

}
