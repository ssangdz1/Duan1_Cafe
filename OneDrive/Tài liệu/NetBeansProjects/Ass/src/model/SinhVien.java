/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DecimalFormat;

/**
 *
 * @author dovan
 */
public class SinhVien {
    private String masv,tensv,email,sdt;
    private boolean gt;
    private String diachi,hinh;

    public SinhVien() {
    }

    public SinhVien(String masv, String tensv, String email, String sdt, boolean gt, String diachi, String hinh) {
        this.masv = masv;
        this.tensv = tensv;
        this.email = email;
        this.sdt = sdt;
        this.gt = gt;
        this.diachi = diachi;
        this.hinh = hinh;
    }

    

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }
}
