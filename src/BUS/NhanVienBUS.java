/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;

/**
 *
 * @author noname
 */
public class NhanVienBUS {
    private NhanVienDAO dao = new NhanVienDAO();

    public NhanVienDTO login(String maNV, String matKhau) {
        if (maNV.isEmpty() || matKhau.isEmpty())
            throw new RuntimeException("Không được để trống dữ liệu");
        
        NhanVienDTO nv = dao.login(maNV, matKhau);

        if (maNV.isEmpty() || matKhau.isEmpty())
            throw new RuntimeException("Không được để trống dữ liệu");

        if (nv == null)
            return null;
        System.out.print(nv);
        return nv;
       
}
}
