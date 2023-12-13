
package assjava3.model;

import java.util.Date;

public class SinhVien {
    private String maSV;
    private String tenSV;
    private String Email;
    private String SoDT;
    private boolean gioiTinh;
    private String diaChi;
    private String hinhAnh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, String Email, String SoDT, boolean gioiTinh, String diaChi, String hinhAnh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.Email = Email;
        this.SoDT = SoDT;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.hinhAnh = hinhAnh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    
    
}
