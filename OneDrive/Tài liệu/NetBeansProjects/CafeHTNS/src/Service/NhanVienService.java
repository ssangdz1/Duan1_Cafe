/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NhanVien;
import UTILS.JDBCHelper;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author sang
 */
public class NhanVienService {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;
    
    public List<NhanVien> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<NhanVien> list = new ArrayList<>();
        sql = "select * from NhanVien";
        try {
            con = JDBCHelper.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setName(rs.getString("TenNV"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setMale(rs.getBoolean("GioiTinh"));
                nv.setSdt(rs.getString("SDT"));
                nv.setChucVu(rs.getString("ChucVu"));
                list.add(nv);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int Add(NhanVien b) {
        sql = "insert into NhanVien (manv, tennv, diachi,  gioitinh,sdt, chucvu) values (?,?,?,?,?,?)";
        try {
            con = JDBCHelper.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, b.getMaNV());
            ps.setObject(2, b.getName());
            ps.setObject(3, b.getDiaChi());
            ps.setObject(4, b.isMale());
            ps.setObject(5, b.getSdt());
            ps.setObject(6, b.getChucVu());
            return ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

     public int Update1(NhanVien nv,String ma) {
        sql=    "update NhanVien set MaNV = ?,TenNV = ?,DiaChi = ?,GioiTinh = ?,SDT = ?,ChucVu = ? where MaNV =?";
        try {
            con = JDBCHelper.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nv.getMaNV());
            ps.setObject(2, nv.getName());
            ps.setObject(3, nv.getDiaChi());
            ps.setObject(4, nv.isMale());
            ps.setObject(5, nv.getSdt());
            ps.setObject(6, nv.getChucVu());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
     public Integer update(NhanVien nv) {
        Integer row = null;
         con = JDBCHelper.getConnection();
        sql = "update NhanVien\n"
                + "set tennv = ?,diachi = ?,gioitinh = ?,sdt = ?, chucvu = ? \n"
                + "where manv = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setObject(6, nv.getMaNV());
            ps.setObject(1, nv.getName());
            ps.setObject(2, nv.getDiaChi());
            ps.setObject(3, nv.isMale());
            ps.setObject(4, nv.getSdt());
            ps.setObject(5, nv.getChucVu());
            row = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }

    public int Delete(String ma) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        sql = "delete from NhanVien where manv=?";
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
