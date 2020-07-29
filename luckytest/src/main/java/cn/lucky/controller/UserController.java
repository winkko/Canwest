package cn.lucky.controller;

import cn.lucky.pojo.User;
import cn.lucky.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/doLogin")
    public String doLogin(@RequestParam("username")String username,@RequestParam("password")String password){
        User user= userService.doLogin(username,password);
        System.out.println(user.getJuId());
        String reslt=null;
        if(user!=null){
            if(user.getJuId()==3){
                reslt="user";
            }else if(user.getJuId()==2){
                reslt="user2";
            }else if(user.getJuId()==1){
                reslt="user1";
            }
        }
        return reslt;
    }

    @ResponseBody
    @RequestMapping(value = "/reg",produces = "application/json;charset=utf-8")
    public Object regist(@RequestParam("username")String username,@RequestParam("password")String password,@RequestParam("juId")Integer juId){
        System.out.println(username+"-"+password+"-"+juId);
        String result=null;
        User user=new User(username,password,juId);
       if(userService.ins(user)){
            result="注册成功";
        }else{
            result="注册失败";
        }
        return JSON.toJSONString(result);
    }
}
