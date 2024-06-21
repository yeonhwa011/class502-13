package org.choongang.global;

import jakarta.servlet.http.HttpServletResponse;
import org.choongang.global.exceptions.CommonException;

import java.io.IOException;
import java.io.PrintWriter;

public class MessageUtil {
    public static void alertError(Exception e, HttpServletResponse resp)throws IOException {
        resp.setContentType("text/html; charset=UTF-8");
        if(e instanceof CommonException commonException){
            resp.setStatus(commonException.getStatus());
        }

        PrintWriter out =resp.getWriter();
        out.printf("<script>alert('%s');</script>",e.getMessage());

    }

    public static void go(String url, String taget,HttpServletResponse resp)throws  IOException{
        taget = taget == null || taget.isBlank() ?"self" : taget;

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out =resp.getWriter();
        /**
         * location.href : 주소 이동시 이동기록이 남는다. 두리가 버튼을 누른경우
         * post처리가 중복된다.
         * post 처리시 이동할떄는 기록을 남기지 않는 이동방식
         */
        out.printf("<script>%s.location.replace('%s');</script>",taget,url);
    }

    public static void go(String url,HttpServletResponse resp)throws IOException{
        go(url,"self",resp);
    }
}
