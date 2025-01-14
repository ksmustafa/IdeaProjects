import java.awt.*;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Scanner;

public class link {

    public class GoogleLinkEkleme {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Arama yapmak istediğiniz anahtar kelimeyi girin: ");
            String anahtarKelime = scanner.nextLine();

            try {
                // Anahtar kelimeyi URL formatına dönüştürme
                String encodedAnahtarKelime = URLEncoder.encode(anahtarKelime, "UTF-8");

                // Google arama URL'sini oluşturma
                String googleURL = "https://www.google.com/search?q=" + encodedAnahtarKelime;

                // Google arama sayfasını açma
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(java.net.URI.create(googleURL));
            } catch (UnsupportedEncodingException e) {
                System.out.println("URL formatına dönüştürme hatası: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Google arama sayfasını açarken bir hata oluştu: " + e.getMessage());
            }
        }
    }
}
