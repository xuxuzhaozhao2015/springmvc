package top.xuxuzhaozhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.xuxuzhaozhao.domain.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("testString")
    public String testString(Model model) {
        User user = new User();
        user.setDate(new Date());
        user.setMoney((double) 250);
        user.setUname("名门汇");

        model.addAttribute("msg", user);
        return "success";
    }

    /**
     * 请求转发：只有一次请求；
     * 重定向：浏览器会两次请求
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 请求转发
        // request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);

        //重定向
        // response.sendRedirect(request.getContextPath()+"/index.jsp");

        //直接响应
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("你好");
        return;
    }

    @RequestMapping("TestModelAndView")
    public ModelAndView TestModelAndView(){
        User user = new User();
        user.setDate(new Date());
        user.setMoney((double) 250);
        user.setUname("名门汇");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("success");

        return modelAndView;
    }

    /**
     * 关键字转发
     * @return
     */
    public String TestKey(){
        // 请求转发
        //return "forward:/WEB-INF/pages/success.jsp";

        //重定向
        return "redirect:/index.jsp";
    }
}
