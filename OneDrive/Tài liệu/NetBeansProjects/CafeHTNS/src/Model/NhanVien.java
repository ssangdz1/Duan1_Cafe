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
    private int id;
    private String maNV;
    private String diaChi;
    private String male;
    private String sdt;
    private String name;
    private String chucVu;

    public NhanVien() {
    }

    public NhanVien( String maNV, String name,String diaChi , String male, String sdt, String chucVu) {
        this.maNV = maNV;
        this.name = name;
        this.diaChi = diaChi;
        this.male = male;
        this.sdt = sdt;
        this.chucVu = chucVu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
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
    
    public  Object[] toDataRow(){
      return new Object[]{this.maNV,this.name,this.diaChi,this.male, this.sdt,this.chucVu};
    }
}
