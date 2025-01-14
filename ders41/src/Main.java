import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("vize 1: ");
        int vize1 = scanner.nextInt();
        System.out.print("vize 2: ");
        int vize2 = scanner.nextInt();
        System.out.print("final: ");
        int finalNot = scanner.nextInt();
        System.out.println("GNO yazınız:");
        double ortalama = scanner.nextDouble();

        double toplamNot = (vize1 *3/10.0) + (vize2*3/10.0)+(finalNot*4/10.0);

        if (toplamNot>= 90){
            System.out.println("AA");
        } else if (toplamNot>=85) {
            System.out.println("BA");
        } else if (toplamNot>=80) {
            System.out.println("BB");
        } else if (toplamNot>=70) {
            System.out.println("CC");
        }else if (toplamNot>=65) {
            System.out.println("DC");
        }else if (toplamNot>=60) {
            System.out.println("DD");
            if (ortalama<2.50){
                System.out.println("DD aldınız, dersi tekrar alman gerek");
            }
        }else if (toplamNot>=55) {
            System.out.println("FD");
        }else{
            System.out.println("FF");
        }

    }
}