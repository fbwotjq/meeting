package com.meeting.com.meeting.admin.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ryu or on 2016-12-17.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/changePassword")
    @ResponseBody public Mono<Map<String, Object>> changePassword() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", "600");
        return Mono.just(result);
    }

}
