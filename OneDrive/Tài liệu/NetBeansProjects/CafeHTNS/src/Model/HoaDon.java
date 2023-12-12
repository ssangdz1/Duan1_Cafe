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
public class HoaDon {
    private String MaHD,maNV;
    private double Tongtien;
    private String MaHDCT;
    private Date Ngayxuatxu;
    private int soluong;
    private double gia;
    private String maSP;
    private String tenSp;

    public HoaDon() {
    }

    public HoaDon(String MaHD, String maNV, double Tongtien, String MaHDCT, Date Ngayxuatxu, int soluong, double gia, String maSP, String tenSp) {
        this.MaHD = MaHD;
        this.maNV = maNV;
        this.Tongtien = Tongtien;
        this.MaHDCT = MaHDCT;
        this.Ngayxuatxu = Ngayxuatxu;
        this.soluong = soluong;
        this.gia = gia;
        this.maSP = maSP;
        this.tenSp = tenSp;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public double getTongtien() {
        return Tongtien;
    }

    public void setTongtien(double Tongtien) {
        this.Tongtien = Tongtien;
    }

    public String getMaHDCT() {
        return MaHDCT;
    }

    public void setMaHDCT(String MaHDCT) {
        this.MaHDCT = MaHDCT;
    }

    public Date getNgayxuatxu() {
        return Ngayxuatxu;
    }

    public void setNgayxuatxu(Date Ngayxuatxu) {
        this.Ngayxuatxu = Ngayxuatxu;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }
    
    public double  gettongtien(){
       return this.Tongtien = this.soluong*this.gia;
    }

    
}
