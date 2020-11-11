package basics.linear;

import javax.swing.*;

public class Task_5 {
    public static void main(String[] args) {

        String T = JOptionPane.showInputDialog("Enter amount of seconds ");
        int amountSec = Integer.parseInt(T);
        int hours = amountSec/3600;
        int minutes = (amountSec%3600) /60;
        int secs =((amountSec%3600)%60);
        JOptionPane.showMessageDialog(null, String.format( "%02dч:%02dмин:%02dс", hours, minutes, secs));
    }
}
