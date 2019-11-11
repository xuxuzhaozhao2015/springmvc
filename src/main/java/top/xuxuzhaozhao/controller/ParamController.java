package top.xuxuzhaozhao.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.xuxuzhaozhao.domain.Account;
import top.xuxuzhaozhao.domain.User;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("param")
public class ParamController {

    @RequestMapping("hello")
    public String Hello(Account account){
        System.out.println(account);
        return "success";
    }

    @RequestMapping("cdate")
    public String TestConvertDate(User user){
        System.out.println(user);
        return "success";
    }

    /**
     * servlet原生api获取
     */
    @RequestMapping("servlet")
    public String TestServletAPI(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        System.out.println(session);

        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);

        System.out.println(response);

        return "success";
    }
}
