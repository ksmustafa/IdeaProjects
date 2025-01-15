import java.util.Scanner;

public class doWhileDongu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam=0;

        do {
            toplam += sayi % 10;
            sayi /= 10;
            System.out.println("sayi: "+sayi);
        }
        while (sayi>0);
            System.out.println( "rakamları toplamı: "+toplam);


    }
}
