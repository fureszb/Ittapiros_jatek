
package ittapiros_jatek;
import java.util.Random;
import java.util.Scanner;

public class Ittapiros_jatek {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in,"ISO-8859-2");
         Random rnd = new Random();
      int golyoh= rnd.nextInt(1,3);
        System.out.println("_ _ _");
        System.out.println("");
        System.out.print("Vajon hol a golyó?: ");
         int tipp = sc.nextInt();
       while ((tipp<1)||(tipp>3))
       {
           System.out.println("Csak [1-3] intervallumba tippelhetsz!");
           System.out.print("Vajon hol a golyó?: ");
            tipp = sc.nextInt();
       }
        System.out.println("");
        String mezo1 = tipp == 1 ? "X" : "_";
        String mezo2 = tipp == 2 ? "X" : "_";
        String mezo3 = tipp == 3 ? "X" : "_";
        
        mezo1 = golyoh == 1 ? "O": mezo1;
        mezo2 = golyoh == 2 ? "O": mezo2;
        mezo3 = golyoh == 3 ? "O": mezo3;
       
        System.out.println(mezo1 +" "+ mezo2 +" "+ mezo3);
        
        if (golyoh == tipp) {
            System.out.println("Gratulálok jól tippetél!");
        }
        else
        {
            System.out.println("Sajnos nem nyert a tipp! \nPróbáld újra!");
        }
    }
    
}
