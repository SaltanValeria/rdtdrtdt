/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mas;

/**
 *
 * @author 1530221
 */
public class JavaApplication10 {
    private static int masiv;

    /**
     * @param args the command line arguments
     */
           public static void main(String args[]) {
               Rabotnic[] firma={new Rabotnic(1, 3, "Ivanov"),new Rabotnic(2,4.5,"Petrov"),new Rabotnic(3, 10, "Bilanenko")};
//               double a=firma[0].num*16*firma[0].stag;
//               double b=firma[1].num*16*firma[1].stag;
//               double c=firma[2].num*16*firma[2].stag;
               double chemodan=0;
              int i=0;
               while(i<3){
                chemodan=chemodan+firma[i].num*16*firma[i].stag;
                 
                  i++; 
                   
//                   System.out.println("1"+a);
//                   System.out.println("2"+b);
//                   System.out.println("3"+c);
//                   System.out.println("Zarplata"+d);
               }
               System.out.println("chemodan  " + chemodan);
//            int stavkaoh=340;
//            int stavkabyg=340;
//            int stavkadir=720;
//            int stag2=120;
//            int stag5=240;
//            int stag10=1000; 
//            int OHRANA=stavkaoh*stag2/5;
//            int bygalter=stavkabyg*stag5/5;
//            int director=stavkadir*stag10/5;
//            int zarotdel=OHRANA+bygalter+director;
//               System.out.println("\nЗарплата отдела");
//            System.out.print("\nОхрана=" +OHRANA +"грн." );
//            
//            System.out.print("\nБухгалтер=" + bygalter+"грн.");
//            
//            System.out.print("\nДиректор=" + director+"грн.");
//               System.out.println("\nСуммарная зарплата отдела="+zarotdel+"грн.");
      
}
}

class Rabotnic {
int num;
double stag;
String  name;

    public Rabotnic(int num, double stag,String name) {
        this.num = num;
        this.stag = stag;
        this.name = name;

    }

}