/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sang
 */
public class ThongKe {
    private String maTk;
    private String maHD;
    private String ngayTk;
    private double luong;

    public ThongKe() {
    }

    public ThongKe(String maTk, String maHD, String ngayTk, double luong) {
        this.maTk = maTk;
        this.maHD = maHD;
        this.ngayTk = ngayTk;
        this.luong = luong;
    }

    public String getMaTk() {
        return maTk;
    }

    public void setMaTk(String maTk) {
        this.maTk = maTk;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayTk() {
        return ngayTk;
    }

    public void setNgayTk(String ngayTk) {
        this.ngayTk = ngayTk;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public Object[] toDataRow(){
        return new Object[]{this.maTk,this.maHD,this.ngayTk,this.luong};
    }
}
