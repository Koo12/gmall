package com.koo12.gmall.user.service.impl;

import com.koo12.gmall.user.bean.MemberInfo;
import com.koo12.gmall.user.mapper.MemberMapper;
import com.koo12.gmall.user.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService implements IMemberService {

    @Autowired
    MemberMapper memberMapper;

    @Override
    public List<MemberInfo> getAllMember() {

        List<MemberInfo> memberInfoList = memberMapper.selectAllMember();
        return memberInfoList;
    }
}
