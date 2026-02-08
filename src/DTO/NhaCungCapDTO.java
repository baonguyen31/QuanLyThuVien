/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author PC
 */
public class NhaCungCapDTO {
    public String maNCC;
    public String tenNCC;
    public String maSach;
    
    public NhaCungCapDTO(){}

    public NhaCungCapDTO(String maNCC, String tenNCC, String maSach) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.maSach = maSach;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    
}
