package com.aashish.databaseconnection;


import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
    public static void main(String[] args) {
        Connection con = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student", 
                "root", 
                "SACHIN9838a"
            );

            // Confirm connection
            if (con != null) {
                System.out.println("Database connected successfully!");
            } else {
                System.out.println("Failed to connect to database.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
