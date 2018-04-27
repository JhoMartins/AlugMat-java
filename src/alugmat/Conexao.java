package alugmat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static Connection con = null;

    public static Connection Conectar() {
        try {
            if (con == null) con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alugmat", "root", "");
        }
        catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        return con;
    }
}
