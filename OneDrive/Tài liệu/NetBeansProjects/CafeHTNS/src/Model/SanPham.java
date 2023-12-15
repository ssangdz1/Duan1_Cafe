/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sang
 */
public class SanPham {

    private String maSP, tenSP;
    private boolean loai;
    private double gia;
    private String hinh;
    private int soLuong;

    public SanPham() {
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public boolean isLoai() {
        return loai;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setLoai(boolean loai) {
        this.loai = loai;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public SanPham(String maSP, String tenSP, boolean loai, double gia, String hinh, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loai = loai;
        this.gia = gia;
        this.hinh = hinh;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return this.tenSP;
    }

//   public void setMaSP(String maSP) {
//    if (maSP != null) {
//        this.maSP = maSP;
//    } else {
//        // Xử lý khi giá trị maSP là null (nếu cần)
//    }
    public void setTenSP(String tenSP) {
        if (tenSP != null) {
            this.tenSP = tenSP;
        } else {
            // Xử lý khi giá trị maSP là null (nếu cần)
            this.tenSP = "";
        }
    }

}
