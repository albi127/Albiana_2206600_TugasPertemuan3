/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;
import java.util.Scanner;
/**
 *
 * @author anya
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan pecahan pertama (format: pembilang penyebut): ");
        int pembilang1 = scanner.nextInt();
        int penyebut1 = scanner.nextInt();

        System.out.print("Masukkan pecahan kedua (format: pembilang penyebut): ");
        int pembilang2 = scanner.nextInt();
        int penyebut2 = scanner.nextInt();
        
        System.out.print("Masukkan pecahan ketiga (format: pembilang penyebut): ");
        int pembilang3 = scanner.nextInt();
        int penyebut3 = scanner.nextInt();
        
        // Penjumlahan pecahan
        int hasilPembilangTambah = (pembilang1 * penyebut2 * penyebut3) +
                (pembilang2 * penyebut1 * penyebut3) +
                (pembilang3 * penyebut1 * penyebut2);
        int hasilPenyebutTambah = penyebut1 * penyebut2 * penyebut3;

        // Pengurangan pecahan
        int hasilPembilangKurang = (pembilang1 * penyebut2 * penyebut3) -
                (pembilang2 * penyebut1 * penyebut3) -
                (pembilang3 * penyebut1 * penyebut2);
        int hasilPenyebutKurang = penyebut1 * penyebut2 * penyebut3;

        // Perkalian pecahan
        int hasilPembilangKali = pembilang1 * pembilang2 * pembilang3;
        int hasilPenyebutKali = penyebut1 * penyebut2 * penyebut3;

        // Pembagian pecahan
        int hasilPembilangBagi = pembilang1 * penyebut2 * penyebut3;
        int hasilPenyebutBagi = penyebut1 * pembilang2 * penyebut3;

        // Menampilkan hasil operasi
        System.out.println("Hasil Penjumlahan: " + hasilPembilangTambah + "/" + hasilPenyebutTambah);
        System.out.println("Hasil Pengurangan: " + hasilPembilangKurang + "/" + hasilPenyebutKurang);
        System.out.println("Hasil Perkalian: " + hasilPembilangKali + "/" + hasilPenyebutKali);
        System.out.println("Hasil Pembagian: " + hasilPembilangBagi + "/" + hasilPenyebutBagi);
    }
    
}
