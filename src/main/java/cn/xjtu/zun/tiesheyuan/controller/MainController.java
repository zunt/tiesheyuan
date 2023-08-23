package cn.xjtu.zun.tiesheyuan.controller;

import cn.xjtu.zun.tiesheyuan.entity.Page;
import cn.xjtu.zun.tiesheyuan.mapper.GongchengxinxiMapper;
import cn.xjtu.zun.tiesheyuan.pojo.Gongchengxinxi;
import cn.xjtu.zun.tiesheyuan.pojo.Kantandian;
import cn.xjtu.zun.tiesheyuan.service.GongchengxinxiService;
import cn.xjtu.zun.tiesheyuan.service.KantandianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    KantandianService kantandianService;
    @Autowired
    GongchengxinxiService gongchengxinxiService;

    @RequestMapping(path = "/students", method = RequestMethod.GET)
    @ResponseBody
    public String Stu(){
        System.out.println("test");
        return "success";
    }

    @RequestMapping(path = "/studentupload", method = RequestMethod.POST)
    @ResponseBody
    public String saveStu(String name, int age){
        System.out.println(name);
        System.out.println(age);
        return "success";
    }

    @RequestMapping(path = "/teacher", method = RequestMethod.GET)
    public ModelAndView getmav(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("name", "zhangsan");
        mav.addObject("age", 30);
        mav.setViewName("/demo/demoView");
        return mav;
    }


    @RequestMapping(path = "/school", method = RequestMethod.GET)
    public String getmodel(Model model){
        model.addAttribute("name", "zhangsan");
        model.addAttribute("age", 30);
        return "/demo/demoView";
    }

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String getIndexPage(Model model, Page page){
        page.setRows(kantandianService.getRowsByGcxxid(68));
        page.setPath("/index");

        List<Kantandian> list = kantandianService.selectKantandianLimit(68, page.getOffset(), page.getLimit());
        List<Map<String, Object>> kantandians = new ArrayList<>();
        if(list!=null){
            for(Kantandian kantandian:list){
                Map<String, Object> map = new HashMap<>();
                map.put("kantandian", kantandian);
                Gongchengxinxi gongchengxinxi = gongchengxinxiService.getById(kantandian.getGcxxid());
                map.put("gongchengxinxi", gongchengxinxi);
                kantandians.add(map);
            }
        }
        model.addAttribute("kantandians", kantandians);
        return "index";
    }


}
