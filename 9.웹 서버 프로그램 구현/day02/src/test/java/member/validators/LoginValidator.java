package member.validators;

import global.exceptions.ValidationException;
import global.validators.Validator;
import jakarta.servlet.http.HttpServletRequest;

public class LoginValidator implements Validator<HttpServletRequest>,RequiredValidator {

    @Override
    public void check(HttpServletRequest form) {
      String email = form.getParameter("email");
      String password = form.getParameter("password");

      /*필수항목 검증s */
        checkRequired(email, new ValidationException("이메일을 입려하세요."));
        checkRequired(password, new ValidationException("비밀번호를 입력하세요."));
      /*필수항목 검증 e*/

    }
}
