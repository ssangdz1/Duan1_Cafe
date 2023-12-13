/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assjava3.service;

import java.util.ArrayList;
import assjava3.model.TaiKhoan;
import assjava3.unility.DBContext;
import java.sql.*;
/**
 *
 * @author cungtiennga
 */
public class TaiKhoanService {
    public Integer addTK(TaiKhoan tk){
        Integer row = null;
        Connection con = DBContext.getConnection();
        String sql = "insert into Users(userName, pass, role,confirmpass,gmail)\n" +
"values (?,?,?,?,?)";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, tk.getUser());
            pstm.setString(2, tk.getPass());
            pstm.setString(3, tk.getRole());
            pstm.setString(4, tk.getCpass());
            pstm.setString(5, tk.getGmail());
            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }
    
    public Integer updateTK(TaiKhoan tk){
        Integer row = null;
        Connection con = DBContext.getConnection();
        String sql = "UPDATE Users SET pass = ? WHERE username = ? AND gmail = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(2, tk.getUser());
            pstm.setString(1, tk.getPass());
            pstm.setString(3, tk.getGmail());
            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }
    
    public Integer tontaiTK(TaiKhoan tk){
        Integer row = null;
        Connection con = DBContext.getConnection();
        String sql = "SELECT * FROM Users WHERE username = ? and Users.gmail = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, tk.getUser());
            pstm.setString(2, tk.getGmail());
            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }
    
    
//    public ArrayList<TaiKhoan> getAllCombo(){
//        ArrayList<TaiKhoan> list = new ArrayList<>();
//        Connection con = DBContext.getConnection();
//        String sql = "select *\n" +
//                        "from Users";
//        try {
//            PreparedStatement pstm = con.prepareStatement(sql);
//            ResultSet rs = pstm.executeQuery();
//            while (rs.next()) {                
//                TaiKhoan tk = new TaiKhoan();
//                tk.setRole(rs.getString("Role"));
//                list.add(tk);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return list;
//    }
}
