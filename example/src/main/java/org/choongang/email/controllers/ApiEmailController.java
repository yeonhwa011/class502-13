package org.choongang.email.controllers;

import lombok.RequiredArgsConstructor;
import org.choongang.email.service.EmailVerifyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
@RequiredArgsConstructor
public class ApiEmailController {

    private final EmailVerifyService verifyService;

    /**
     * 이메일 인증 코드 발급
     *
     */
    @GetMapping("/verify")
     public JSONData<object>sendVerifyEmail(@RequestParam("email")String email){
         JSONData<Object>data = new JSONData<>();

         boolean result = verifyService.sendCode(email);
         data.setSuccess(result);

         return data;

     }

     public JSONData<Object> checkVerifiedEmail(@RequestParam("authNum")int authNum){
        JSONData<Object> data = new JSONData<>();

        boolean result = verifyService.check(authNum);
        data.setSuccess(result);

        return data;
     }
}
