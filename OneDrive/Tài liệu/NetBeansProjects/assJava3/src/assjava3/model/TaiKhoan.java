/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assjava3.model;

/**
 *
 * @author cungtiennga
 */
public class TaiKhoan {
    private String user;
    private String pass;
    private String role;
    private String cpass;
    private String gmail;

    public TaiKhoan() {
    }

    public TaiKhoan(String user, String pass, String role, String cpass, String gmail) {
        this.user = user;
        this.pass = pass;
        this.role = role;
        this.cpass = cpass;
        this.gmail = gmail;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCpass() {
        return cpass;
    }

    public void setCpass(String cpass) {
        this.cpass = cpass;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    
    
    
    @Override
    public String toString() {
        return  role ;
    }

  
    
}
