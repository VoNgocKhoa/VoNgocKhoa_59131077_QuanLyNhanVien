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
    
     
    public nhanvien(String ho, String ten) {
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
    
    public double getThuong(double tongsogiolam) {
        if (tongsogiolam >= 200) {
            thuong = tongsogiolam * 20/100 ;
        } else if (tongsogiolam < 200 && tongsogiolam <=100)  {
            thuong = this.tongsogiolam * 10/100;
        } else if (tongsogiolam < 100) {
            thuong = 0;
        }    
public static void main(String[] args) {
        nhanvien nhanVien1 = new nhanvien("Nguyen", "Thi",);
        NhanVien nhanVien2 = new NhanVien("Lê", "Vy", 199);
        System.out.println("Tiền lương của nhân viên 1 = " + nhanVien1.getLuong(nhanVien1.getSoSP()));
        System.out.println("Tiền lương của nhân viên 2 = " + nhanVien2.getLuong(nhanVien2.getSoSP()));
     


    
 

    
      
   
