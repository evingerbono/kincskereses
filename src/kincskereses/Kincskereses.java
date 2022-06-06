
package kincskereses;

import java.util.Scanner;


public class Kincskereses {
//Az én programo szerint a 2. vagyi az Ezüst ládában van a kincs.
    
    public static void main(String[] args) {
        
        lada();
    }
    

    private static void lada() {
        String [] ladak= new String [3];
        ladak[0]="Arany";
        ladak[1]="Ezüst";
        ladak[2]="Bronz";
        System.out.println("Van három ládám, az egzik egy hatalmas kincset rejt. Ezeket a feliratokat tartalmazzák a ládák:");
        System.out.println("1.Arany láda: Én relytem a kincset.");
        System.out.println("2.Ezüst láda: Nem én relytem a kincset.");
        System.out.println("3.Bronz láda: Az arany láda hazudik.");
        System.out.println("A három ládábol 2-hazudik és csak 1-mond igazat. Melyik ládámba van a kincs? ");
        
        tipp();
    }

    private static void tipp() {
        Scanner sc = new Scanner(System.in);
        int tippek = sc.nextInt();
        
        if (tippek==1) {
            System.out.println("Rosszul gondolkoztál nem az arany ládaába vana kincs.");
        }else if(tippek==2){
            System.out.println("Gratulálok megtalálltad a kincset.");
        }else if(tippek==3){
            System.out.println("Rosszul gondolkoztál nem a bronz ládába van a kincs.");
        }
  
   
    
    }
}
