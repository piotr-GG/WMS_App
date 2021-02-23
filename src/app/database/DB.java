package app.database;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

    public static final String DRIVER = "com.mysql.jdbc.Driver";

    private MysqlDataSource dataSource;
    private Statement stmt;
    private Connection con;


    public DB(){
        try{
            dataSource = new MysqlDataSource();
            dataSource.setUser("*******");
            dataSource.setPassword("********");
            dataSource.setServerName("TO_BE_FILLED");
            dataSource.setDatabaseName("TO_BE_FILLED");
            dataSource.setPort(3306);
            con = dataSource.getConnection();
            stmt = con.createStatement();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return con;
    }

    private void closeConnection(){
        try{
            if(!stmt.isClosed()) stmt.close();;
            if(!con.isClosed()) con.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void openConnection(){
        try{
            if(con.isClosed()) con = dataSource.getConnection();
            if(stmt.isClosed()) stmt = con.createStatement();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        System.out.println("Test klasy DB!!");
    }
}
