package com.ttn.springdata.transactions;

import java.sql.*;

public class QuestionOneandTwo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {


        String connectionString = "jdbc:mysql://localhost:3306/springDemo";
        String username = "root";
        String password = "Manidhar@5693";
        Connection connection = (Connection) DriverManager.getConnection(connectionString,username, password);
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getString("dob"));
        }
    }
}
