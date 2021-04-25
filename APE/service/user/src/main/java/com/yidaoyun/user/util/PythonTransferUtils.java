package com.yidaoyun.user.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author: ${xzr}
 * @date: 2020/6/18 16:05
 * @description:
 */
public class PythonTransferUtils {

    private static final Logger log = LoggerFactory.getLogger(PythonTransferUtils.class);

    public static String RebotChat(String[] params) {
        String succLine = null;
        try {
            Process process = Runtime.getRuntime().exec(params);

            //防止Python输出中文时乱码
            BufferedReader succIn = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));
            BufferedReader errIn = new BufferedReader(new InputStreamReader(process.getErrorStream(), "UTF-8"));
            String errorLine = null;
            while ((errorLine = errIn.readLine()) != null) {
                log.info("PYTHON ERROR ANSWER : " +errorLine);
                return null;
            }

            while ((succLine = succIn.readLine()) != null) {
                log.info("PYTHON SUCCESS ANSWER : " +succLine);
                return succLine;
            }
            errIn.close();
            succIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
