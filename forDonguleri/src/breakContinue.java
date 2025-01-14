import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class breakContinue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("görsel dosyası için 1 e basın :");
        int dosya = scanner.nextInt();

        System.out.print("kişi listesi için 2 ye basın:");
        int kisi = scanner.nextInt();

        System.out.print("görsel aratmak için görsel yazın: ");
        String secenek = scanner.nextLine();


        if (dosya == 1){
            System.out.print("kişi sayısını girin:");
            int sayi = scanner.nextInt();

            if (sayi>2){
                for (int i=0;i<sayi;i++){

                    System.out.print("ad ve soyad: ");
                    String isim = scanner.nextLine();

                    String meslek = scanner.nextLine();
                    System.out.print("meslek: ");

                    String mezun = scanner.nextLine();
                    System.out.print("mezun durumu: ");
                    scanner.nextLine();

                    System.out.print("yaşı:");
                    int yas = scanner.nextInt();
                }
            } else {
                System.out.print("ad ve soyad: ");
                String isim1 = scanner.nextLine();
                scanner.nextLine();

                System.out.print("yaşı:");
                int yas1 = scanner.nextInt();

                System.out.print("ad ve soyad: ");
                String isim2 = scanner.nextLine();
                scanner.nextLine();
                System.out.print("yaşı:");
                int yas2 = scanner.nextInt();

                int toplamYas = yas1+yas2;
                System.out.println("klavyeden girilen iki kişinin yaşları toplamı: "+toplamYas);

            }
        }
        if (kisi ==2 ){}





    }

}