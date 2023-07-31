package cn.xjtu.zun.tiesheyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

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

}
