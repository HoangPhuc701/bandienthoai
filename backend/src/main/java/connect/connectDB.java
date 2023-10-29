package connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectDB {
    public static void main(String[] args) throws Exception {
        connectDB.getConnection();
    }

    private static final String DB_URL = "jdbc:mysql://localhost:3306/phonestore?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("oke");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ko");
        }
        return connection;
    }
}
