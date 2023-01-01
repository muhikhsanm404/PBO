
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muh Ikhsan M
 */
public class perhitungan {
    
 public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        // scanner merupakan fungsi untuk menginputkan data / nilai saat setelah program di running/di jalankan. Untuk mempermudah pemahaman , saya akan beri contoh program dengan operator  *  + / - 

        int a = 100, b = 25, hasil;
        // <-- membuat variabel a dengan tipe data int dan value 100
	// <-- membuat variabel b dengan tipe data int dan value 25
	// <-- membuat variabel hasil dengan tipe data int dan value 0 ( null g perlu ditulis)
        
        //menampilkan menu pilihan start
        System.out.println("### Program Menu Pilihan Matematika dengan Switch Case ###\n");
        System.out.println("a = 100, \t b = 25\n"); //  \t untuk spasi \n untuk baris baru
        // mencetak menu pilihan 
        System.out.println("1.Pilihan Penjumlahan");
        System.out.println("2.Pilihan Pengurangan");
        System.out.println("3.Pilihan Perkalian");
        System.out.println("4.Pilihan Pembagian"); 
        System.out.print("\nMasukkan Pilihan : "); // mencetak inputan yang akan di pilih 
        int pilihan = scanner.nextInt();
// Dalam kode ini melakukan proses input dengan  perintah int PILIHAN=scanner.nextInt(). 
//Sehingga, variable pilihan akan berisi data angka. 
//Karena proses pembacaan data menggunakan perintah scanner.nextInt(), 
//maka jika kita input huruf atau kata (string) , program Java akan error:


        switch (pilihan) {
   // menampilkan menu pilihan end  + Kondisi SWITCH CASE adalah percabangan kode program dimana kitas membandingkan isi sebuah variabel dengan beberapa nilai. 
   //Jika proses perbandingan tersebut menghasilkan true, maka block kode program akan di proses.
            case 1 -> { // < jika pilihan 1 maka
                hasil = a + b; // menjumlahkan hasil dari variabel a dan variabel b  
                System.out.println("\n100 + 25 = " + hasil); // dan menjalankan statement yang cetak hasil dari penjumlah 100 ditambah 25
                }
            case 2 -> { // < jika pilihan 2 maka
                hasil = a - b; // pengurangan hasil dari variabel a dan variabel b  
                System.out.println("\n100 - 25 = " + hasil); // dan menjalankan statement yang cetak hasil dari pengurangan 100 ditambah 25
                }
            case 3 -> { // < jika pilihan 3 maka
                hasil = a * b;
                System.out.println("\n100 * 25 = " + hasil);
                }
            case 4 -> { // < jika pilihan 4 maka
                hasil = a / b;
                System.out.println("\n100 / 25 = " + hasil);
                }
            default -> System.out.println("\nPilihan Anda Salah!");
   // jika output tidak sesuai dengan pilihan menu dari 1 sampai 4 maka akan mencetak “pilihan Anda Salah”
        }
    }
}
