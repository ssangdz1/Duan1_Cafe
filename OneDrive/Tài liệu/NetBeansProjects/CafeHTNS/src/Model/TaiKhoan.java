/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sang
 */
public class TaiKhoan {
    private int id;
    private String MaTK,Pass;
    private boolean vaitro;

    public TaiKhoan() {
    }

    public TaiKhoan(int id, String MaTK, String Pass, boolean vaitro) {
        this.id = id;
        this.MaTK = MaTK;
        this.Pass = Pass;
        this.vaitro = vaitro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaTK() {
        return MaTK;
    }

    public void setMaTK(String MaTK) {
        this.MaTK = MaTK;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public boolean isVaitro() {
        return vaitro;
    }

    public void setVaitro(boolean vaitro) {
        this.vaitro = vaitro;
    }

    
    
}
