import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelpfulBase {
    public static void savingTable(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS Account (" +
                    "id int primary key," +
                    "holder varchar(255)," +
                    "amount double" +
                    ");");
        }
    }

    public static void initialize (Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement();) {
            ResultSet resultSet = statement.executeQuery("SELECT count (*) FROM Account");
            if (resultSet.next()) {
                if (resultSet.getInt(1) > 0) {
                    return;
                }
            }
        }

    }

    public static void specifyValues(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Account");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String holder = resultSet.getString("holder");
                double amount = resultSet.getDouble("amount");
                System.out.println(id + " " + holder + " " + amount);
            }
        }
    }
}

