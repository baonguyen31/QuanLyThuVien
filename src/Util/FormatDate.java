/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author noname
 */
public class FormatDate {
    private Date formatDate(JDateChooser date){
        java.util.Date utilDate = date.getDate();
        return new Date(utilDate.getTime());
    }
}
