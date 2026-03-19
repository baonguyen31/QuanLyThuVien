/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author PC
 */
public class QuyDinhPhatDTO {
    public String maQDP;
    public String quyDinh;
    public int soTienPhat;
    
    public QuyDinhPhatDTO(){}

    public QuyDinhPhatDTO(String maQDP, String quyDinh, int soTienPhat) {
        this.maQDP = maQDP;
        this.quyDinh = quyDinh;
        this.soTienPhat = soTienPhat;
    }

    public String getMaQDP() {
        return maQDP;
    }

    public void setMaQDP(String maQDP) {
        this.maQDP = maQDP;
    }

    public String getQuyDinh() {
        return quyDinh;
    }

    public void setQuyDinh(String quyDinh) {
        this.quyDinh = quyDinh;
    }

    public int getSoTienPhat() {
        return soTienPhat;
    }

    public void setSoTienPhat(int soTienPhat) {
        this.soTienPhat = soTienPhat;
    }
    
//    public int phatTien(){
//        switch(quyDinh){
//            case "Trả sách trễ hạn": return 20000; 
//            case "Làm hư/mất sách": return 100000;
//            case "Vi phạm nội quy thư viện": return 10000;
//            case "Vi phạm quy định sử dụng sách": return 50000;
//            default: return 0;
//        }
//    }
}
