package com.devesh;

import java.sql.*;

public class Sqlconnection {

    public static void connect() {

        try {
            String sql = "SELECT sid,sname FROM sailors";
//        	String sql = "SELECT id, name, capacity FROM warehouses";
            Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306//skylord", "root", "") ;
            Statement mysat = mycon.createStatement();
            PreparedStatement preparedStmt = mycon.prepareStatement(
                    "insert into sailors values ('S-0122','Aniket',8,'2000-02-19')"
            );
            preparedStmt.execute();
            System.out.println("INSERTED!");
            ResultSet rs    = mysat.executeQuery(sql);
            System.out.println("SID"+"\t"+"SNAME");
            while (rs.next()) {
                System.out.println(rs.getString("sid") + "\t" +
                        rs.getString("sname"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}

