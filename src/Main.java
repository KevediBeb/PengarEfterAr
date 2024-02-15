import javax.swing.JOptionPane;
import java.text.Format;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        double b = Double.parseDouble(JOptionPane.showInputDialog("belopp?"));
        double r = Double.parseDouble(JOptionPane.showInputDialog("ränta?"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("år?"));
        double ut = Double.parseDouble(JOptionPane.showInputDialog("uttag?"));

        double result = beloppVidUttag(b, r, n, ut);

        JOptionPane.showMessageDialog(null, Double.toString(result));
    }
    public static double beloppVidUttag(double b, double r, int n, double ut){
        if(ut > b*0.01*r){
            JOptionPane.showMessageDialog(null, "för stort uttag");
            return 0;
        }
        else{
            for(int i = 1; i <= n; i++){
                b = b + b*0.01*r - ut;

                System.out.println(String.format("efter år %1o har du %.6f pengar", i, b));
            }
            return b;
        }

    }
}