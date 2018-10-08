/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author lenovo
 * NAMA  : Bonaventura Aldino Senda Seni
 * KELAS : IF-3
 * NIM   : 10117122
 * Deskripsi Program : User memilih berapa jumlah mahasiswa yang akan dihitung 
 *                     nilai rata-ratanya, memasukan nilai mahasiswa, 
 *                     dan menampilkan rata-rata nilai
 * 
 */
public class PBO310117122Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         AverageValue mah = new AverageValue();
         Scanner input = new Scanner(System.in);

         int banyak; 
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         banyak = input.nextInt();

         mah.HitungTotal(mah.nilaiMhs, banyak);
         mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, banyak);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "
                + mah.HitungRataRataNilaiMhs (mah.totalNilaiMhs, banyak));
        System.out.println("Developed by : Bonaventura Aldino Senda Seni");
    }
    
}
