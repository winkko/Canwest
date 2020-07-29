package cn.lucky.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-07-23
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping("index")
    public String index(){
        System.out.println("进来了asdfasfasfasf");
        return "login-regist";
    }
}

