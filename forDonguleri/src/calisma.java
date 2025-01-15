import java.util.Scanner;

public class calisma {

    public static void main(String[] args){


      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı girin ");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;
        for (int i=1 ; i<=sayi;i++){
            faktoriyel *=i;
        }
        System.out.println("faktoriyel: " +faktoriyel);
*/
       /* int i= 10;
        while (i<100){
            System.out.println("i : " +i);
            i += 3;
        }*/

        Scanner scanner =new Scanner(System.in);
        System.out.println("sayı girin: ");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;
        while (sayi > 0){
            faktoriyel *= sayi;
            sayi--;
        }

        System.out.print("faktoriyel: " + faktoriyel);

    }
}
