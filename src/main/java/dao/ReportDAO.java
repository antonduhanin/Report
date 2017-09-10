package dao;

import entity.ReportsEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANTON on 10.09.2017.
 */
public class ReportDAO {
    public  List<ReportsEntity> getAllReports(){

        List reports = new ArrayList<ReportsEntity>();
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
    }
}
