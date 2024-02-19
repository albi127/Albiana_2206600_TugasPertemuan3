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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan rangking");
        int rangking = input.nextInt();
        
        if (rangking == 1) {
            // Jika iya, memberi hadiah
            System.out.println("Selamat! Anda rangking 1, naik kelas, dan mendapat hadiah.");
        } else {
            System.out.println("Maaf, Anda tidak memenuhi syarat untuk mendapatkan hadiah.");
        }
        
        input.close();
    }
} 
  
