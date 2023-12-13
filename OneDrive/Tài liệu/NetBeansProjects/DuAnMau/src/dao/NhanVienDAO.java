/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import utils.JDBCHelper;
import java.util.ArrayList;
import java.util.List;
import entily.NhanVien;
import java.sql.ResultSet;

/**
 *
 * @author sang
 */
public class NhanVienDAO extends EduSysDAO<NhanVien, String> {

    final String INSERT_SQL = "Insert into NhanVien(MaNV,MatKhau,HoTen,VaiTro) values (?,?,?,?)";
    final String UPDATE_SQL = "Update NhanVien set MatKhau = ?,HoTen=?,VaiTro=? where MaNV=?";
    final String DELETE_SQL = "delete from NhanVien where MaNV=?";
    final String SELECT_ALL_SQL = "select*from NhanVien";
    final String SELECT_BY_ID_SQL = "select*from NhanVien where MaNV = ?";

    @Override
    public void insert(NhanVien entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaNV(), entity.getMatKhau(), entity.getHoTen(), entity.isVaiTro());
    }

    @Override
    public void update(NhanVien entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getMatKhau(), entity.getHoTen(), entity.isVaiTro(), entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = selectBySql(SELECT_BY_ID_SQL,id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                NhanVien enity = new NhanVien();
                enity.setMaNV(rs.getString("MaNV"));
                enity.setMatKhau(rs.getString("MatKhau"));
                enity.setHoTen(rs.getString("HoTen"));
                enity.setVaiTro(rs.getBoolean("VaiTro"));
                list.add(enity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
