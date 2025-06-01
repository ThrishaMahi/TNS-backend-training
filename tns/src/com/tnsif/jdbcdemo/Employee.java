package com.tnsif.jdbcdemo;



import java.sql.*;

public class Employee {
    private static final String DRIVERNAME = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/TNS";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "thrisha";

    public static void main(String[] args) {
        try {
            // Load the driver
            Class.forName(DRIVERNAME);
            System.out.println("Driver loaded");

            // Establish connection
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection established");

            // INSERT new student
            insertStudent(conn);

            // UPDATE branch of student
            updateStudent(conn);

            // DELETE student
            deleteStudent(conn);

            // DISPLAY all students
            displayStudents(conn);

            // Close connection
            conn.close();
            System.out.println("Connection closed");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertStudent(Connection conn) throws SQLException {
        String insertSQL = "INSERT INTO Employee (eid, ename, ebranch) VALUES (?, ?, ?)";
        PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
        insertStmt.setInt(1, 100);
        insertStmt.setString(2, "Alice");
        insertStmt.setString(3, "ECE");
        int inserted = insertStmt.executeUpdate();
        System.out.println("Inserted rows: " + inserted);
        insertStmt.close();
    }

    private static void updateStudent(Connection conn) throws SQLException {
        String updateSQL = "UPDATE Employee SET ebranch = ? WHERE eid = ?";
        PreparedStatement updateStmt = conn.prepareStatement(updateSQL);
        updateStmt.setString(1, "MECH");
        updateStmt.setInt(2, 107);
        int updated = updateStmt.executeUpdate();
        System.out.println("Updated rows: " + updated);
        updateStmt.close();
    }

    private static void deleteStudent(Connection conn) throws SQLException {
        String deleteSQL = "DELETE FROM Employee WHERE eid = ?";
        PreparedStatement deleteStmt = conn.prepareStatement(deleteSQL);
        deleteStmt.setInt(1, 101);
        int deleted = deleteStmt.executeUpdate();
        System.out.println("Deleted rows: " + deleted);
        deleteStmt.close();
    }

    private static void displayStudents(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
        System.out.println("Current student records:");
        while (rs.next()) {
            System.out.println("EID: " + rs.getInt("eid") + ", Name: " + rs.getString("ename") + ", Branch: " + rs.getString("ebranch"));
        }
        rs.close();
        stmt.close();
    }
}


