/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import utils.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entily.ChuyenDe;

/**
 *
 * @author sang
 */
public class ChuyenDeDAO extends EduSysDAO<ChuyenDe, String> {

    final String INSERT_SQL = "insert into ChuyenDe(MaCD,TenCD,HocPhi,ThoiLuong,Hinh,MoTa) values(?,?,?,?,?,?)";
    final String UPDATE_SQL = "update ChuyenDe set TenCD = ?,HocPhi=?,ThoiLuong=?,Hinh=?,MoTa=? where MaCD=?";
    final String DELETE_SQL = "delete from ChuyenDe where MaCD =?";
    final String SELECT_ALL_SQL = "select*from ChuyenDe";
    final String SELECT_BY_ID_SQL = "select*from ChuyenDe where MaCD = ?";

    @Override
    public void insert(ChuyenDe entity) {
        JDBCHelper.update(INSERT_SQL,
                entity.getMaCD(), entity.getTenCD(),
                entity.getHocPhi(), entity.getThoiLuong(),
                entity.getHinh(), entity.getMoTa());
    }

    @Override
    public void update(ChuyenDe entity) {
        JDBCHelper.update(UPDATE_SQL,
                entity.getTenCD(), entity.getHocPhi(),
                entity.getThoiLuong(), entity.getHinh(),
                entity.getMoTa(), entity.getMaCD());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<ChuyenDe> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChuyenDe selectById(String id) {
        List<ChuyenDe> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public ChuyenDe selectByTenCD(String tenCD) {
        String sql = "select * from ChuyenDe where TenCD=?";
        List<ChuyenDe> list = selectBySql(sql,tenCD);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChuyenDe> selectBySql(String sql, Object... args) {
        List<ChuyenDe> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                ChuyenDe entily = new ChuyenDe();
                entily.setMaCD(rs.getString("MaCD"));
                entily.setTenCD(rs.getString("TenCD"));
                entily.setHocPhi(rs.getDouble("HocPhi"));
                entily.setThoiLuong(rs.getInt("ThoiLuong"));
                entily.setHinh(rs.getString("Hinh"));
                entily.setMoTa(rs.getString("MoTa"));
                list.add(entily);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
