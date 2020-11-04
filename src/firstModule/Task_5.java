package firstModule;

import javax.swing.*;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        String T = JOptionPane.showInputDialog("Enter amount of seconds ");
        int amountSec = Integer.parseInt(T);
        int nHours = (amountSec%86400)/3600;
        int nMin = ((amountSec%86400)%3600) /60;
        int nSec =(((amountSec%86400)%3600)%60);
        JOptionPane.showMessageDialog(null,"That is "+nHours+"  hour(s), "+nMin+"  minute(s), and "+nSec+" second(s). ");
    }
}
