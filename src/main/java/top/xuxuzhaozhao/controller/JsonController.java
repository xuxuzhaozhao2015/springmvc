package top.xuxuzhaozhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.xuxuzhaozhao.domain.User;

@RequestMapping("json")
@Controller
public class JsonController {

    @RequestMapping("get")
    public @ResponseBody User TestGetJson(@RequestBody String body){
        System.out.println(body);
        User user = new User();
        user.setUname(body);
        return user;
    }
}
