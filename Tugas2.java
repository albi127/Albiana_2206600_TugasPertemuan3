/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;
import java.util.Scanner;
/**
 *
 * @author anya
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk nilai rangking dan naikKelas
        System.out.print("Masukkan rangking anda: ");
        int rangking = scanner.nextInt();

        System.out.print("Apakah Anda naik kelas? (true/false): ");
        boolean naikKelas = scanner.nextBoolean();
        
        // Mengecek apakah siswa mendapat peringkat 1 di kelasnya dan naik kelas
        if (rangking <= 30 && naikKelas) {
            if(rangking == 1 && naikKelas) {
                System.out.println("Anda mendapat hadiah karena peringkat 1 dan naik kelas!");
            } else {
                System.out.println("Anda peringkat ke- " + rangking);
                System.out.println("Anda Naik kelas tapi anda belum memenuhi syarat untuk mendapatkan hadiah");
            }
        } else {
            System.out.println("mohon maaf anda belum naik kelas");
        }
        scanner.close();
    }
    
}
  
