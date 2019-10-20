package com.koo12.gmall.user.controller;

import com.koo12.gmall.user.bean.MemberInfo;
import com.koo12.gmall.user.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    IMemberService memberService;

    @RequestMapping("getAllMember")
    @ResponseBody
    public List<MemberInfo> getAllMember(){

        List<MemberInfo> memberInfoList = memberService.getAllMember();
        return memberInfoList;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }
}
