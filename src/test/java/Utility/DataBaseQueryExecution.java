package Utility;

import java.sql.*;
import java.util.ArrayList;

public class DataBaseQueryExecution {
    static Connection con = null;

    public DataBaseQueryExecution(String url, String userName, String password) {
        try {
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Database is connected");
        } catch (SQLException e) {
            System.out.println(e.getErrorCode() + "Database Connection failed");
        }
    }

    public static ArrayList<Object> ExecuteQuery(String query, String RequiredValue) {
        ArrayList<Object> dataSet = new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery(query);
            while (rst.next()) {
                dataSet.add(rst.getString(RequiredValue));
            }
        } catch (SQLException e) {
            System.out.println(e.getErrorCode() + "Query is not executed");
        }
        return dataSet;
    }

    public static void closeConnection() {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getErrorCode() + "Unable to Close the database Connection");
        }
    }
}
