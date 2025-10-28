/*
 * Ad Soyad: Elif su KANSU
 * Ogrenci No: 250541004
 * Tarih: 28.10.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;
import java.util.Locale;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        
        // Degisken tanimlamalari
        // String ad, soyad;
        // int ogrenciNo, yas;
        // double gpa;
        
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        System.out.print("Adınızı giriniz: ");
        String ad = input.nextLine();
        
        // Soyad
        System.out.print("Soyadınızı giriniz: ");
        String soyad = input.nextLine();
        
        // Ogrenci No
       System.out.print("Öğrenci Numaranız: ");
        int ogrenci_no = input.nextInt(); 
        
        // Yas
         System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        
        // GPA
         System.out.print("Not ortalamanız: ");
        double not = input.nextDouble();
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // COZUMUNUZU BURAYA YAZIN
        System.out.println("\n=== ÖĞRENCİ BİLGİ SİSTEMİ ===");
        System.out.printf("Ad Soyad: %s %s\n", ad, soyad);
        System.out.printf("Öğrenci No: %d\n", ogrenci_no);
        System.out.printf("Yas: %d\n", yas);
        System.out.printf("Not ort: %.2f\n", not);
    
        // Scanner'i kapatin (önemli pratik)
        input.close();
    }
}
