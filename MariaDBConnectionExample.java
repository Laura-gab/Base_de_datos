
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDBConnectionExample {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/Agencia";
        String user = "root";
        String password = "1234567";

        try {
            // Establecer la conexión
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos MariaDB.");

            // Cerrar la conexión
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
    }
}

