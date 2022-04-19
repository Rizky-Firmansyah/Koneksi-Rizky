import java.sql.*;
public class KONEKSI {
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost/Penjualan_Barang";
    static final String USER = "root";
    static final String UPASS ="";
    static Connection conn;
    static Statement stat;
    
public static void konek(){
try{
Class.forName(driver);
conn=DriverManager.getConnection(URL,USER,UPASS);
System.out.println("Koneksi Berhasil");
} catch(Exception e){
    System.out.println("Koneksi gagal");
}
}
public static void main (String [] args){
    konek();
}
}
