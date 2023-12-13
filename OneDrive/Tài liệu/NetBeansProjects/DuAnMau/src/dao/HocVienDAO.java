/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import utils.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entily.HocVien;
import entily.NhanVien;

/**
 *
 * @author sang
 */
public class HocVienDAO extends EduSysDAO<HocVien, Integer>{
    final String INSERT_SQL = "insert into HocVien(MaKH,MaNH,Diem) values(?,?,?)";
    final String UPDATE_SQL = "update HocVien set MaKH = ?,MaNH=?,Diem=? where MaHV=?";
    final String DELETE_SQL = "delete from HocVien where MaHV=?";
    final String SELECT_ALL_SQL = "select*from HocVien";
    final String SELECT_BY_ID_SQL = "select*from HocVien where MaHV=?";

    @Override
    public void insert(HocVien entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaKH(),entity.getMaNH(),entity.getDiem());
    }

    @Override
    public void update(HocVien entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getMaKH(),entity.getMaNH(),entity.getDiem(),entity.getMaHV());
    }

    @Override
    public void delete(Integer id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<HocVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HocVien selectById(Integer id) {
        List<HocVien> list = selectBySql(SELECT_BY_ID_SQL,id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HocVien> selectBySql(String sql, Object... args) {
        List<HocVien> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                HocVien enity = new HocVien();
                enity.setMaHV(rs.getInt("MaHV"));
                enity.setMaKH(rs.getInt("MaKH"));
                enity.setMaNH(rs.getString("MaNH"));
                enity.setDiem(rs.getDouble("Diem"));
                list.add(enity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public List<HocVien> selectByKhoaHoc(int makh){
        String sql = "SELECT * FROM HocVien Where MaKH = ?";
        return this.selectBySql(sql, makh);
    }
}
