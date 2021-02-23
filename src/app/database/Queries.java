package app.database;

import app.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Queries {

    public static boolean insertEmployeeRecord(Employee employee){
        try (
                Connection con = new DB().getConnection();
                )
        {
            PreparedStatement prepStmt = con.prepareStatement("INSERT INTO employees VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            prepStmt.setInt(1, employee.getEmployeeID());
            prepStmt.setString(2, employee.getFirstName());
            prepStmt.setString(3, employee.getLastName());
            prepStmt.setString(4, employee.getPosition().toString());
            prepStmt.setInt(5, employee.getDepartment().getDepartmentID());
            prepStmt.setString(6, employee.getBirthDate().toString());
            prepStmt.setString(7, employee.getHireDate().toString());
            prepStmt.setString(8, employee.getAddress());
            prepStmt.setString(9, employee.getCity());
            prepStmt.setString(10, employee.getPostalCode());
            prepStmt.setString(11, employee.getCountry());
            prepStmt.setString(12, employee.getPhoneNumber());
            prepStmt.setString(13, employee.getEmail());
            prepStmt.execute();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }


    public static void main(String[] args){
        System.out.print("KLASA QUERIES - TEST");
    }
}
