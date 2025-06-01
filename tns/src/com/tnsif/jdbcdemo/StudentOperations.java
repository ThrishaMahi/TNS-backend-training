package com.tnsif.jdbcdemo;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class StudentOperations {
	

	    private static final String DRIVERNAME = "org.postgresql.Driver";
	    private static final String URL = "jdbc:postgresql://localhost:5432/TNS";
	    private static final String USERNAME = "postgres";
	    private static final String PASSWORD = "thrisha";

	    public static void main(String[] args) {
	        try {
	            // 1. Load the driver
	            Class.forName(DRIVERNAME);
	            System.out.println("Driver loaded");

	            // 2. Establish connection
	            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	            System.out.println("Connection established");

	            // 3. INSERT new student
	            String insertSQL = "INSERT INTO student (sid, sname, sbranch) VALUES (?, ?, ?)";
	            PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
	            insertStmt.setInt(1, 500);  // new sid (must be unique)
	            insertStmt.setString(2, "Alice");
	            insertStmt.setString(3, "ECE");
	            int inserted = insertStmt.executeUpdate();
	            System.out.println("Inserted rows: " + inserted);
	            insertStmt.close(); 
	            // in database as we have not mentioned primary key it will add the value as many times as we run

	            // 4. UPDATE branch of student with sid=2
	            String updateSQL = "UPDATE student SET sbranch = ? WHERE sid = ?";
	            PreparedStatement updateStmt = conn.prepareStatement(updateSQL);
	            updateStmt.setString(1, "MECH");
	            updateStmt.setInt(2, 100);
	            int updated = updateStmt.executeUpdate();
	            System.out.println("Updated rows: " + updated);
	            updateStmt.close();

	            // 5. DELETE student with sid=1
	            String deleteSQL = "DELETE FROM student WHERE sid = ?";
	            PreparedStatement deleteStmt = conn.prepareStatement(deleteSQL);
	            deleteStmt.setInt(1, 102);
	            int deleted = deleteStmt.executeUpdate();
	            System.out.println("Deleted rows: " + deleted);
	            deleteStmt.close();

	            // 6. DISPLAY all students
	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
	            System.out.println("\nCurrent student records:");
	            while (rs.next()) {
	                System.out.println("SID: " + rs.getInt("sid") +
	                                   ", Name: " + rs.getString("sname") +
	                                   ", Branch: " + rs.getString("sbranch"));
	            }
	            rs.close();
	            stmt.close();

	            // 7. Close connection
	            conn.close();
	            System.out.println("\nConnection closed");

	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}