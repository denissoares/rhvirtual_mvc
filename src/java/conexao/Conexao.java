package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;


public class Conexao {
    
    private Connection conn;
    
    private void conectar(){
        System.out.println("Conectando ao Banco...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://192.168.56.200/rhvirtual", "root", "1013726");
            System.out.println("Conectado!");
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada");
            java.util.logging.Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e){
            
            System.out.println(e);   
        }
    }
    
    public Connection getConecao(){
        conectar();
        
        return conn;
    }
    
}
    