import java.util.Scanner;

public class maksimumBulma {
    public static void main(String[] args) {
        // Alınan 3 sayıdan en büyük olanı bulma
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Birinci Sayı : ");
        int a = scanner.nextInt();
        System.out.print("İkinci Sayı : ");
        int b  = scanner.nextInt();
        System.out.print("Üçüncü Sayı : ");
        int c  = scanner.nextInt();

        int maks = -1;

        if ( a >= b && a >= c) {
            maks = a;
        }
        else if (b >= a && b >= c) {
            maks = b;
        }
        else {
            maks = c;
        }
        System.out.println("en büyük olan sayı : " + maks);
    }
}
