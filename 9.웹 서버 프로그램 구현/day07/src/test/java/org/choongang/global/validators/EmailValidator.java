package org.choongang.global.validators;

public interface EmailValidator {
    default boolean checkEmail(String email){
        //계정@도메인.com|co.kr..
        String pattern = "[^@]+@[^.]+\\.[a-x]+";

        return email.matches(pattern);
    }
}
