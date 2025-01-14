import model.enumeratation.CharSet;

import java.util.Scanner;

import static model.enumeratation.CharSet.getValue;

public class supruz {

    public static void main(final String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("supruz icin bir tusa basin :");
        String tus = scanner.next();


        if (tus != null) {
            for (int i = 0; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                String charObject = getValue(i);
                System.out.println(charObject);
            }
        }
    }
}