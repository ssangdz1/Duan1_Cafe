/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import utils.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entily.KhoaHoc;

/**
 *
 * @author sang
 */
public class KhoaHocDAO extends EduSysDAO<KhoaHoc, Integer> {

    final String INSERT_SQL = "insert into KhoaHoc(MaCD,HocPhi,ThoiLuong,NgayKG,GhiChu,MaNV,NgayTao) values(?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "update KhoaHoc set MaCD=?,HocPhi=?,ThoiLuong=?,NgayKG=?,GhiChu=?,MaNV=?,NgayTao=? where MaKH=?";
    final String DELETE_SQL = "delete from KhoaHoc where MaKH=?";
    final String SELECT_ALL_SQL = "select * from KhoaHoc";
    final String SELECT_BY_ID_SQL = "select * from KhoaHoc where MaKH=?";
    final String SELECT_BY_CHUYEN_DE = "select * from KhoaHoc where MaCD=?";

    @Override
    public void insert(KhoaHoc entity) {
        JDBCHelper.update(INSERT_SQL,
                 entity.getMaCD(),
                entity.getHocPhi(), entity.getThoiLuong(),
                entity.getNgayKG(), entity.getGhiChu(),
                entity.getMaNV(), entity.getNgayTao());
    }

    @Override
    public void update(KhoaHoc entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getMaCD(),
                entity.getHocPhi(), entity.getThoiLuong(),
                entity.getNgayKG(), entity.getGhiChu(),
                entity.getMaNV(), entity.getNgayTao(), entity.getMaKH());
    }

    @Override
    public void delete(Integer id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<KhoaHoc> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }
    public List<KhoaHoc> selectByChuyenDe(String macd) {
        return selectBySql(SELECT_BY_CHUYEN_DE,macd);
    }

    @Override
    public KhoaHoc selectById(Integer id) {
        List<KhoaHoc> list = selectBySql(SELECT_BY_ID_SQL,id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhoaHoc> selectBySql(String sql, Object... args) {
        List<KhoaHoc> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                KhoaHoc enity = new KhoaHoc();
                enity.setMaKH(rs.getInt("MaKH"));
                enity.setMaCD(rs.getString("MaCD"));
                enity.setHocPhi(rs.getDouble("HocPhi"));
                enity.setThoiLuong(rs.getInt("ThoiLuong"));
                enity.setNgayKG(rs.getDate("NgayKG"));
                enity.setGhiChu(rs.getString("GhiChu"));
                enity.setMaNV(rs.getString("MaNV"));
                enity.setNgayTao(rs.getDate("NgayTao"));
                list.add(enity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}

