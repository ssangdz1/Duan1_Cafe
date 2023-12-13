/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import utils.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entily.NguoiHoc;
import entily.NhanVien;

/**
 *
 * @author sang
 */
public class NguoiHocDAO extends EduSysDAO<NguoiHoc, String> {

    final String INSERT_SQL = "insert into NguoiHoc(MaNH,HoTen,GioiTinh,NgaySinh,DienThoai,Email,GhiChu,MaNV,NgayDK) values(?,?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "update NguoiHoc set HoTen=?,GioiTinh=?,NgaySinh=?,DienThoai=?,Email=?,GhiChu=?,MaNV=?,NgayDK=? where MaNH=?";
    final String DELETE_SQL = "delete from NguoiHoc where MaNH=?";
    final String SELECT_ALL_SQL = "select*from NguoiHoc";
    final String SELECT_BY_ID_SQL = "select*from NguoiHoc where MaNH=?";

    @Override
    public void insert(NguoiHoc entity) {
        JDBCHelper.update(INSERT_SQL,
                entity.getMaNH(), entity.getHoTen(),
                entity.isGioiTinh(), entity.getNgaySinh(),
                entity.getDienThoai(), entity.getEmail(),
                entity.getGhiChu(), entity.getMaNV(), entity.getNgayDK());
    }

    @Override
    public void update(NguoiHoc entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getHoTen(),
                entity.isGioiTinh(), entity.getNgaySinh(),
                entity.getDienThoai(), entity.getEmail(),
                entity.getGhiChu(), entity.getMaNV(),
                entity.getNgayDK(), entity.getMaNH());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<NguoiHoc> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NguoiHoc selectById(String id) {
        List<NguoiHoc> list = selectBySql(SELECT_BY_ID_SQL,id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NguoiHoc> selectBySql(String sql, Object... args) {
        List<NguoiHoc> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                NguoiHoc enity = new NguoiHoc();
                enity.setMaNH(rs.getString("MaNH"));
                enity.setHoTen(rs.getString("HoTen"));
                enity.setGioiTinh(rs.getBoolean("GioiTinh"));
                enity.setNgaySinh(rs.getDate("NgaySinh"));
                enity.setDienThoai(rs.getString("DienThoai"));
                enity.setEmail(rs.getString("Email"));
                enity.setGhiChu(rs.getString("GhiChu"));
                enity.setMaNV(rs.getString("MaNV"));
                enity.setNgayDK(rs.getDate("NgayDK"));
                list.add(enity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public List<NguoiHoc> selectByKeyword(String keyword){
        String sql = "SELECT * FROM NguoiHoc WHERE HoTen like ?";
        return this.selectBySql(sql,"%"+keyword+"%");
    }
    
    public List<NguoiHoc> selectNotInCourse(int makh,String keyword){
            String sql = "SELECT * FROM NguoiHoc"
                    +" WHERE HoTen LIKE ? AND"
                    +" MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH=?)";
            return this.selectBySql(sql, "%"+keyword+"%",makh);
        }
}
