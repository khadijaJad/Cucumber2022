package utilities;

import java.sql.*;

public class DatabaseUtils {
    static Connection con;
    static Statement statement;
    public static void createDbConnection(){
        try {
            String url=ConfigReader.getProperties("url");
            String Db_password=ConfigReader.getProperties("Db_password");
            String Db_username=ConfigReader.getProperties("Db_username");
            Class.forName( ConfigReader.getProperties("db_driver_class"));
            con = DriverManager.getConnection(url,Db_username,Db_password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static ResultSet executeQuery(String query) {
        ResultSet rs=null;
        try {
            statement=con.createStatement();
            rs=statement.executeQuery(query);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static void closeDbConnection(){
        try {
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        ConfigReader.initProperties();
        DatabaseUtils.createDbConnection();
       ResultSet rs= DatabaseUtils.executeQuery("SELECT * FROM digitalbank.account_transaction;");
       while(rs.next()){
           System.out.println(rs.getString("description"));
       }

        DatabaseUtils.closeDbConnection();
    }}


