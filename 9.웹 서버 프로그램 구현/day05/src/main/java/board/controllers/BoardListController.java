package board.controllers;

import board.entities.BoardData;
import board.services.BoardInfoService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/board/list/*")
public class BoardListController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BoardInfoService service = new BoardInfoService();
        List<BoardData>items =service.getList();

        req.setAttribute("items",items);

        req.setAttribute("addCss",new String[]{"board/style.css","board/list.css"});
        req.setAttribute("addScript",List.of("board/common.js","board/list.js"));

        //속성 설정은 RequestDispatcher 상단에 정의
        //출력완료되면 속성이 반영되지 않아서
        RequestDispatcher rd =req.getRequestDispatcher("/WEB-INF/templates/board/list.jsp");
        rd.forward(req,resp);
    }
}
