/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assjava3.service;

import assjava3.model.Diem;
import assjava3.unility.DBContext;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;


/**
 *
 * @author cungtiennga
 */
public class DiemService {
    ArrayList<Diem> listt = new ArrayList<>();
   public ArrayList<Diem> getAllDiem(){
       ArrayList<Diem> list = new ArrayList<>();
       try {
           String sql = "select Grade.MASV,Students.HoTen,TiengAnh,TinHoc,GDTC, (TiengAnh + TinHoc + GDTC)/3 as 'DiemTB' "
                        + "from Students,Grade\n" 
                        + "where Students.MASV = Grade.MASV";
           Connection con = DBContext.getConnection();
           PreparedStatement pstm = con.prepareStatement(sql);
           ResultSet rs = pstm.executeQuery();
           while (rs.next()) {               
               Diem diem = new Diem();
               diem.setMasv(rs.getString(1));
               diem.setHoten(rs.getString(2));
               diem.setTienganh(rs.getInt(3));
               diem.setTinhoc(rs.getInt(4));
               diem.setGdtc(rs.getInt(5));
               list.add(diem);
               Collections.sort(list, new Comparator<Diem>() {
                @Override
                public int compare(Diem sg1, Diem sg2) {
                    return Double.compare(sg2.getDiemTb(), sg1.getDiemTb());
                }
            });
           }
       } catch (Exception e) {
           System.out.println(e);
       }
       
       return list;
    }
   
   public Integer addDiem(Diem d){
       Integer row = null;
       String sql = "insert into Grade(MASV, TiengAnh, TinHoc, GDTC) values (?,?,?,?)";
       Connection con = DBContext.getConnection();
       try {
           PreparedStatement pstm = con.prepareStatement(sql);
           pstm.setString(1 , d.getMasv());
           pstm.setInt(2 , d.getTienganh());
           pstm.setInt(3 , d.getTinhoc());
           pstm.setInt(4 , d.getGdtc());
           row = pstm.executeUpdate();
            } catch (Exception e) {
                System.out.println(e);
       }
       return row;
   }
   
   public Integer updateDiem(Diem d){
       Integer row = null;
       String sql = "update Grade set TiengAnh = ?, TinHoc = ?, GDTC = ? where MASV = ?";
       Connection con = DBContext.getConnection();
       try {
           PreparedStatement pstm = con.prepareStatement(sql);
           pstm.setString(4 , d.getMasv());
           pstm.setInt(1 , d.getTienganh());
           pstm.setInt(2 , d.getTinhoc());
           pstm.setInt(3 , d.getGdtc());
           row = pstm.executeUpdate();
            } catch (Exception e) {
                System.out.println(e);
       }
       return row;
   }
   
   public Integer deleteDiem(String masv){
       Integer row = null;
       String sql = "delete from Grade where MASV = ? ";
       Connection con = DBContext.getConnection();
       try {
           PreparedStatement pstm = con.prepareStatement(sql);
           pstm.setString(1 , masv);
           row = pstm.executeUpdate();
            } catch (Exception e) {
                System.out.println(e);
       }
       return row;
   }
   
