/*************************************************************************************************************************************************************************
 *
 * Purpose : used toGet method to allow servlet to handle the request
 *
 *         : create my First Servlet
 *
 * Author : Roshni Singh
 *
 ********************************************************************************************************************************************************************/


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( "/FirstServlet" )
public class FirstServlet extends HttpServlet {

    /******************************************************************************************************************
     *
     * Purpose : used toGet method to allow servlet to handle the request
     *
     *****************************************************************************************************************/
    //UC1
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>Hello World! Welcome to Servlet Programming!</h3>");
        out.println("<p>Welcome for my First server </p>");
        out.close();
    }
}