import java.util.Scanner;

public class TugasPemilihan02 {

    public static void main(String[] args) {
        String jenisBuku;
        double Diskon = 0.0;
        int harga = 20000;
        int JumlahBuku;
        Scanner sc02 = new Scanner(System.in);
        System.out.println("Masukkan jenis buku  : ");
        jenisBuku = sc02.nextLine();
        System.out.println("Masukkan Jumlah Buku : ");
        JumlahBuku = sc02.nextInt();

       if (jenisBuku.equalsIgnoreCase("Kamus")) {
            if (JumlahBuku > 2) 
                Diskon = 0.12;
            else if (JumlahBuku <= 2) 
                Diskon = 0.1;
               
       }else if (jenisBuku.equalsIgnoreCase("Novel")) {
            if (JumlahBuku > 3)
                Diskon = 0.9;    
            else if (JumlahBuku <= 3)
                Diskon = 0.7;

       }else if (!jenisBuku.equalsIgnoreCase("kamus") && !jenisBuku.equalsIgnoreCase("Novel")) {
            if (JumlahBuku > 3) 
                Diskon = 0.05;
            else
                Diskon = 0.0;
            
       }

       double totalHarga = harga * JumlahBuku;
       double totalAkhir = totalHarga - (Diskon * totalHarga);

       // Menampilkan hasil
       System.out.printf("Total harga sebelum diskon: Rp. %.2f\n", totalHarga);
       if (Diskon > 0) {
           System.out.printf("Diskon untuk buku '%s': %.0f%%\n", jenisBuku, Diskon * 100);
           System.out.printf("Total harga setelah diskon: Rp. %.2f\n", totalAkhir);
       } else {
           System.out.printf("Tidak ada diskon yang berlaku.\n");
           System.out.printf("Total harga: Rp. %.2f\n", totalHarga);
       }
    }
}