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
import javax.swing.JOptionPane;
import model.Diem;
import model.SinhVien;

/**
 *
 * @author dovan
 */
public class DiemService {

    Connection cn = Helper.ketnoi("AssignmentJava3_SOF");

    public ArrayList<Diem> getAllsDiem() {
        ArrayList<Diem> list = new ArrayList<>();
        try {
            String sql = "select GRADE.MaSV,HoTen,TiengAnh,TinHoc,GDTC,(TiengAnh+TinHoc+GDTC)/3 as N'Tổng kết'\n"
                    + "from GRADE\n"
                    + "inner join STUDENT on STUDENT.MaSV = GRADE.MaSV\n"
                    + "order by N'Tổng kết' desc";;
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                list.add(new Diem(rs.getString(1), rs.getString(2),
                        rs.getDouble(3), rs.getDouble(4), rs.getDouble(5)));
            }
            stm.close();
            rs.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Integer insertDiem(Diem x) {
        Integer row = null;
        try {
            String sql = "insert into GRADE\n"
                    + "    values(?,?,?,?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, x.getMasv());
            pstm.setDouble(2, x.getTa());
            pstm.setDouble(3, x.getTh());
            pstm.setDouble(4, x.getGdtc());
            row = pstm.executeUpdate();
            return row;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;
    }
    
    public Integer updateDiem(Diem x) {
        Integer row = null;
        try {
            String sql = "update GRADE\n"
                    + "set TiengAnh=?,TinHoc=?,GDTC=?\n"
                    + "where MaSV=?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(4, x.getMasv());
            pstm.setDouble(1, x.getTa());
            pstm.setDouble(2, x.getTh());
            pstm.setDouble(3, x.getGdtc());
            row = pstm.executeUpdate();
            return row;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;
    }
    
    public Integer deleteDiem(String ma) {
        Integer row = null;
        try {
            String sql = "delete GRADE\n"
                    + "where MaSV = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, ma);
            row = pstm.executeUpdate();
            return row;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;
    }
}
