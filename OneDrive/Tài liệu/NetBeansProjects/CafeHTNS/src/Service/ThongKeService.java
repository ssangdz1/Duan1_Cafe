/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.ThongKe;
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
public class ThongKeService {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;
    
    public List<ThongKe> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<ThongKe> list = new ArrayList<>();
        sql = "select * from ThongKe";
        try {
            con = JDBCHelper.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ThongKe nv = new ThongKe();
                nv.setMaTk(rs.getString("MaTK"));
                nv.setMaHD(rs.getString("MaHD"));
                nv.setNgayTk(rs.getString("ThongKeTheoNgay"));
                nv.setLuong(rs.getFloat("DoanhThu"));
                list.add(nv);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
}
