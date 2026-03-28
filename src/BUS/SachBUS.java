/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.SachDAO;
import DTO.NhaXuatBanDTO;
import DTO.PhieuMuonDTO;
import DTO.SachDTO;
import DTO.TacGiaDTO;
import DTO.TheLoaiDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author noname
 */
public class SachBUS {
    public static ArrayList<SachDTO> dsSach;
    public SachBUS(){}
    private SachDAO sachDao = new SachDAO();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    // Đọc dsSach
    public ArrayList<SachDTO> getALL(){
        if(dsSach == null ) dsSach = new ArrayList<SachDTO>();
        dsSach = sachDao.selectAll();
        return dsSach;
    }
    
    public SachDTO getSachByMa(String maSach){
        return sachDao.getSachByMa(maSach);
    }
    //Thêm
    public boolean insertSach(SachDTO sach){
        
        if(sach.getTenSach() == null){
            JOptionPane.showMessageDialog(null, "Không được để trống Tên sách");
            return false;
        }
        if(sach.getDonGia() < 0){
            JOptionPane.showMessageDialog(null, "Đơn giá không hợp lệ");
            return false;
        }
        for(SachDTO s : dsSach){
            if(s.getTenSach().trim().equalsIgnoreCase(sach.getTenSach().trim())){
                JOptionPane.showMessageDialog(null, "Tên sách đã tồn tại");
                return false;
            }
        }
        dsSach.add(sach);
        return sachDao.insertSach(sach);
    }
    
    //Sửa
    public boolean editSach(SachDTO sach){
        if(sach.getTenSach() == null  || sach.getTenSach().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Không được để trống tên sách");
            return false;
        }
        if(sach.getDonGia() < 0){
            JOptionPane.showMessageDialog(null, "Đơn giá không hợp lệ");
            return false;
        }
        
        boolean found = false;
        for(int i = 0; i < dsSach.size(); i++){
            if(dsSach.get(i).getMaSach().equalsIgnoreCase(sach.getMaSach())){
                dsSach.set(i, sach);
                found = true;
                break;
            }
        }
        if(!found) return false;
        return sachDao.editSach(sach);
    }
    //Xóa
    public boolean deleteSach(String ma){
        if(ma == null) return false;
        
        boolean found = false;
        for(int i = 0; i < dsSach.size(); i++){
            if(dsSach.get(i).getMaSach().equalsIgnoreCase(ma)){
                dsSach.remove(i);
                found = true;
                break;
            }
        }
        if(!found) return false;
        return sachDao.deleteSach(ma);
    }
    //Đổ data vào combobox
    public ArrayList<NhaXuatBanDTO> getTenNXBByMaNXB(){
        return sachDao.getTenNXBByMaNXB();
    }
    public ArrayList<TheLoaiDTO> getTenTLByMaTL(){
        return sachDao.getTenTLByMaTL();
    }
    public ArrayList<TacGiaDTO> getTenTGByMaTG(){
        return sachDao.getTenTGByMaTG();
    }
    
    public String timTenSachTheoMa(String id){
        //Kiểm tra data hợp lệ
        boolean found = false;
        for(int i = 0; i < dsSach.size(); i++){
            if(dsSach.get(i).getMaSach().equalsIgnoreCase(id)){
                found = true;
            }
        }
        return sachDao.getTenSachByMa(id);
    }
    //lấy tên sách cho thống kê
    public String getTenByMaSach(String MaSach){
        return sachDao.getTenSachByMa(MaSach);
    } 
    public String getTenByMaTL(String ma){
        return sachDao.getTenTLByMa(ma);
    } 
    public String getTenByMaTG(String ma){
        return sachDao.getTenTGByMa(ma);
    } 
    public String getTenNXBByMaNXB(String ma){
        return sachDao.getTenNXBByMa(ma);
    } 
    //tìm kiếm sách
    public ArrayList<SachDTO> searchSach(String keyword){
        return sachDao.searchSach(keyword);
    }
    
    public ArrayList<SachDTO> searchByTenSach(String keyWord){
        ArrayList<SachDTO> result = new ArrayList<>();
        for(SachDTO s: dsSach){
            if(s.getTenSach().toLowerCase().contains(keyWord.toLowerCase())){
                result.add(s);
            }
//            System.out.println("Keyword: " + keyWord);
//            System.out.println("Ten sach: " + s.getTenSach());
        }
        return result;
    }
    //Lọc và thống kê
    public ArrayList<String> thongKeTheoTheLoai() {
        return sachDao.thongKeTheoTheLoai();
    }