   public ArrayList<Diem> timTheoMASV(String masv){
       ArrayList<Diem> list = new ArrayList<>();
       try {
           String sql = "select Grade.MASV,Students.HoTen,TiengAnh,TinHoc,GDTC, (TiengAnh + TinHoc + GDTC)/3 as 'DiemTB' "
                        + "from Students,Grade\n" 
                        + "where Students.MASV = Grade.MASV and Students.MASV like ?";
           Connection con = DBContext.getConnection();
           PreparedStatement pstm = con.prepareStatement(sql);
           pstm.setString(1, "%"+masv+"%");
           ResultSet rs = pstm.executeQuery();
           while (rs.next()) {               
               Diem diem = new Diem();
               diem.setMasv(rs.getString(1));
               diem.setHoten(rs.getString(2));
               diem.setTienganh(rs.getInt(3));
               diem.setTinhoc(rs.getInt(4));
               diem.setGdtc(rs.getInt(5));
               list.add(diem);
           }
       } catch (Exception e) {
           System.out.println(e);
       }
       
       return list;
    }
   public Diem getAtposition(int pos){
       return listt.get(pos);
   }
   
   
   public ArrayList<Diem> sapxeptheoMasv(){
       ArrayList<Diem> list = new ArrayList<>();
       try {
           String sql = "select Grade.MASV,Students.HoTen,TiengAnh,TinHoc,GDTC, (TiengAnh + TinHoc + GDTC)/3 as 'DiemTB' "
                        + "from Students,Grade\n" 
                        + "where Students.MASV = Grade.MASV";
           Connection con = DBContext.getConnection();
           PreparedStatement pstm = con.prepareStatement(sql);
           ResultSet rs = pstm.executeQuery();
           while (rs.next()) {               
               Diem diem = new Diem();
               diem.setMasv(rs.getString(1));
               diem.setHoten(rs.getString(2));
               diem.setTienganh(rs.getInt(3));
               diem.setTinhoc(rs.getInt(4));
               diem.setGdtc(rs.getInt(5));
               list.add(diem);
               Collections.sort(list, new Comparator<Diem>() {
                    @Override
                    public int compare(Diem sg1, Diem sg2) {
                        String masv1 = sg1.getMasv();
                        String masv2 = sg2.getMasv();

                        // So sánh theo kí tự của chuỗi masv
                        return masv1.compareTo(masv2);
                    }
                });
           }
       } catch (Exception e) {
           System.out.println(e);
       }
       
       return list;
    }
   
   
   public ArrayList<Diem> sapxeptheoDiemTb(){
       ArrayList<Diem> list = new ArrayList<>();
       try {
           String sql = "select Grade.MASV,Students.HoTen,TiengAnh,TinHoc,GDTC, (TiengAnh + TinHoc + GDTC)/3 as 'DiemTB' "
                        + "from Students,Grade\n" 
                        + "where Students.MASV = Grade.MASV";
           Connection con = DBContext.getConnection();
           PreparedStatement pstm = con.prepareStatement(sql);
           ResultSet rs = pstm.executeQuery();
           while (rs.next()) {               
               Diem diem = new Diem();
               diem.setMasv(rs.getString(1));
               diem.setHoten(rs.getString(2));
               diem.setTienganh(rs.getInt(3));
               diem.setTinhoc(rs.getInt(4));
               diem.setGdtc(rs.getInt(5));
               list.add(diem);
               Collections.sort(list, new Comparator<Diem>() {
                @Override
                public int compare(Diem sg1, Diem sg2) {
                    return Double.compare(sg2.getDiemTb(), sg1.getDiemTb());
                }
            });
           }
       } catch (Exception e) {
           System.out.println(e);
       }
       
       return list;
    }
   
   public ArrayList<Diem> sapxeptheoTen(){
       ArrayList<Diem> list = new ArrayList<>();
       try {
           String sql = "select Grade.MASV,Students.HoTen,TiengAnh,TinHoc,GDTC, (TiengAnh + TinHoc + GDTC)/3 as 'DiemTB' "
                        + "from Students,Grade\n" 
                        + "where Students.MASV = Grade.MASV";
           Connection con = DBContext.getConnection();
           PreparedStatement pstm = con.prepareStatement(sql);
           ResultSet rs = pstm.executeQuery();
           while (rs.next()) {               
               Diem diem = new Diem();
               diem.setMasv(rs.getString(1));
               diem.setHoten(rs.getString(2));
               diem.setTienganh(rs.getInt(3));
               diem.setTinhoc(rs.getInt(4));
               diem.setGdtc(rs.getInt(5));
               list.add(diem);
               Collections.sort(list, new Comparator<Diem>() {
                    @Override
                    public int compare(Diem sg1, Diem sg2) {
                        String tensv1 = sg1.getHoten();
                        String tensv2 = sg2.getHoten();

                        // So sánh theo kí tự của chuỗi masv
                        return tensv1.compareTo(tensv2);
                    }
                });
           }
       } catch (Exception e) {
           System.out.println(e);
       }
       
       return list;
    }
   
