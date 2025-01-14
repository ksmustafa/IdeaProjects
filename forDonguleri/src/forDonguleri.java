import java.util.Scanner;

public class forDonguleri {
    public static void main(String[] args) {
        /*int a;
        for (a=0;a<10;a++){
            System.out.println("a= " +a);
        }*/
        /*for (int a =10; a>=0; a--){
            System.out.println("a ="+a);
        }*/
        /*int a =0;
        for (;a<5;a++){
            System.out.println("merhaba");
        }*/
        /*int a=0;
        int b=10;
        for (;a<10 && b>0;a++,b--){
            System.out.println("a="+a);
            System.out.println("b="+b);
        }*/
         /*for (int i=1; i<100 ;i*=2){
            System.out.println("i= "+i);
        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("sayı girin:");
        int sayi = scanner.nextInt();
        int faktöriyel = 1;
        for (int i=1;i<=sayi;i++){
            faktöriyel *=i;
        }
        System.out.println(sayi+"!="+faktöriyel);

    }
}