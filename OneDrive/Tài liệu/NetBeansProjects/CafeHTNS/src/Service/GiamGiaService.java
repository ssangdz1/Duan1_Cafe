/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.*;
import Model.GiamGia;
import UTILS.JDBCHelper;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author sang
 */
public class GiamGiaService {
    ArrayList<GiamGia> lst = new ArrayList<>();
    public ArrayList<GiamGia> getAll(){
        Connection cn = JDBCHelper.getConnection();
        String sql = "SELECT * FROM MaGIAMGIA";
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {                
                GiamGia gg = new GiamGia();
                gg.setMaSP(rs.getString("MaGG"));
                gg.setMaSP(rs.getString("MaSP"));
                gg.setTenMaGG(rs.getString("TenGG"));
                gg.setNgayBD(rs.getInt("NgayStart"));
                gg.setNgayKT(rs.getInt("NgayStop"));
                gg.setGG(rs.getDouble("GiamGia"));
                gg.setTinhTrang(rs.getBoolean("TinhTrang"));
                
                lst.add(gg);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lst;
    } 
    public Integer addGiamGia(GiamGia gg){
        Integer row = null;
        Connection con = JDBCHelper.getConnection();
        String sql = "insert into MaGiamGia (MaGG, MaSP, TenGG, NgayStart, NgayStop, GiamGia, TinhTrang)/n"+ "values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
                pstm.setString(1, gg.getMaSP());
                pstm.setString(2, gg.getTenMaGG());
                pstm.setInt(3, gg.getNgayBD());
                pstm.setInt(4, gg.getNgayKT());
                pstm.setDouble(5, gg.getGG());
                pstm.setBoolean(6, gg.isTinhTrang());
                row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }
    public Integer UpdateGiamGia(GiamGia gg){
        Integer row = null;
        Connection con = JDBCHelper.getConnection();
        String sql = "update MaGiamGia"+"set MaGG = ?,MaSP = ?,TenGG = ?,NgayStart = ?,NgayStop = ?, Giamgia=?,TinhTrang = ?"+"where MaGG = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
                pstm.setString(1, gg.getMaSP());
                pstm.setString(2, gg.getTenMaGG());
                pstm.setInt(3, gg.getNgayBD());
                pstm.setInt(4, gg.getNgayKT());
                pstm.setDouble(5, gg.getGG());
                pstm.setBoolean(6, gg.isTinhTrang());
                row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }
    public Integer DeleteGiamGia(String gg){
        Integer row = null;
        Connection con = JDBCHelper.getConnection();
        String sql = "delete\n"
                + "from MaGiamGia\n"
                + "where maGG = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, gg);
            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }
}
