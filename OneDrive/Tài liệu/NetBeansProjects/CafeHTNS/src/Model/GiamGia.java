/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sang
 */
public class GiamGia {
    private int MaGG,NgayBD,NgayKT;
    private String MaSP,TenMaGG;
    private double GG;
    private boolean TinhTrang;

    public GiamGia() {
    }
    

    public int getMaGG() {
        return MaGG;
    }

    public void setMaGG(int MaGG) {
        this.MaGG = MaGG;
    }

    public int getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(int NgayBD) {
        this.NgayBD = NgayBD;
    }

    public int getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(int NgayKT) {
        this.NgayKT = NgayKT;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenMaGG() {
        return TenMaGG;
    }

    public void setTenMaGG(String TenMaGG) {
        this.TenMaGG = TenMaGG;
    }

    public double getGG() {
        return GG;
    }

    public void setGG(double GG) {
        this.GG = GG;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public GiamGia(int MaGG, int NgayBD, int NgayKT, String MaSP, String TenMaGG, double GG, boolean TinhTrang) {
        this.MaGG = MaGG;
        this.NgayBD = NgayBD;
        this.NgayKT = NgayKT;
        this.MaSP = MaSP;
        this.TenMaGG = TenMaGG;
        this.GG = GG;
        this.TinhTrang = TinhTrang;
    }
          
}
