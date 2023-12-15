/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SanPham;
import java.util.ArrayList;
import java.sql.*;
import UTILS.JDBCHelper;
import java.util.List;

/**
 *
 * @author sang
 */
public class SanPhamService {

    final String SELECT_BY_SanPham = "select * from SanPham where TenSP = ?";

    public ArrayList<SanPham> getAllSP() {
        ArrayList<SanPham> list = new ArrayList<>();
        Connection con = JDBCHelper.getConnection();
        String sql = "select * from SanPham";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getString("maSP"));
                sp.setTenSP(rs.getString("tenSP"));
                sp.setLoai(rs.getBoolean("loai"));
                sp.setGia(rs.getDouble("giaGoc"));
                sp.setHinh(rs.getString("hinh"));
                sp.setSoLuong(rs.getInt("soLuong"));
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public Integer addSanPham(SanPham sp) {
        Integer row = null;
        Connection con = JDBCHelper.getConnection();
        String sql = "insert into SanPham(maSP, tenSP, loai, giaGoc, hinh, soLuong)\n"
                + "values (?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, sp.getMaSP());
            pstm.setString(2, sp.getTenSP());
            pstm.setBoolean(3, sp.isLoai());
            pstm.setDouble(4, sp.getGia());
            pstm.setString(5, sp.getHinh());
            pstm.setInt(6, sp.getSoLuong());
            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }

    public Integer updateSanPham(SanPham sp) {
        Integer row = null;
        Connection con = JDBCHelper.getConnection();
        String sql = "update SanPham\n"
                + "set tenSP = ?,loai = ?,giaGoc = ?,hinh = ?,soLuong = ?\n"
                + "where maSP = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(6, sp.getMaSP());
            pstm.setString(1, sp.getTenSP());
            pstm.setBoolean(2, sp.isLoai());
            pstm.setDouble(3, sp.getGia());
            pstm.setString(4, sp.getHinh());
            pstm.setInt(5, sp.getSoLuong());
            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }

    public Integer deleteSanPham(String sp) {
        Integer row = null;
        Connection con = JDBCHelper.getConnection();
        String sql = "delete\n"
                + "from SanPham\n"
                + "where maSP = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, sp);
            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }

    public List<SanPham> selectBySanPham(String tensp) {
        return selectBySql(SELECT_BY_SanPham, tensp);
    }

    public List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getString("maSP"));
                sp.setTenSP(rs.getString("tenSP"));
                sp.setLoai(rs.getBoolean("loai"));
                sp.setGia(rs.getDouble("giaGoc"));
                sp.setHinh(rs.getString("hinh"));
                sp.setSoLuong(rs.getInt("soLuong"));
                list.add(sp);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private SanPham readFromResultSet(ResultSet rs) throws SQLException {
        SanPham sp = new SanPham();
        sp.setMaSP(rs.getString("maSP"));
        sp.setTenSP(rs.getString("tenSP"));
        sp.setLoai(rs.getBoolean("loai"));
        sp.setGia(rs.getDouble("giaGoc"));
        sp.setHinh(rs.getString("hinh"));
        sp.setSoLuong(rs.getInt("soLuong"));
        return sp;
    }

    private List<SanPham> select(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    SanPham model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    public List<SanPham> select() {
        String sql = "SELECT * FROM SanPham";
        return select(sql);
    }

    public ArrayList<SanPham> getAllComboSp() {
        ArrayList<SanPham> list = new ArrayList<>();
        Connection con = JDBCHelper.getConnection();
        String sql = "select * from SanPham";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
//                sp.setMaSP(rs.getString("maSP"));
                sp.setTenSP(rs.getString("TenSP"));
                list.add(sp);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}
