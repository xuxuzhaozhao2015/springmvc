package top.xuxuzhaozhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import top.xuxuzhaozhao.domain.Account;
import top.xuxuzhaozhao.domain.User;

@Controller
@RequestMapping("anno")
@SessionAttributes(value = {"msg"}) //此时在model中存入的msg数据也存在与session中了
public class AnnotationController {

    /**
     * 只能传RequestParam
     *
     * @param username
     * @return
     */
    @RequestMapping("testrequest")
    public String TestRequest(@RequestParam(name = "name") String username) {
        System.out.println(username);
        return "success";
    }

    /**
     * 此时全部会变成键值对
     *
     * @param body
     * @return
     */
    @RequestMapping("testrequestbody")
    public String TestRequestBody(@RequestBody String body) {
        System.out.println(body);
        return "success";
    }

    /**
     * 绑定url中的占位符
     */
    @RequestMapping(value = "TestPathVariable/{sid}", method = RequestMethod.PUT)
    public String TestPathVariable(@PathVariable(name = "sid") String id) {
        System.out.println(id);
        return "success";
    }

    /**
     * 获取请求头的信息
     */
    public String TestHeader(@RequestHeader("accept") String header){return null;}

    public String TestCookie(@CookieValue("sessionID") String cookie){return null;}

    @ModelAttribute
    public String TestModel(String cookie){return null;}

    /**
     * 存入
     */
    @RequestMapping("testsession")
    public String TestSession(Model model){
        //测试会存到底层request域中
        model.addAttribute("msg","wocao");
        return "success";
    }

    @RequestMapping("TestGetSession")
    public String TestGetSession(ModelMap modelMap){
        //从session中拿值
        modelMap.get("msg");
        return "success";
    }

    @RequestMapping("TestdelSession")
    public String TestdelSession(SessionStatus sessionStatus){
        //清空session中的数据
        sessionStatus.setComplete();
        return "success";
    }
}
