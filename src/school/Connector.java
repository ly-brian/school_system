package school;

import java.sql.*;
import javax.swing.*;
public class Connector {

    static Connection ConnectDb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     Connection con=null;
   
        public static Connection ConnectDB(){
             String dataSourceName="schooldb";
          String dbURL = "jdbc:odbc:" + dataSourceName;
        try{
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection(dbURL, "",""); 
            return con;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    
    }      
}
}
