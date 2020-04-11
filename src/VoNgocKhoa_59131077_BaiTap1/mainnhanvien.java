/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VoNgocKhoa_59131077_BaiTap1;

/**
 *
 * @author long
 */
public class mainnhanvien {
     public static void main(String[] args) {
        // Tạo nhân viên 1
        nhanvien nv1 = new nhanvien();
        nv1.setTen("Võ Ngọc Khoa");
        nv1.settuoi(20);
        nv1.setDiachi("Tô 14 Nha Trang Khánh Hòa");
        nv1.settienluong(25000000);
        nv1.settongsogiolam(150);
        
        // Tạo nhân viên 2
        nhanvien nv2 = new nhanvien();
        nv2.setTen("Nguyen Van B");
        nv2.settuoi(21);
        nv2.setDiachi("Nha Trang - Khanh Hoa");
        nv2.settienluong(20000000);
        nv2.settongsogiolam(200);

        // in thong tin nhan vien
        System.out.println(nv1.getThongTin());
        System.out.println(nv2.getThongTin());
  } 
    
}