    public int countSach(){
         int tong = 0;
         dsSach = new ArrayList<SachDTO>();
         dsSach = sachDao.selectAll();
             for(SachDTO dto : dsSach){
                tong += dto.getSoLuong();
                System.out.println("số lượng là: "+  dto.getSoLuong());
    
         }
         
          System.out.println("số lượng sách là: "+dsSach.size());
         System.out.println("số lượng sách là: "+tong);
         return tong;
    }
    
    public String taoMaSach(){
        dsSach = sachDao.selectAll();
        //nếu ds rỗng
        if(dsSach.isEmpty()){
            return "S001";
        }
        String lastMa = dsSach.get(dsSach.size() - 1).getMaSach();
        int num = Integer.parseInt(lastMa.substring(1)); //cắt số cuối ra
        num++;
        return String.format("S%03d", num);
    }
    
    public double getDonGia(String maSach){
        dsSach = sachDao.selectAll();
        for(SachDTO dto : dsSach){
        if(dto.getMaSach().equals(maSach)){
            return dto.getDonGia();
            }
        }
        return 0;
    }
    
    public void exportSachToExcel(ArrayList<SachDTO> list, String filePath){
        try {
            Workbook wb = new XSSFWorkbook();
            Sheet sheet = wb.createSheet("Sach");

            // header
            Row header = sheet.createRow(0);
            header.createCell(1).setCellValue("MaSach");
            header.createCell(2).setCellValue("TenSach");
            header.createCell(3).setCellValue("TheLoai");
            header.createCell(4).setCellValue("NhaXuatBan");
            header.createCell(5).setCellValue("NgayXuatBan");
            header.createCell(6).setCellValue("SoLuong");
            header.createCell(7).setCellValue("DonGia");

            int rowNum = 1;

            for(SachDTO sach : list){
                Row row = sheet.createRow(rowNum++);

                row.createCell(1).setCellValue(sach.getMaSach());
                row.createCell(2).setCellValue(sach.getTenSach());
                row.createCell(3).setCellValue(sach.getMaTL());
                row.createCell(4).setCellValue(sach.getMaNXB());
                row.createCell(5).setCellValue(sach.getNgayXB().toString());
                row.createCell(6).setCellValue(sach.getSoLuong());
                row.createCell(7).setCellValue(sach.getDonGia());
            }

            // auto size
            for(int i = 0; i < 8; i++){
                sheet.autoSizeColumn(i);
            }

            FileOutputStream fos = new FileOutputStream(filePath);
            wb.write(fos);
            wb.close();

            JOptionPane.showMessageDialog(null, "Export thành công!");

        } catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Export thất bại!");
        }
    }
    public void importSachFromExcel(File file){
        SachBUS bus =new SachBUS();
    try {
        FileInputStream fis = new FileInputStream(file);
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheetAt(0);

        SachDAO dao = new SachDAO();

        for(int i = 1; i <= sheet.getLastRowNum(); i++){
            Row row = sheet.getRow(i);

            String maSach = row.getCell(1).getStringCellValue();
            String tenSach = row.getCell(2).getStringCellValue();
            String theLoai = row.getCell(3).getStringCellValue();
            String nxb = row.getCell(4).getStringCellValue();
            Date ngayXB = row.getCell(5).getDateCellValue();
            int soLuong = (int) row.getCell(6).getNumericCellValue();
            double donGia = row.getCell(7).getNumericCellValue();

            SachDTO sach = new SachDTO();
            sach.setMaSach(maSach);
            sach.setTenSach(tenSach);
            sach.setMaTL(theLoai);
            sach.setMaNXB(nxb);
            sach.setNgayXB(ngayXB);
            sach.setSoLuong(soLuong);
            sach.setDonGia(donGia);

            if(dao.isExisted(maSach)){
                dao.editSach(sach);
            }else {
            dao.insertSach(sach);
            }// hoặc update nếu trùng
        }

        wb.close();
        JOptionPane.showMessageDialog(null, "Import thành công!");

    } catch(Exception e){
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Import thất bại!");
    }
}
}
