/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author sang
 */
public class HoaDonCT {
      private String MaHDCT,maNV;
      private String maSP;
      private String TenSP;
      private int soluong;
      private double Gia;
      private String maHD;
      private double tongTien;
      private Date ngayxuathoadon;

    public HoaDonCT() {
    }

    public HoaDonCT(String MaHDCT, String maNV, String maSP, String TenSP, int soluong, double Gia, String maHD, double tongTien, Date ngayxuathoadon) {
        this.MaHDCT = MaHDCT;
        this.maNV = maNV;
        this.maSP = maSP;
        this.TenSP = TenSP;
        this.soluong = soluong;
        this.Gia = Gia;
        this.maHD = maHD;
        this.tongTien = tongTien;
        this.ngayxuathoadon = ngayxuathoadon;
    }

    public String getMaHDCT() {
        return MaHDCT;
    }

    public void setMaHDCT(String MaHDCT) {
        this.MaHDCT = MaHDCT;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public Date getNgayxuathoadon() {
        return ngayxuathoadon;
    }

    public void setNgayxuathoadon(Date ngayxuathoadon) {
        this.ngayxuathoadon = ngayxuathoadon;
    }

    

   
      
}
