/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author PC
 */
public class TacGiaDTO {
    public String maTG;
    public String tenTG;
    public String quocTich;
    public String tacPham;
    
    public TacGiaDTO(){}
    
    public TacGiaDTO(String maTG, String tenTG, String quocTich, String tacPham) {
        this.maTG = maTG;
        this.tenTG = tenTG;
        this.quocTich = quocTich;
        this.tacPham = tacPham;
    }
    
    public void setMaTG(String maTG){
        this.maTG = maTG;
    }
    public String getMaTG(){
        return maTG;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getTacPham() {
        return tacPham;
    }

    public void setTacPham(String tacPham) {
        this.tacPham = tacPham;
    }
    
}
