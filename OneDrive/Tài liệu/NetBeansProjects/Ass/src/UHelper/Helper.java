/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UHelper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dovan
 */
public class Helper {
    public static  Connection ketnoi(String database){
       try {
            String user="sa";
            String pass="sangct257";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://congdvPC:1433;databaseName="+database;
            Connection cn= DriverManager.getConnection(url, user, pass);
            return cn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
  }
}
