import javax.swing.*;
import java.util.EmptyStackException;

/**
 * Created by Emil Käck on 2017-02-06.
 */
public class Uppgift1 {
    public static void main(String[]arg) {
        // Här hämtar man bara metoderna och skriver ut kostnaden. 
        String age="hej";
        String age1 = Age(age);
        double trueage = tryAge(age1);
        JOptionPane.showMessageDialog(null,"Det kostar " + trueage + "kr");

    }

    public static double calculatePrice(double price){
        //metod för att ta reda på hur mycket det kostar beroende på åldern.
        if(price<0){
            JOptionPane.showMessageDialog(null, "Det var ett ngativt tal skrive ett posetivt tal");
            throw new EmptyStackException();
        } else if(price<7){
            price = 0;
        } else if(price<20) {
            price = 14;
        } else if(price<26){
            price = 28;
        } else if(price<65){
            price = 34;
        } else
            price = 28;
        return (price);
    }

    public static double tryAge(String age){
        //metod som testar om kåden är siffror och inte bokstäver och om et är bokstäver kan man skriva om till det blir siffror.
        int age1;
        double price1=0;

        try {
            age1 = Integer.parseInt(age);
            price1 = calculatePrice(age1);

        }
        catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Det där var inte en ålder, var vänlig och försök igen");
                String age2 = Age(age);
                double truage = tryAge(age2);
                price1 = calculatePrice(truage);
        }
        return (price1);
     }
     public static String Age(String age){
        // metod för input där man skriver ådern.
        age = JOptionPane.showInputDialog("Ålder?");
         return age;
     }

}

