
import dao.ReportDAO;
import entity.ReportsEntity;
import logic.DateHandler;
import logic.ManagementSystem;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.sun.javafx.fxml.expression.Expression.not;


public class ServletHandler extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        String performer = req.getParameter("Performer");
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");


        DateHandler dateHandler = new DateHandler(startDate,endDate,performer);

        List<ReportsEntity> reports = dateHandler.getReports();


        if (reports.size()==0){
            req.getRequestDispatcher("jsp/notFound.jsp").forward(req, resp);

        }else {
            req.setAttribute("reports", reports);
            req.getRequestDispatcher("jsp/resultReports.jsp").forward(req, resp);
        }
    }

}
