import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet(urlPatterns ={"/HelloServlet"}, description = "add numbers")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) {
        service(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) {
        service(req, res);
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) {

        res.setContentType("text/html;charset=UTF-8");

        try(PrintWriter out = res.getWriter()) {
            String msg ;

            int a,b,c;

            a = Integer.parseInt(req.getParameter("a"));
            b = Integer.parseInt(req.getParameter("b"));

            c=a+b;
            msg = a+ "+"+b+"="+c;

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hello Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>"+msg+"</h2>");
            out.println("</body>");
            out.println("</html>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
