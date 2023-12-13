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
public class Diem {
    private String masv, tensv;
    private double ta, th,gdtc;

    public Diem() {
    }

    public Diem(String masv, String tensv, double ta, double th, double gdtc) {
        this.masv = masv;
        this.tensv = tensv;
        this.ta = ta;
        this.th = th;
        this.gdtc = gdtc;
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

    public double getTa() {
        return ta;
    }

    public void setTa(double ta) {
        this.ta = ta;
    }

    public double getTh() {
        return th;
    }

    public void setTh(double th) {
        this.th = th;
    }

    public double getGdtc() {
        return gdtc;
    }

    public void setGdtc(double gdtc) {
        this.gdtc = gdtc;
    }
    
    public double getTongKet(){
        double number = (ta+th+gdtc)/3;
        return number;
    }
}
