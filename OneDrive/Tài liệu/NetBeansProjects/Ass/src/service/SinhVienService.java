/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import UHelper.Helper;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.SinhVien;

/**
 *
 * @author dovan
 */
public class SinhVienService {

    Connection cn = Helper.ketnoi("AssignmentJava3_SOF");

    public ArrayList<SinhVien> getAllsSinhVien() {
        ArrayList<SinhVien> list = new ArrayList<>();
        try {
            String sql = "select * from STUDENT";
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                list.add(new SinhVien(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4),
                        rs.getBoolean(5), rs.getString(6),
                        rs.getString(7)));
            }
            stm.close();
            rs.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public Integer insertSV(SinhVien x){
        Integer chon = null;
        try {
            String sql = "insert into STUDENT (MaSV,HoTen,Email,SoDt,GioiTinh,DiaChi,Hinh)\n"
                    + "values(?,?,?,?,?,?,?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, x.getMasv());
            pstm.setString(2, x.getTensv());
            pstm.setString(3, x.getEmail());
            pstm.setString(4, x.getSdt());
            pstm.setBoolean(5, x.isGt());
            pstm.setString(6, x.getDiachi());
            pstm.setString(7, x.getHinh());
            chon = pstm.executeUpdate();
            return chon;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return chon;
    }
    
    public Integer updateSV(SinhVien x){
        Integer chon = null;
        try {
            String sql = "update STUDENT\n"
                    + "set HoTen=?,Email=?,SoDt=?,GioiTinh=?,DiaChi=?,Hinh=?\n"
                    + "where MaSV=?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(7, x.getMasv());
            pstm.setString(1, x.getTensv());
            pstm.setString(2, x.getEmail());
            pstm.setString(3, x.getSdt());
            pstm.setBoolean(4, x.isGt());
            pstm.setString(5, x.getDiachi());
            pstm.setString(6, x.getHinh());
            chon = pstm.executeUpdate();
            return chon;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return chon;
    }
    
    public Integer deleteSV(String ma){
        Integer chon = null;
        try {
            String sql = "delete STUDENT\n"
                    + "where MaSV = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, ma);
            chon = pstm.executeUpdate();
            return chon;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return chon;
    }
}
