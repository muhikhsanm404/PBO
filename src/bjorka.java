
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muh Ikhsan M
 */

public class bjorka implements PPN {
        public String vendor;
        public String tipe;
        public double harga;
        

    public bjorka(String vendor,String tipe,double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }
   
@Override
    public void hitungHarga() {
       //inisialisasi, deklarasi, assignment variabel hargaSetelah PPN 
        double hargasetelahPPN1 = harga + (harga * pajak1persen);
        double hargasetelahPPN2 = harga + (harga * pajak2persen);
        double hargasetelahPPN5 = harga + (harga * pajak5persen);
        
        if (harga > 4000000 && harga < 4200000) 
        { 
            System.out.println("PPN 1%"); 
               System.out.println("PPN: Rp " + harga * pajak1persen); 
                 System.out.println("Harga setelah PPN: Rp " + hargasetelahPPN1); 
        }
        
        else if 
           (harga > 4200000 && harga <= 4500000) 
        
        { 
            System.out.println("PPN 2%");
               System.out.println("PPN: Rp " + harga * pajak2persen);
                  System.out.println("Harga setelah PPN: Rp " + hargasetelahPPN2);
        
        }
        else if 
           (harga > 4500000) 
        { 

            
            System.out.println("PPN 5%");
                System.out.println("PPN: Rp " + harga * pajak5persen);
                    System.out.println("Harga setelah PPN: Rp " + hargasetelahPPN5);
        }
    }
      
    public static void main(String[] args) {
   
          bjorka hp1 = new bjorka("Samsung", "A51", 5000000);
        System.out.println("Vendor: " + hp1.vendor);
        System.out.println("Tipe: " + hp1.tipe);
        System.out.println("Harga: Rp " + hp1.harga);
        hp1.hitungHarga(); 
          bjorka hp2 = new bjorka("Oppo", "Reno 5", 4400000);
        System.out.println("\nVendor: " + hp2.vendor);
        System.out.println("Tipe: " + hp2.tipe);
        System.out.println("Harga: Rp " + hp2.harga);
        hp2.hitungHarga(); 
          bjorka hp3 = new bjorka("Xiaomi", "A1", 4100000);
        System.out.println("\nVendor: " + hp3.vendor);
        System.out.println("Tipe: " + hp3.tipe);
        System.out.println("Harga: Rp " + hp3.harga);
        hp3.hitungHarga();
    }

}