/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author sang
 */
public class MsgBox {
    //hiển thị thông báo cho người dùng
    //parent là cửa sổ tb
    //mess là thông báo
    public static void alert(Component parent,String message){
        JOptionPane.showMessageDialog(parent, message,"Hệ thống quản lý đào tạo",JOptionPane.INFORMATION_MESSAGE);
    }
    //hiển thị thông báo và yêu cầu người dùng xác nhận 
    //parent là cửa sổ chứa thông báo 
    //mess là câu hỏi yes/no
    //return là kết quả nhận được true/false
    public static boolean confirm(Component parent,String message){
        int result = JOptionPane.showConfirmDialog(parent, message,
                "Hệ thống quản lý đào tạo",JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        return result==JOptionPane.YES_OPTION;
    }
    //hiển thị thông báo yêu cầu nhập dữ liệu
    //parent là cửa sổ chứa thông báo 
    //mess là thông báo nhắc nhở nhập
    //return là kết quả nhập được từ người sử dụng nhập vào 
    public static String prompt(Component parent,String message){
        return JOptionPane.showInputDialog(parent,message,
                "Hệ thống quản lý đào tạo",JOptionPane.INFORMATION_MESSAGE);
    }
}
