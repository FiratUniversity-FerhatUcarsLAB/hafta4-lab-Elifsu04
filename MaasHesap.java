









import java.util.Scanner;

    public class MaasHesap {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // --- Bilgi Girişi ---
            System.out.print("Çalışanın adı ve soyadı: ");
            String adSoyad = input.nextLine();

            System.out.print("Aylık brüt maaş (TL): ");
            double brutMaas = input.nextDouble();

            System.out.print("Haftalık çalışma saati: ");
            int haftalikSaat = input.nextInt();

            System.out.print("Mesai saati sayısı: ");
            int mesaiSaati = input.nextInt();

            // --- Hesaplamalar ---

            // 1. Gelirler
            double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5; // 160 saat = 4 hafta * 40 saat
            double toplamGelir = brutMaas + mesaiUcreti;

            // 2. Kesintiler
            double sgk = toplamGelir * 0.14;
            double gelirVergisi = toplamGelir * 0.15;
            double damgaVergisi = toplamGelir * 0.00759;
            double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

            // 3. Net Maaş
            double netMaas = toplamGelir - toplamKesinti;

            // --- Çıktı ---
            System.out.println("\n=== MAAŞ BORDROSU ===");
            System.out.println("Çalışan: " + adSoyad);
            System.out.printf("Brüt Maaş        : %.2f TL%n", brutMaas);
            System.out.printf("Mesai Ücreti     : %.2f TL%n", mesaiUcreti);
            System.out.printf("Toplam Gelir     : %.2f TL%n", toplamGelir);
            System.out.printf("SGK Kesintisi    : %.2f TL%n", sgk);
            System.out.printf("Gelir Vergisi    : %.2f TL%n", gelirVergisi);
            System.out.printf("Damga Vergisi    : %.2f TL%n", damgaVergisi);
            System.out.printf("Toplam Kesinti   : %.2f TL%n", toplamKesinti);
            System.out.printf("NET MAAŞ         : %.2f TL%n", netMaas);

            input.close();
        }
    }

