package com.op.controller.common;

import com.op.entity.User;
import com.op.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import static com.op.config.Path.*;

/**
 * @author Jue-PC
 */
@Controller
public class UserController {

    private final
    UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {this.userService = userService;}

    @RequestMapping("/signPage")
    public String signPage() {
        return "signPage";
    }

    @RequestMapping("/goSignUp")
    public String goSignUp() {
        return "signUp";
    }

    @RequestMapping("/signUp")
    public String signUp(HttpServletRequest request) {
        User user = new User();
        user.setUid(request.getParameter("username"));
        user.setUpwd(request.getParameter("password"));
        user.setUname(request.getParameter("realName"));
        user.setUphone(request.getParameter("phoneNum"));
        user.setUaddress(request.getParameter("address"));
        userService.insertUser(user);
        return "signPage";
    }

    @RequestMapping("/signIn")
    public String signIn(HttpServletRequest request) {
        User user = userService.findUser(request.getParameter("username"));
        if (!user.getUpwd().equals(request.getParameter("password"))) {
            return "redirect:" + ROOT_PATH + "signPage";
        } else {
            request.getSession().setAttribute("user", user);
            return "redirect:" + SHOP_ROOT_PATH;
        }
    }

}
