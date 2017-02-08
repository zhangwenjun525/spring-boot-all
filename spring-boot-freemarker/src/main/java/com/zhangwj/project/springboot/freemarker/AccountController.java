package com.zhangwj.project.springboot.freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/8
 * Time: 17:21
 */
@Controller
public class AccountController {

    @GetMapping("/reg")
    public String reg(){
        return "reg";
    }

    @GetMapping("/logout")
    public String logout(Map<String, Object> map){
        map.put("username", "zhangwenjun");
        return "reg";
    }


}
