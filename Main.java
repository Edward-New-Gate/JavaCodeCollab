import javax.swing.*;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int origin = Integer.parseInt(JOptionPane.showInputDialog("Enter the Origin point of "));
        int bound = Integer.parseInt(JOptionPane.showInputDialog("Enter the End point of ray "));
        float firstRandomNumber = Math.round(rand.nextFloat(origin,bound));

        JOptionPane.showMessageDialog(null, "So, Your Today number is : "+firstRandomNumber);

        if (firstRandomNumber <= 1000){
                JOptionPane.showMessageDialog(null,"Your luck is best today");
        }
        else if (firstRandomNumber <= 10000){
            JOptionPane.showMessageDialog(null, "Your luck is a bitter good today");
        }
        else {
            JOptionPane.showMessageDialog(null, "Go to hell");
        }

        scan.close();
    }
}