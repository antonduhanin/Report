package logic;

import dao.ReportDAO;
import entity.ReportsEntity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class DateHandler {
    private String performer;
    private String startDate;
    private String endDate;


    private ReportDAO reportDAO;
    private List<ReportsEntity> reports;


    public DateHandler(String startDate, String endDate, String performer) {
         reportDAO = new ReportDAO();
         reports = reportDAO.getAllReports();


        if (!(startDate.trim().length() == 0 && endDate.trim().length() == 0)) {
            SimpleDateFormat formatter = new SimpleDateFormat("MMM d, yyyy", Locale.US);
            try {
                Date start = formatter.parse(startDate);
                reports.removeIf(k -> k.getStartDate().before(start));



                Date end = formatter.parse(endDate);
                reports.removeIf(k -> k.getEndDate().after(end));

            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        if (!performer.equals("All performers")) {
            reports.removeIf(k -> !k.getPerformer().equals(performer));
        }

    }
    public List<ReportsEntity> getReports() {
        return reports;
    }
}
