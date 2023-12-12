/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.CaLamViec;
import UTILS.JDBCHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sang
 */
public class CaLamViecService {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;
    
    public List<CaLamViec> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<CaLamViec> list = new ArrayList<>();
        sql = "select * from CaLamViec";
        try {
            con = JDBCHelper.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                CaLamViec nv = new CaLamViec();
                nv.setMaClv(rs.getString("MaCLV"));
                nv.setMaNV(rs.getString("MaNV"));
                nv.setName(rs.getString("TenCaLam"));
                nv.setNgayB(rs.getString("tgstart"));
                nv.setNgayK(rs.getString("tgStop"));
                nv.setLuong(rs.getFloat("tienLuong"));
                list.add(nv);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public int Add(CaLamViec b) {
        sql = "insert into CaLamViec (MaCLV, MaNV, TenCaLam,  tgstart,tgStop, TienLuong) values (?,?,?,?,?,?)";
        try {
            con = JDBCHelper.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, b.getMaClv());
            ps.setObject(2, b.getMaNV());
            ps.setObject(3, b.getName());
            ps.setObject(4, b.getNgayB());
            ps.setObject(5, b.getNgayK());
            ps.setObject(6, b.getLuong());
            return ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int Delete(String ma) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        sql = "delete from CaLamViec where maCLV=?";
        try {
            con = JDBCHelper.getConnection();
            ps= con.prepareStatement(sql);
            ps.setObject(1, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