   public ArrayList<Diem> sapxeptheodiemTiengAnh(){
       ArrayList<Diem> list = new ArrayList<>();
       try {
           String sql = "select Grade.MASV,Students.HoTen,TiengAnh,TinHoc,GDTC, (TiengAnh + TinHoc + GDTC)/3 as 'DiemTB' "
                        + "from Students,Grade\n" 
                        + "where Students.MASV = Grade.MASV";
           Connection con = DBContext.getConnection();
           PreparedStatement pstm = con.prepareStatement(sql);
           ResultSet rs = pstm.executeQuery();
           while (rs.next()) {               
               Diem diem = new Diem();
               diem.setMasv(rs.getString(1));
               diem.setHoten(rs.getString(2));
               diem.setTienganh(rs.getInt(3));
               diem.setTinhoc(rs.getInt(4));
               diem.setGdtc(rs.getInt(5));
               list.add(diem);
               Collections.sort(list, new Comparator<Diem>() {
                @Override
                public int compare(Diem sg1, Diem sg2) {
                    return Double.compare(sg2.getTienganh(), sg1.getTienganh());
                }
            });
           }
       } catch (Exception e) {
           System.out.println(e);
       }
       
       return list;
    }
   
   public ArrayList<Diem> sapxeptheodiemTinHoc(){
       ArrayList<Diem> list = new ArrayList<>();
       try {
           String sql = "select Grade.MASV,Students.HoTen,TiengAnh,TinHoc,GDTC, (TiengAnh + TinHoc + GDTC)/3 as 'DiemTB' "
                        + "from Students,Grade\n" 
                        + "where Students.MASV = Grade.MASV";
           Connection con = DBContext.getConnection();
           PreparedStatement pstm = con.prepareStatement(sql);
           ResultSet rs = pstm.executeQuery();
           while (rs.next()) {               
               Diem diem = new Diem();
               diem.setMasv(rs.getString(1));
               diem.setHoten(rs.getString(2));
               diem.setTienganh(rs.getInt(3));
               diem.setTinhoc(rs.getInt(4));
               diem.setGdtc(rs.getInt(5));
               list.add(diem);
               Collections.sort(list, new Comparator<Diem>() {
                @Override
                public int compare(Diem sg1, Diem sg2) {
                    return Double.compare(sg2.getTinhoc(), sg1.getTinhoc());
                }
            });
           }
       } catch (Exception e) {
           System.out.println(e);
       }
       
       return list;
    }
   
   public ArrayList<Diem> sapxeptheodiemGDTC(){
       ArrayList<Diem> list = new ArrayList<>();
       try {
           String sql = "select Grade.MASV,Students.HoTen,TiengAnh,TinHoc,GDTC, (TiengAnh + TinHoc + GDTC)/3 as 'DiemTB' "
                        + "from Students,Grade\n" 
                        + "where Students.MASV = Grade.MASV";
           Connection con = DBContext.getConnection();
           PreparedStatement pstm = con.prepareStatement(sql);
           ResultSet rs = pstm.executeQuery();
           while (rs.next()) {               
               Diem diem = new Diem();
               diem.setMasv(rs.getString(1));
               diem.setHoten(rs.getString(2));
               diem.setTienganh(rs.getInt(3));
               diem.setTinhoc(rs.getInt(4));
               diem.setGdtc(rs.getInt(5));
               list.add(diem);
               Collections.sort(list, new Comparator<Diem>() {
                @Override
                public int compare(Diem sg1, Diem sg2) {
                    return Double.compare(sg2.getGdtc(), sg1.getGdtc());
                }
            });
           }
       } catch (Exception e) {
           System.out.println(e);
       }
       
       return list;
    }
   
   private boolean isMasvExists(String masv) {
        String query = "SELECT COUNT(*) AS count FROM Grade WHERE Masv = ?";
        Connection con = DBContext.getConnection();
        try (PreparedStatement pstm = con.prepareStatement(query)) {
        pstm.setString(1, masv);
        try (ResultSet rs = pstm.executeQuery()) {
            if (rs.next()) {
                int count = rs.getInt("count");
                return count > 0;
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        
    }

    return false;
        
//
//        try (Connection connection
//                = // Your database connection;
//                PreparedStatement 
//            preparedStatement = connection.prepareStatement(query)
//            
//                ) {
//
//        preparedStatement.setString(1, masv);
//
//                try (ResultSet resultSet = preparedStatement.executeQuery()) {
//                    return resultSet.next() && resultSet.getInt("count") > 0;
//                }
//
//            }catch (SQLException e) {
//        e.printStackTrace();
//        JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi kiểm tra trùng khóa chính");
//        return false;
//    }
        }
}
