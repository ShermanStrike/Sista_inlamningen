import javax.swing.*;

/**
 * Created by hawi15 on 2017-05-29.
 */
public class Ovning_4_3 {
    public static void main(String[] arg) {
        String grade = "";
        String s = JOptionPane.showInputDialog(null, "Insert points here");
        int points = Integer.parseInt(s);
        if (points < 25)
            grade = "F";
        else if (points < 30)
            grade = "E";
        else if (points < 35)
            grade = "D";
        else if (points < 40)
            grade = "C";
        else if (points < 45)
            grade = "B";
        else if (points <= 50)
            grade = "A";
        else if (points > 50)
            grade = "hax";
        JOptionPane.showMessageDialog(null, "Betyg: " + grade);
    }
}