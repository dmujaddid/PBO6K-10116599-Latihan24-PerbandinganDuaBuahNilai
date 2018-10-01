/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : Program perbandingan dua buah nilai yang inputannya berasal dari user.
 * 
 */
public class PBO6K10116599Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Variabel
        int nilaiPertama, nilaiKedua;
        String Ulang;
        
        System.out.println("=======Program Perbandingan Nilai=======");
        Scanner scan = new Scanner(System.in);
        
        
        // Input Nilai
        System.out.print("Masukkan nilai pertama : ");
        nilaiPertama = scan.nextInt();
        
        System.out.print("Masukkan nilai kedua : ");
        nilaiKedua = scan.nextInt();
        
        
        // Output
        int i;       

        
        if (nilaiPertama>nilaiKedua) 
            System.out.println("Hasil : " +nilaiPertama+ " lebih besar dari " +nilaiKedua );
         else 
            System.out.println("Hasil : " +nilaiKedua+ " lebih besar dari " +nilaiPertama);
        
       
            System.out.println();
            System.out.print("Ulangi Aktivitas? (Ya/Tidak)");
            Ulang = scan.next();
            
        
    }
    
}
