///**********************************************************************************************************************
// *
// * * UC4 : Extend the Servlet to accept a valid Password
// *   		 Rule1 – minimum 8 Characters
// *   		 Rule2 – Should have at least 1 Upper Case
// * 		     Rule3 – Should have at least 1 numeric number in the password
// * 		     Rule4 – Has exactly 1 Special Character
// *
// * @author : Roshni Singh
// **********************************************************************************************************************/
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebInitParam;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet(
//        description = "Login Servlet Testing",
//        urlPatterns = { "/LoginServlet" },
//        initParams = {
//                @WebInitParam(name = "user", value = "Roshni"),
//                @WebInitParam(name = "password", value = "Seeya@143")
//        }
//)
//
//public class LoginServlet extends HttpServlet{
//
//    /*
//     * Purpose : Method to allow a servlet to handle a POST request.
//     */
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        //get request parameters for userID and password
//        String user = request.getParameter("user");
//        String pwd = request.getParameter("pwd");
//
//        //get servlet config init params
//        String userID = getServletConfig().getInitParameter("user");
//        String password = getServletConfig().getInitParameter("password");
//
//        /*
//         * Purpose : Validate username using Regular Expression
//         * 			 Name starts with Cap and has minimum 3 characters
//         */
//
//        String regexName = "^[A-Z]{1}[a-zA-Z]{2,}$";
//       /*
//		 * Purpose : Validate password using Regular Expression
//		  			 Rule1 – minimum 8 Characters
//		  			 Rule2 – Should have at least 1 Upper Case
// 					 Rule3 – Should have at least 1 numeric number in the password
//					 Rule4 – Has exactly 1 Special Character
//		 */
//
//        String regexPassword = "^(?=.*[0-9])(?=.*[@#$%^&+=])(?=.*[a-z])(?=.*[A-Z]){8,}$";
//
//        if(userID.equals(user)  && password.equals(pwd)) {
//            request.setAttribute("user", user);
//            request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
//        } else {
//            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
//            PrintWriter out = response.getWriter();
//            out.println("<font color=red>Either username or password is incorrect!</font>");
//            rd.include(request, response);
//        }
//    }
//}