
package bdeb.etu.schoolapp.dl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connector {

    private final String DB_HOST = "mysql-wafaa.alwaysdata.net:3306";
    private final String DB_NAME = "wafaa_a10bd";
    private final String DB_USER = "wafaa_a10user";
    private final String DB_PASSWORD = "A10BdeB2024";
    private final String DB_URL = "jdbc:mariadb://" + DB_HOST + "/" + DB_NAME;

    private Connection connection = null;
    private static DB_Connector instance = null;

    // Singleton Pattern - Get Instance
    public static DB_Connector getInstance() {
        if (DB_Connector.instance == null) {
            DB_Connector.instance = new DB_Connector();
        }
        return DB_Connector.instance;
    }

    // Private Constructor
    private DB_Connector() {
        try {
            this.connection = DriverManager.getConnection(this.DB_URL, this.DB_USER, this.DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database: " + e.getMessage(), e);
        }
    }

    // Get the Connection object
    public Connection getConnection() {
        return this.connection;
    }
}
