/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sang
 */
public class NhanVien {

    private String maNV;
    private String diaChi;
    private boolean male;
    private String sdt;
    private String name;
    private String chucVu;

    public NhanVien( String maNV, String diaChi, boolean male, String sdt, String name, String chucVu) {
        this.maNV = maNV;
        this.diaChi = diaChi;
        this.male = male;
        this.sdt = sdt;
        this.name = name;
        this.chucVu = chucVu;
    }

    public NhanVien() {
    }


    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }


    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
    

    public Object[] toDataRow() {
        return new Object[]{this.maNV, this.name, this.diaChi, this.male, this.sdt, this.chucVu};
    }
}
