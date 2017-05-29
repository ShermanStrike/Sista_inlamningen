import javax.swing.*;

/**
 * Created by hawi15 on 2017-05-29.
 */
public class Ovning_4_4 {
    public static void main(String[] arg) {
        String length = JOptionPane.showInputDialog("Paketets längd?");
        int langd = Integer.parseInt(length);
        String thick = JOptionPane.showInputDialog("Paketers tjocklek?");
        int tjock = Integer.parseInt(thick);
        String width = JOptionPane.showInputDialog("Paketets bredd?");
        int bredd = Integer.parseInt(width);
        if ((langd >= 140 && langd <= 600) && bredd >= 90 && tjock <= 100 && (langd + bredd + tjock )<= 900)
            JOptionPane.showMessageDialog(null, "Måtten: ok");
        else
            JOptionPane.showMessageDialog(null, "Felaktiga mått");
    }
}
