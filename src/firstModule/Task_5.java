package firstModule;

import javax.swing.*;
import java.util.Locale;

public class Task_5 {
    public static void main(String[] args) {

        String T = JOptionPane.showInputDialog("Enter amount of seconds ");
        int amountSec = Integer.parseInt(T);
        int hours = (amountSec%86400)/3600;
        int minutes = ((amountSec%86400)%3600) /60;
        int secs =(((amountSec%86400)%3600)%60);
        JOptionPane.showMessageDialog(null, String.format(Locale.getDefault(), "%02dч:%02dмин:%02dс", hours, minutes, secs));
    }
}
