/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author sang
 */
public class CaLamViec {
    private String maClv;
    private String maNV;
    private String name;
    private String ngayB;
    private String ngayK;
    private float luong;

    public CaLamViec() {
    }

    public CaLamViec(String maClv, String maNV, String name, String ngayB, String ngayK, float luong) {
        this.maClv = maClv;
        this.maNV = maNV;
        this.name = name;
        this.ngayB = ngayB;
        this.ngayK = ngayK;
        this.luong = luong;
    }

    

    public String getMaClv() {
        return maClv;
    }

    public void setMaClv(String maClv) {
        this.maClv = maClv;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgayB() {
        return ngayB;
    }

    public void setNgayB(String ngayB) {
        this.ngayB = ngayB;
    }

    public String getNgayK() {
        return ngayK;
    }

    public void setNgayK(String ngayK) {
        this.ngayK = ngayK;
    }

    

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    public Object[] toDataRow(){
        return new Object[]{this.maClv,this.maNV,this.name,this.ngayB,this.ngayK,this.luong};
    }
}
