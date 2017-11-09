package emg.demo.webapp.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        final String user = req.getParameter("user");

        final String response = String.format("hello %s from servlet!", user);
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<div class=\"container\">");
        printWriter.write("<h2>Response</h2>");
        printWriter.write(response);
        printWriter.write("</div>");
        printWriter.flush();
    }
}