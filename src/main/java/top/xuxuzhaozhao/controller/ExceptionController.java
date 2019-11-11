package top.xuxuzhaozhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.xuxuzhaozhao.exception.SysException;

@Controller
public class ExceptionController {

    @RequestMapping("testexceprion")
    public String TestException() throws SysException {
        System.out.println(ExceptionController.class.toString());
        try {
            throw new Exception("wocao");
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("出现错误");
        }
        //return "success";
    }
}
