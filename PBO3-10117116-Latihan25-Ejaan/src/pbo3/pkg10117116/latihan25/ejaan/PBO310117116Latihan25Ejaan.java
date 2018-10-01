/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan25.ejaan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Ejaan Nama
 *  
 */
public class PBO310117116Latihan25Ejaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         String Kata;
        
        
        Scanner baca = new Scanner (System.in);
        
        System.out.printf("Masukan nama depan anda untuk di eja : ");
        Kata = baca.next();
        
        System.out.println("");
        System.out.println("Ejaan untuk" + " '" + Kata + "' " + "adalah : " );
        
        
        
        for(int i=0; i<Kata.length(); i++) {
            String ambilkata;
            ambilkata = Kata.substring(i, i+1);
            System.out.println("Huruf ke-" + (i+1) + " : " + (ambilkata));
        }
    }
    
}
