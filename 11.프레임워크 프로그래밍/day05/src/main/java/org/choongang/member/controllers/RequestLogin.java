package org.choongang.member.controllers;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RequestLogin {

    @NotBlank(message = "이메일을 입력하세요.")
    private String email;

    @NotBlank(message = "비밀번호를 입력하세요")
    private String password;
    private boolean saveEmail;

}
