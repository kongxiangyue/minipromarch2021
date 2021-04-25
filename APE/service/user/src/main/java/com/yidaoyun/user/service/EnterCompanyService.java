package com.yidaoyun.user.service;

import com.yidaoyun.user.domain.EnterCompany;

/**
 * @author: ${xzr}
 * @date: 2020/7/15 10:17
 * @description:
 * @version:1.0
 **/
public interface EnterCompanyService {

    public int addEnterCompany(EnterCompany enterCompany);

    EnterCompany selectOne(EnterCompany enterCompany);

    int updateSchool(EnterCompany enterCompany);
}
