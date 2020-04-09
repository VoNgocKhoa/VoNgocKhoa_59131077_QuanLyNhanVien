/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VoNgocKhoa_59131077_BaiTap1;
import java.util.Scanner;

/**
 *
 * @author long
 */
public class nhanvien {
    private String ho, ten , diachi;
    private double tienluong;
    private int tongsogiolam;
    private double thuong;
    nhanvien(){
        ho="Vo Ngoc ";
        ten="Khoa";
        diachi="to 14 ngoc thao ngoc hiep nha trang khanh hoa";
        tienluong=1000000;
        tongsogiolam=200;
        
    }
    
     
    public nhanvien(String ho, String ten, String diachi, double tienluong, int tongsogiolam ) {
        this.ho = ho;
        this.ten = ten;
        this.diachi = diachi;
         
     }


    
 
    public String getho() {
        return ho;
    }
    public void setho(String ho) {
        this.ho = ho;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getDiachi() {
        return diachi;
    }    
    public void setDiachi(String diachi) {
        this.diachi = diachi;  
    }    
    
    double gettienluong(){
        return tienluong;
    }
    void settienluong (double tienluong){
        this.tienluong = tienluong;
    }
    double gettongsogiolam(){
        return tongsogiolam;
    }
    void settongsogiolam (int tongsogiolam){
        this.tongsogiolam = tongsogiolam;
    }
           
    public double getThuong(double tongsogiolam){
        if (tongsogiolam >= 200) 
            thuong = tongsogiolam * 20/100 ;
        else if (tongsogiolam < 200 && tongsogiolam <=100)  
            thuong = this.tongsogiolam * 10/100;
        else 
            thuong = 0;
            return thuong;
        }   

    void inputInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void printInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

} 





    
 

    
      
   
