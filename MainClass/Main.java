/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass;
import javax.swing.SwingUtilities;
import view.BeachUi;
/**
 *
 * @author USER
 */
public class Main {
    
      public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BeachUi frame = new BeachUi();
            frame.setVisible(true);
        });
    }
    
}
