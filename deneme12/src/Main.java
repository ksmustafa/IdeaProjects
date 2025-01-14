import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String islemler = "1 toplama \n" +"2 çıkarma \n" +"3 çarpma \n" +"4 bölme \n";
        System.out.println(islemler);
        System.out.println("işlemi seçiniz");
        String islem = scanner.nextLine();
        double a;
        double b;
        double sonuc;

        switch (islem){
            case "1":
                System.out.println("sayınızı girin: ");
                 a = scanner.nextDouble();
                System.out.println("ikinci sayınızı girin:");
                 b = scanner.nextDouble();
                 sonuc = (a + b);
                System.out.println("sonuç = " +sonuc);
                break;
            case "2":
                System.out.println("sayınızı girin: ");
                 a = scanner.nextDouble();
                System.out.println("ikinci sayınızı girin:");
                 b = scanner.nextDouble();
                sonuc = (a - b);
                System.out.println("sonuç = " +sonuc);
                break;
            case "3":
                System.out.println("sayınızı girin: ");
                 a = scanner.nextDouble();
                System.out.println("ikinci sayınızı girin:");
                 b = scanner.nextDouble();
                 sonuc = (a * b);
                System.out.println("sonuç = " +sonuc);
                break;
            case "4":
                System.out.println("sayınızı girin: ");
                  a = scanner.nextDouble();
                System.out.println("ikinci sayınızı girin:");
                  b = scanner.nextDouble();
                sonuc = (a / b);
                System.out.println("sonuç = " +sonuc);
                break;
            default:
                System.out.println("geçersiz işlem");
        }
    }
}