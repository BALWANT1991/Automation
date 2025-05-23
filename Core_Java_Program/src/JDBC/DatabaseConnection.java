package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

  // JDBC URL, username, and password
  static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
  static final String USERNAME = "username";
  static final String PASSWORD = "password";

  public static void main(String[] args) {
    Connection connection = null;

    try {
      // Step 1: Load the JDBC driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // Step 2: Establish a connection
      connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

      // Connection successful
      System.out.println("Connected to the database!");
      // Perform database operations here...

    } catch (ClassNotFoundException e) {
      System.err.println("Error: JDBC driver not found!");
      e.printStackTrace();
    } catch (SQLException e) {
      System.err.println("Error: Failed to connect to the database!");
      e.printStackTrace();
    } finally {
      // Step 3: Close the connection in the finally block to ensure cleanup
      if (connection != null) {
        try {
          connection.close();
          System.out.println("Connection closed.");
        } catch (SQLException e) {
          System.err.println("Error occurred while closing connection!");
          e.printStackTrace();
        }
      }
    }
  }
}
