package com.yidaoyun.base.util;

public class PasswordUtil {

    public static String encryptPassword(String password, String salt) {
        return Md5Utils.hash(password + salt);
    }

    public static void main(String[] args) {
        System.out.println(encryptPassword("Aa123456..", "AAAAAA"));
        System.out.println(encryptPassword("100003", "AwGCOM"));
    }

}