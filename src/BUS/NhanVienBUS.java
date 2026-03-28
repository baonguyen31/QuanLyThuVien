package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import java.util.ArrayList;

/**
 * @author PC
 */
public class NhanVienBUS {
    public static ArrayList<NhanVienDTO> dsnv;
    private NhanVienDAO dao = new NhanVienDAO();

    // Lấy toàn bộ danh sách từ Database
    public ArrayList<NhanVienDTO> getAll() {
        dsnv = dao.selectAll();
        if (dsnv == null) dsnv = new ArrayList<>();
        return dsnv;
    }

    // Thêm nhân viên
    public boolean insertNhanVien(NhanVienDTO nv) {
        boolean ok = dao.insertNhanVien(nv);
        if (ok) {
            if (dsnv != null) dsnv.add(nv); // Cập nhật danh sách tĩnh
        }
        return ok;
    }

    // Sửa nhân viên
    public boolean editNhanVien(NhanVienDTO nv) {
        boolean ok = dao.editNhanVien(nv);
        if (ok) {
            getAll(); // Load lại danh sách mới nhất sau khi sửa
        }
        return ok;
    }

    // Xóa nhân viên
    public boolean deleteNhanVien(String ma) {
        boolean ok = dao.deleteNhanVien(ma);
        if (ok) {
            getAll(); // Load lại danh sách sau khi xóa
        }
        return ok;
    }

    // Logic Đăng nhập
    public NhanVienDTO login(String maNV, String matKhau) {
        if (maNV.isEmpty() || matKhau.isEmpty()) {
            return null;
        }

        if (dsnv == null) getAll();

        for (NhanVienDTO nv : dsnv) {
            if (nv.getMaNV().equals(maNV) && nv.getMatKhau().equals(matKhau)) {
                return nv;
            }
        }
        return null;
    }
    public boolean checkChucVu(NhanVienDTO nv){
        if(nv.getChucVu().equalsIgnoreCase("Quản lý")){
            return true;
        }
        return false;
    }
    
    // Tìm kiếm nhân viên
    public ArrayList<NhanVienDTO> searchList(String keyWord) {
    ArrayList<NhanVienDTO> result = new ArrayList<>();
    if (dsnv == null) getAll();
    for (NhanVienDTO nv : dsnv) {
        if (nv.getMaNV().toLowerCase().contains(keyWord.toLowerCase())) {
            result.add(nv);
        }
    }
    return result;
}

    // Tự động tạo mã nhân viên mới (NV01, NV02...)
    public String generateMANV() {
        getAll();
        if (dsnv == null || dsnv.isEmpty()) {
            return "NV01";
        }
        // Lấy mã của nhân viên cuối cùng trong danh sách
        NhanVienDTO lastNV = dsnv.get(dsnv.size() - 1);
        try {
            // Cắt chuỗi "NV" và tăng số lên 1
            int nextNumber = Integer.parseInt(lastNV.getMaNV().substring(2)) + 1;
            return String.format("NV%02d", nextNumber);
        } catch (Exception e) {
            return "NV" + (dsnv.size() + 1);
        }
    }
}