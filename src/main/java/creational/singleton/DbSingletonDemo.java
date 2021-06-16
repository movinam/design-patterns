package creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

    public static void main(String[] args) {

        DbSingleton instance = DbSingleton.getInstance();

        long timeBefore = 0;
        long timeAfter = 0;

        System.out.println(instance);

        timeBefore = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);

        Statement statement;

        try {
            statement = conn.createStatement();
            String sql =  "SELECT 'Hello world'";
            statement.executeQuery(sql);
            System.out.println("Executed Query ...");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        timeBefore = System.currentTimeMillis();
        conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);
    }

}
