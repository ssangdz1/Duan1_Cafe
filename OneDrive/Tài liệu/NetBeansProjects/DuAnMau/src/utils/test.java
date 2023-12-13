/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.List;
import entily.NhanVien;
import dao.NhanVienDAO;
import dao.ThongKeDAO;

/**
 *
 * @author sang
 */
public class test {
    public static void main(String[] args) {
        NhanVienDAO dao = new NhanVienDAO();
        List<NhanVien> list = dao.selectAll();
        for (NhanVien nv : list) {
            System.err.println("=>"+nv.getMaNV());
        }
//        NhanVienDAO dao = new NhanVienDAO();
//        dao.insert(new NhanVien("SangDD1","Sang DD","123",true));
//        List<NhanVien> list = dao.selectAll();
//        for(NhanVien nv : list){
//            System.out.println("=>"+nv.toString());
//        }

    }
}
