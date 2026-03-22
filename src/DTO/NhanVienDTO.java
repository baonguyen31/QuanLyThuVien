package DTO;

import java.util.Date;

public class NhanVienDTO {
    private String MaNV;
    private String Ho;
    private String Ten;
    private String SDT;
    private Date NgaySinh;
    private String ChucVu;
    private String MatKhau;

    public NhanVienDTO() {}

    public NhanVienDTO(String MaNV, String Ho, String Ten, String SDT, Date NgaySinh, String ChucVu, String MatKhau) {
        this.MaNV = MaNV;
        this.Ho = Ho;
        this.Ten = Ten;
        this.SDT = SDT;
        this.NgaySinh = NgaySinh;
        this.ChucVu = ChucVu;
        this.MatKhau = MatKhau;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
}