import javax.swing.*;
import java.util.EmptyStackException;

/**
 * Created by Emil Käck on 2017-02-06.
 */
public class Uppgift1 {
    public static void main(String[]arg){

        String age;
        age = JOptionPane.showInputDialog("Age?");
        int age1 = Integer.parseInt(age);

    }
    public static double calculatePrice(int age1){
        if(age1<0){
            throw new EmptyStackException();
        } else if(age1<7){
            JOptionPane.showMessageDialog(null, "Det är gratis");
        } else if(age1<20) {
            JOptionPane.showMessageDialog(null, "Det kostar 14kr");
        } else if(age1<26){
            JOptionPane.showMessageDialog(null, "Det kostar 28kr");
        } else if(age1<65){
            JOptionPane.showMessageDialog(null, "Det kostar 34kr");
        } else
            JOptionPane.showMessageDialog(null, "Det kostar 28kr");

    }
}
