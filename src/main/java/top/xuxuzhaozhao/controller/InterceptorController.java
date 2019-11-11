package top.xuxuzhaozhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {
    @RequestMapping("testinterceptor")
    public String TestInterceptor(){
        System.out.println("interceptor controller执行了");
        return "success";
    }
}
