/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;
import java.util.Date;
/**
 *
 * @author noname
 */
public class SachDTO {
    private String MaSach;
    private String TenSach;
    private String MaTL;
    private String MaTG;
    private String MaNXB;
    private Date NgayXB;
    private int SoLuong;
    private double DonGia;

    public SachDTO() {
    }

    public SachDTO(String MaSach, String TenSach, String MaTL, String MaTG, String MaNXB, Date NgayXB, int SoLuong, double DonGia) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.MaTL = MaTL;
        this.MaTG = MaTG;
        this.MaNXB = MaNXB;
        this.NgayXB = NgayXB;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getMaTL() {
        return MaTL;
    }

    public void setMaTL(String MaTL) {
        this.MaTL = MaTL;
    }
    
    public String getMaTG(){
        return MaTG;
    }
    
    public void setMaTG(String MaTG){
        this.MaTG = MaTG;
    }
    
    public String getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(String MaNXB) {
        this.MaNXB = MaNXB;
    }

    public Date getNgayXB() {
        return NgayXB;
    }

    public void setNgayXB(Date NgayXB) {
        this.NgayXB = NgayXB;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

   
    
}