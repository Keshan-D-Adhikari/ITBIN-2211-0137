/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.util;

import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author keshan
 */
public class CommonUtils {

    static final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

    public static String getStringDate(Date date) {
        return dateFormatter.format(date);
    }

    public void resetComponents(JComponent[] jComponents) {
        for (JComponent component : jComponents) {

            if (component instanceof JTextField) {
                ((JTextField) component).setText("");
            } else if (component instanceof JComboBox) {
                ((JComboBox) component).setSelectedIndex(0);
            }
        }
    }

    public void DatabaseFunctionalityMessages(Component parentComponent, int isSaved) {
        if (isSaved == 1) {
            JOptionPane.showMessageDialog(parentComponent, "Data saved succesfuly!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(parentComponent, "Data saved failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void validationErrorMessage(Component parentComponent, String message) {
        JOptionPane.showMessageDialog(parentComponent, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

}
