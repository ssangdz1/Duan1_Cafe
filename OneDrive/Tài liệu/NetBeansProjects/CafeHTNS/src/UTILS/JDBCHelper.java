/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTILS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sang
 */
public class JDBCHelper {
    public static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String dburl = "jdbc:sqlserver://localhost:1433;databaseName=cafehtns;encrypt=true;trustServerCertificate=true;";
    public static String user = "sa";
    public static String pass = "sangct257";

    // Nap driver
    
    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //xay dung PreparedStatement
    //@param sql la mo cau lenh sql chua co the chua tham so .No co the la mot loi goi thu tuc luu
    //@param args la sanh sach cac gia tri duoc cung cap cho cac tham so trong cau lenh sql
    //@return PreparedStatement tao duoc
    //@throw java.sql.SQLException loi sai cu phap
    public static PreparedStatement getStmt(String sql,Object... args) throws SQLException{
        Connection conn = DriverManager.getConnection(dburl,user,pass);
        PreparedStatement stmt;
        if(sql.trim().startsWith("{")){
            stmt=conn.prepareCall(sql);//proc
        } else {
            stmt=conn.prepareStatement(sql);//sql
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i+1, args[i]);
        }
        return stmt;
    }
    // thuc hien cau lenh sql thao tac (insert ,update,delete) hoac thu tuc luu thao tac du lieu
    //@param sql la cau lenh sql chua co the la tham so . No co the la mot loi goi thu tuc luu
    //@param args la danh sach cac gia tri duoc cung cap cho cac tham so trong cau lenh sql
    public static int update(String sql , Object... args){
        try {
            PreparedStatement stmt = getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    //thuc hien cau lenh sql truy van (select) hoac thu tuc luu truy van du lieu
    //@param sql la cau lenh sql chua co the la tham so . No co the la mot loi goi thu tuc luu
    //@param args la danh sach cac gia tri duoc cung cap cho cac tham so trong cau lenh sql
    public static ResultSet query(String sql , Object... args){
        try {
            PreparedStatement stmt = getStmt(sql, args);
            return stmt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static Object value(String sql,Object... args){
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return null;
    }
    public static Connection getConnection() {
        Connection cn = null;
        try {
            cn = DriverManager.getConnection(dburl, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(JDBCHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }
    
    public static ResultSet executeQuery(String sql, Object... args) {
        try {
            PreparedStatement stmt = prepareStatement(sql, args);
            return stmt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static PreparedStatement prepareStatement(String sql, Object... args) throws SQLException {
        Connection connection = DriverManager.getConnection(dburl, user, pass);
        PreparedStatement pstmt = null;
        if (sql.trim().startsWith("{")) {
            pstmt = connection.prepareCall(sql);
        } else {
            pstmt = connection.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            pstmt.setObject(i + 1, args[i]);
        }
        return pstmt;
    }
    public static void main(String[] args) {
        Connection  cn = getConnection();
        if (cn!=null) {
            System.out.println("Kết nối thành công");
        } else {
            System.out.println("Lỗi kết nối");
        }
    }
}
