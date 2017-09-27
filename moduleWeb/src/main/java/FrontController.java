import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/frontController")
public class FrontController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//del after debug
        System.out.println("Start FrontController");

        String inString = req.getParameter("strType") != null
                ? req.getParameter("strType")
                : "NotDefine";
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        WhichMeansString whichMeansString = WhichMeansString.getInstance();
        pw.printf("<H1>string [%s] is [%s]</H1>",inString, whichMeansString.stringIs(inString));
        //refer to MAIN_PAGE
//        req.getRequestDispatcher("/WEB-INF/view/layouts/default.jspx").forward(req, resp);
//        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
