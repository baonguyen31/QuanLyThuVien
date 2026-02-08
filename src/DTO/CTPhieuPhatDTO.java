/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author PC
 */
public class CTPhieuPhatDTO {
    public String maPP;
    public String maSach;
    public QuyDinhPhatDTO qdPhat;
    public int giaTien;
    
    public CTPhieuPhatDTO(){}

    public CTPhieuPhatDTO(String maPP, String maSach, QuyDinhPhatDTO qdPhat, int giaTien) {
        this.maPP = maPP;
        this.maSach = maSach;
        this.qdPhat = qdPhat;
        this.giaTien = giaTien;
    }

    public String getMaPP() {
        return maPP;
    }

    public void setMaPP(String maPP) {
        this.maPP = maPP;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public QuyDinhPhatDTO getQdPhat() {
        return qdPhat;
    }

    public void setQdPhat(QuyDinhPhatDTO qdPhat) {
        this.qdPhat = qdPhat;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }
    
    
}
