/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assjava3.service;

import assjava3.model.SinhVien;
import assjava3.unility.DBContext;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author cungtiennga
 */
public class SinhVienService {

    public ArrayList<SinhVien> getAllSV() {
        ArrayList<SinhVien> list = new ArrayList<>();
        Connection con = DBContext.getConnection();
        String sql = "Select * from Students";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSV(rs.getString(1));
                sv.setTenSV(rs.getString(2));
                sv.setEmail(rs.getString(3));
                sv.setSoDT(rs.getString(4));
                sv.setGioiTinh(rs.getBoolean(5));
                sv.setDiaChi(rs.getString(6));
                sv.setHinhAnh(rs.getString(7));
                list.add(sv);
            }

        } catch (Exception e) {
        }
        return list;
    }

    public Integer addSinhVien(SinhVien sv) {
        Integer row = null;
        Connection con = DBContext.getConnection();
        String sql = "insert into Students(MASV, HoTen, Email, SoDT, Gioitinh, Diachi, Hinh) \n"
                + "values (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, sv.getMaSV());
            pstm.setString(2, sv.getTenSV());
            pstm.setString(3, sv.getEmail());
            pstm.setString(4, sv.getSoDT());
            pstm.setBoolean(5, sv.isGioiTinh());
            pstm.setString(6, sv.getDiaChi());
            pstm.setString(7, sv.getHinhAnh());
            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }

    public Integer UpdateSinhVien(SinhVien sv) {
        Integer row = null;
        Connection con = DBContext.getConnection();
        String sql = "update Students set HoTen = ?, Email = ?, SoDT = ?, Gioitinh = ?, Diachi = ?, Hinh = ? where MASV = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(7, sv.getMaSV());
            pstm.setString(1, sv.getTenSV());
            pstm.setString(2, sv.getEmail());
            pstm.setString(3, sv.getSoDT());
            pstm.setBoolean(4, sv.isGioiTinh());
            pstm.setString(5, sv.getDiaChi());
            pstm.setString(6, sv.getHinhAnh());
            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }

    public Integer deleteSinhVien(String maSV) {
        Integer row = null;
        Connection con = DBContext.getConnection();
        String sql = "delete Students where MASV = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, maSV);

            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }
}
