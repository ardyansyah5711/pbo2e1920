/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloGui;

/**
 *
 * @author Shirogami
 */
import javax.swing.*;
public class NewClass {
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame ("Ini percobaan HelloGui Frame");
                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frame.setSize(600, 300);
                            frame.setLocation(200, 200);
                          //frame.serLocationRelativeTo(null);
                            frame.setVisible(true);
    }
   
}
