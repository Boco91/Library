/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteka;

/**
 *
 * @author bdjum
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class dbkonekcija {
    Connection conn;
  
    
    //konekcija na bazu podataka
public static Connection Konektdb (){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Boco\\Desktop\\Biblioteka\\baza\\biblioteka.db");
        return conn;
    
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
    }
}    
    
}
