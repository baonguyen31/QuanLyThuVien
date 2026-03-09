/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.PhieuPhatDAO;


/**
 *
 * @author noname
 */
public class PhieuPhatBUS {
    
    public String generateMaPM() {
    PhieuPhatDAO dao = new PhieuPhatDAO();
    String lastMaPM = dao.getLastMaPM();

    if (lastMaPM == null) {
        return "PP001";
    }

    int number = Integer.parseInt(lastMaPM.substring(2));
    number++;

    if (number < 10) {
        return "PP00" + number;
    }else if (number < 100){
         return "PP0" + number;
    }else{
      return "PP" + number;
            }
    
}
}
