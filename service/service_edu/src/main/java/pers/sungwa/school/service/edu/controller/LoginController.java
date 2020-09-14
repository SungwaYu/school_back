package pers.sungwa.school.service.edu.controller;

import org.springframework.web.bind.annotation.*;
import pers.sungwa.school.common.base.result.R;

/**
 * @author sungwa
 * @date 9/13/20 12:24 PM
 */
//@CrossOrigin
@RestController
@RequestMapping("/user")
public class LoginController {

    @PostMapping("login")
    public R login(){
        return R.ok().data("token","admin");
    }

    @GetMapping("info")
    public R info(){
        return R.ok().data("name","admin")
                .data("roles","[admin]")
                .data("avatar","https://lh3.googleusercontent.com/ogw/ADGmqu95lcsfopWOKQ_vOzY6gCXdfafLKEGlhQVg9C3P=s64-c-mo");
    }

    @PostMapping("logout")
    public R logout(){
        return R.ok();
    }
}
