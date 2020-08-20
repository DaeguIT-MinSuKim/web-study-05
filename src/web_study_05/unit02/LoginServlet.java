package web_study_05.unit02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id="pinksung";
        String pwd="1234";
        String name="성윤정";
        
        HttpSession session = request.getSession();
        
        if(id.equals(request.getParameter("id")) && pwd.equals(request.getParameter("pwd")) ){
            session.setAttribute("loginUser", name);
            response.sendRedirect(request.getContextPath()+"/login/10_main.jsp");
        }
        else{
            response.sendRedirect(request.getContextPath()+"/login/10_loginForm.jsp");
        }
    }
}
