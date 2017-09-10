package dao;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DBConnection {
    public static Connection connect() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date myDate = new Date(System.currentTimeMillis());
        String d = myDate.toString();

        System.out.print(d);


        java.util.Date date = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
