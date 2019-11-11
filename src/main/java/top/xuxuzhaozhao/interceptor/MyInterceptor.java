package top.xuxuzhaozhao.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    /**
     * 预处理器
     *
     * @param request
     * @param response
     * @param handler
     * @return 如果是true放行，去执行下一个拦截器，如果没有就执行controller中的方法
     * false不放行
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(MyInterceptor.class.toString() + " 前执行了");
        return true;

        // 跳转到自定义页面并且不放行
        // request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);
        // return false;
    }

    /**
     * 后处理方法，controller执行后，success.jsp执行之前
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println(MyInterceptor.class.toString() + " 后执行了");
    }

    /**
     * success.jsp执行后再执行的方法
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println(MyInterceptor.class.toString() + " 最后一个方法执行了");
    }
}
