package creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    // Volatile ensures that the instance remains a singleton.
    private static volatile DbSingleton instance = null;
    private static volatile Connection conn = null;

    private DbSingleton() {

        try {
            Class.forName("org.h2.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(conn != null) {
            throw new RuntimeException("Use getConnection() to create.");
        }

        // To prevent Reflection from creating an instance of the class.
        if(instance != null) {
            throw new RuntimeException("Use getInstance() to create.");
        }

    }

    // Implement Double checked locking mechanism and synchronized check. Making this whole method
    // synchronized is a performance hit. If we do that, every time an instance is needed we synchronize
    // the whole class and it slows the program.

    public static DbSingleton getInstance() {

        // Lazily load the instance - Improves performance, does not hog memory or slow down the
        // application because the class is not eagerly fetching instances.

        // Will only run if we are creating an instance for the first time.
        if(instance == null) {
            synchronized (DbSingleton.class) {
                // Makes the code thread safe.
                if(instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;

    }

    public Connection getConnection() {

        if(conn == null) {
            synchronized (DbSingleton.class) {
                if(conn == null) {
                    try {
                        conn = DriverManager.getConnection ("jdbc:h2:~/test", "sa","");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
        return conn;

    }
}
