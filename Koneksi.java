
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
  
    private static Connection koneksi;
    
    public static Connection getConnection() throws SQLException{
        String db = "jdbc:mysql://localhost:3306/data_mahasiswa";
        String user = "root";
        String pass ="";
        
        if (koneksi == null){
    koneksi = DriverManager.getConnection(db, user, pass);
}
        return koneksi;
    }
}
