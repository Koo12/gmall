package com.koo12.gmall.user.mapper;

import com.koo12.gmall.user.bean.MemberInfo;

import java.util.List;

public interface MemberMapper {
    List<MemberInfo> selectAllMember();
}
