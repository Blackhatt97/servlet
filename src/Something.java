import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;

public class Something extends javax.servlet.http.HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");





        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyFirstServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MyFirstServlet at</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
            processRequest(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


//        int number;
//
//        Random rand = new Random();
//        number = rand.nextInt(99);
            response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//
//        out.println("<!DOCTYPE html>");
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<title>Servlet MyFirstServlet</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("<h1>Servlet MyFirstServlet at + "+ number + "</h1>");
//        out.println("</body>");
//        out.println("</html>");


//        String prefix = "http://maps.google.com/maps?&hl=en&q=";
//        //Rome,+Italy";
//        String city = request.getParameter("city");
//        String country = request.getParameter("country");
//
//        String url = prefix + city + ",+" + country;
//        System.out.println("URL: " + url);
//        response.sendRedirect(url);
//        //response.sendError(response.SC_NOT_FOUND, "No map found!");

        String ans1 = request.getParameter("gender");
        String ans2 = request.getParameter("party");
        String ans3 = request.getParameter("quora");
        String ans4 = request.getParameter("greet");
        int total = 0;

        if(ans1.equals("1"))
            total++;
        if(ans2.equals("1"))
            total++;
        if(ans3.equals("1"))
            total++;
        if(ans4.equals("1"))
            total++;

        System.out.println(total);

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet MyFirstServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>You scored exactly:  "+ total + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
