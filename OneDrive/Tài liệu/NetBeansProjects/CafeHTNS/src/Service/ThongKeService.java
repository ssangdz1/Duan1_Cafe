/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.HoaDon;
import Model.HoaDonCT;
import Model.ThongKe;
import UTILS.JDBCHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
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
    
    public ArrayList<ThongKe> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<ThongKe> list = new ArrayList<>();
        sql = "select count(HoaDon.MaHD) as 'Số HD' ,hoadon.NgayXuatHD, sum(SoLuong*Gia) as 'Doanh Thu' from HoaDonChiTiet \n" +
"inner join HoaDon on HoaDonChiTiet.MaHD = HoaDon.MaHD group by hoadon.NgayXuatHD";
        try {
            con = JDBCHelper.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ThongKe tk = new ThongKe();
                HoaDon hd = new HoaDon();
                tk.setMaHD(String.valueOf(hd.getMaHD()));
                tk.setNgayTk(String.valueOf(hd.getNgayxuatxu()));
                tk.setLuong(Double.valueOf(hd.getTongtien()));
                list.add(tk);
            }
            return (ArrayList<ThongKe>) list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
}
