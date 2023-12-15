/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.HoaDon;
import Model.HoaDonCT;
import Model.SanPham;
import UTILS.JDBCHelper;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sang
 */
public class HoaDonCTService {

    public ArrayList<HoaDon> getAllHoaDonCT() {
        ArrayList<HoaDon> list = new ArrayList<>();
        Connection con = JDBCHelper.getConnection();
        String sql = "select MaHDCT,HoaDonChiTiet.MaHD,HoaDon.MaNV,HoaDonChiTiet.MaSP,SanPham.TenSP, HoaDonChiTiet.SoLuong,Gia,HoaDon.TongTien,HoaDon.NgayXuatHD\n"
                + "from HoaDonChiTiet\n"
                + "    join HoaDon on HoaDonChiTiet.MaHD = HoaDon.MaHD\n"
                + "    join SanPham on HoaDonChiTiet.MaSP = SanPham.MaSP;";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
//                SanPham sp = new SanPham();
//                HoaDonCT hdct = new HoaDonCT();
                hd.setMaHDCT(rs.getString("MaHDCT"));
//                HoaDon hd1 = new HoaDon();
//                hd.setHoadon(hd1);
                hd.setMaHD(rs.getString("MaHD"));
                hd.setMaNV(rs.getString("MaNV"));
                hd.setMaSP(rs.getString("MaSP"));
                hd.setTenSp(rs.getString("TenSP"));
                hd.setSoluong(rs.getInt("SoLuong"));
                hd.setGia(rs.getDouble("Gia"));
//                hdct.setTongtien(rs.getDouble("Tongtien"));
//                hdct.setNgayxuatxu(rs.getDate("NgayxuatHD"));
//                list.add(hd);
                list.add(hd);
//                list.add(sp);
            }
        } catch (Exception e) {
//            System.out.println(e);
        }
        return list;
    }

    public boolean addHoaDonCT(HoaDon hd) {
        int[] arr = {};
        boolean success = false;
        Connection con = JDBCHelper.getConnection();
        String sql = "insert into HoaDonChiTiet(SoLuong, Gia, MaSP,MaHD)\n"
                + "values (?,?,?,?)";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, hd.getSoluong());
            pstm.setDouble(2, hd.getGia());
            pstm.setString(3, hd.getMaSP());
            pstm.setString(4, hd.getMaHD());
            pstm.addBatch();
            int rowsAffected = pstm.executeUpdate();
            success = rowsAffected > 0;

        } catch (Exception e) {
//            System.out.println(e);
        }
        return success;
    }

    public Integer deleteHoaDonCT(String mahd) {
        Integer row = null;
        Connection con = JDBCHelper.getConnection();
        String sql = "delete\n"
                + "from HoaDonChiTiet\n"
                + "where MaHD = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, mahd);
            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }

    public ArrayList<HoaDon> timTheoMAHD2(String mahd) {
        ArrayList<HoaDon> list = new ArrayList<>();
        try {
            String sql = "select MaHDCT,HoaDonChiTiet.MaHD,HoaDonChiTiet.MaSP,SanPham.TenSP, HoaDonChiTiet.SoLuong,Gia,HoaDon.TongTien,HoaDon.NgayXuatHD\n"
                    + "               from HoaDonChiTiet\n"
                    + "                    join HoaDon on HoaDonChiTiet.MaHD = HoaDon.MaHD\n"
                    + "                   join SanPham on HoaDonChiTiet.MaSP = SanPham.MaSP\n"
                    + "where HoaDon.MaHD like ?";
            Connection con = JDBCHelper.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, "%" + mahd + "%");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHDCT(rs.getString("MaHDCT"));
                hd.setMaHD(rs.getString("MaHD"));
                hd.setMaSP(rs.getString("MaSP"));
                hd.setTenSp(rs.getString("TenSP"));
                hd.setSoluong(rs.getInt("SoLuong"));
                hd.setGia(rs.getDouble("Gia"));
                hd.setTongtien(rs.getDouble("Tongtien"));
                hd.setNgayxuatxu(rs.getDate("NgayxuatHD"));
                list.add(hd);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return list;
    }

//    public ArrayList<HoaDonCT> selectByMaHD(String manh) {
//        ArrayList<HoaDonCT> list = new ArrayList<>();
//        try {
//            String sql = "select * from hoadonchitiet where mahd = ?";
//            Connection con = JDBCHelper.getConnection();
//            PreparedStatement pstm = con.prepareStatement(sql);
//            ResultSet rs = pstm.executeQuery();
//            while (rs.next()) {
//                HoaDonCT hdct = new HoaDonCT();
//                hdct.setMaHDCT(rs.getString("mahdct"));
//                hdct.setMaHD(rs.getString("mahd"));
//                hdct.setMaNV(rs.getString("manv"));
//                hdct.setTenSP(rs.getString("tensp"));
//                hdct.setSoluong(rs.getInt("soluong"));
//                hdct.setGia(rs.getDouble("Gia"));
//                list.add(hdct);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }

    public Integer deleteByMaSP(String masp) {
        Integer row = null;
        Connection con = JDBCHelper.getConnection();
        String sql = "delete\n"
                + "from HoaDonChiTiet\n"
                + "where MaSP = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, masp);
            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }

    public ArrayList<HoaDon> getAllSanPhamCT() {
        ArrayList<HoaDon> list = new ArrayList<>();
        Connection con = JDBCHelper.getConnection();
        String sql = "select MaHDCT,HoaDonChiTiet.MaHD,HoaDon.MaNV,SanPham.TenSP, HoaDonChiTiet.SoLuong,Gia from HoaDonChiTiet"
                + " join HoaDon on HoaDonChiTiet.MaHD = HoaDon.MaHD "
                + "  join SanPham on HoaDonChiTiet.MaSP = SanPham.MaSP ORDER BY HoaDonChiTiet.MaHDCT DESC";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHDCT(rs.getString("MaHDCT"));
                hd.setMaHD(rs.getString("MaHD"));
                hd.setMaNV(rs.getString("MaNV"));
                hd.setTenSp(rs.getString("TenSP"));
                hd.setSoluong(rs.getInt("SoLuong"));
                hd.setGia(rs.getDouble("Gia"));
                list.add(hd);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}
