/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author noname
 */
public class ReColorIcon {
    public static ImageIcon recolorIcon(ImageIcon icon, Color color) {
    Image img = icon.getImage();
    BufferedImage buff = new BufferedImage(
        img.getWidth(null),
        img.getHeight(null),
        BufferedImage.TYPE_INT_ARGB
    );

    Graphics2D g = buff.createGraphics();
    g.drawImage(img, 0, 0, null);

    g.setComposite(AlphaComposite.SrcAtop);
    g.setColor(color);
    g.fillRect(0, 0, buff.getWidth(), buff.getHeight());
    g.dispose();

    return new ImageIcon(buff);
}
    
}
