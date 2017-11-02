package com.huarui.action;

import com.huarui.entity.Users;
import com.huarui.service.UserService;
import com.huarui.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
@Controller
public class UserAction {

    private UserService service;
    @RequestMapping("/test")
    @ResponseBody
    public List<Users> test(){
        service = new UserServiceImpl();
        return service.findall();
    }
}
