/*
 * Ad Soyad: Elif su KANSU
 * Ogrenci No: 250541004
 * Tarih: 28.10.2025
 * Aciklama: Gorev 2 - Geometrik Hesaplama
 * 
 * Bu program kullanicidan yarıçap bilgisini alır ve
 * dairenin alanını,çevresini,çapının;kürenin yüzey alanını ve hacminin çıktısını verir.
 */
import java.util.Scanner;
    public class GeometrikHesaplayici {
        public static void main(String[] args) {
            final double PI = 3.14159;
            Scanner input = new Scanner(System.in);

            System.out.print("=== GEOMETRİK HESAPLAYICI ===\n");
            System.out.print("Dairenin yarıçapını girin (cm): ");
            double r = input.nextDouble();

            double daireAlani = PI * r * r;
            double daireCevresi = 2 * PI * r;
            double daireCapi = 2 * r;
            double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);
            double kureYuzeyAlani = 4 * PI * r * r;

            System.out.println("\nSONUÇLAR:");
            System.out.printf("Daire Alani       : %.2f cm^2%n", daireAlani);
            System.out.printf("Daire Cevresi     : %.2f cm%n", daireCevresi);
            System.out.printf("Daire Capi        : %.2f cm%n", daireCapi);
            System.out.printf("Küre Hacmi        : %.2f cm^3%n", kureHacmi);
            System.out.printf("Küre Yüzey Alani  : %.2f cm^2%n", kureYuzeyAlani);

            input.close();
        }
    }
