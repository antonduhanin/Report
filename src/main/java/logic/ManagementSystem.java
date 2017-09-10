package logic;


import entity.ReportsEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import dao.DBConnection;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Configuration;



import entity.ReportsEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class  ManagementSystem {


    public String text ;
    private String perform;


   /* public List getAllReports() {
        List<ReportsEntity> reports = new ArrayList();
        Connection connection = DBConnection.connect();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT StartDate,EndDate,Performer,Activity FROM reports");
            while (rs.next()) {
                ReportsEntity reportsEntity = new ReportsEntity();
                reportsEntity.setStartDate(rs.getDate(1));
                reportsEntity.setEndDate(rs.getDate(2));
                reportsEntity.setPerformer(rs.getString(3));
                reportsEntity.setActivity(rs.getString(4));
                reports.add(reportsEntity);
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reports;


        List reports = new ArrayList <ReportsEntity>();

        Configuration configuration = new Configuration().configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = null;
        tx=session.beginTransaction();


        Criteria cr = session.createCriteria(ReportsEntity.class);

        reports = cr.list();
        tx.commit();
        session.close();



        return reports;
    }*/





    public  String getPerforms() {
        Set<String> performs=new LinkedHashSet();
        Connection connection = DBConnection.connect();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT Performer FROM reports");
            while (rs.next()) {
                performs.add(rs.getString(1));
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        Iterator<String> iter = performs.iterator();
        for(int i =0;i<performs.size();i++) {
            String s = iter.next();
            perform += "<option value=\"" + s + "\">" + s + "</option>";
        }


            return perform;

    }
}