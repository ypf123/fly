package com.xula.controller;


import com.alibaba.fastjson.JSONObject;
import com.xula.base.constant.GlobalConstant;
import com.xula.base.utils.JsonBean;
import com.xula.entity.Link;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 首页信息
 * @author xla
 */
@Controller
public class IndexController extends WebController{

    private static List<Link> linkList = new ArrayList<>();

    @RequestMapping(value = {"/","index"})
    public String index(Model model) {
        for (int i = 0; i < 6; i++) {
            Link link = new Link();
            link.setName("layui");
            link.setUrl("http://www.layui.com/");
            linkList.add(link);
        }
        model.addAttribute("linkList",linkList);
        return "index";
    }

    @RequestMapping(value = "loginTest")
    @ResponseBody
    public JSONObject loginTest(HttpServletRequest request) {
        request.getSession().setAttribute(GlobalConstant.SESSION_UID,1);
        return JsonBean.success("success",1);
    }



}
