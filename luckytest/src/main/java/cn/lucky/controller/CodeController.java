package cn.lucky.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class CodeController {


    @RequestMapping(value = "/test")
    @ResponseBody
    public void test(@RequestParam("num")Integer num){
        System.out.println("123-----------"+num);
    }
}
