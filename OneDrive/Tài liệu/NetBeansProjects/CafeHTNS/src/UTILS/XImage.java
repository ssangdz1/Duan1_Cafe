/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTILS;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author sang
 */
public class XImage {
    public static Image getAppIcon(){
        URL url = XImage.class.getResource("../icon/fpt.png");
        return new ImageIcon(url).getImage();
    }
    public static boolean save(File src){
        File dst = new File("src\\resources\\logos",src.getName());
        if (!dst.getParentFile().exists()) {//neeus file tren khong ton tai
            dst.getParentFile().mkdirs();//tao thu muc moi
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());//toi duong dan
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to,StandardCopyOption.REPLACE_EXISTING);//neu file ton tai thi se exit
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static ImageIcon read(String fileName){
        File path = new File("src\\images",fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}
