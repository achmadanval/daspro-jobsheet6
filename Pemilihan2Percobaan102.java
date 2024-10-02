import java.util.Scanner;


public class Pemilihan2Percobaan102 {

    public static void main(String [] argss){
    Scanner sc02 = new Scanner(System.in);
    
    System.out.println("Masukkan tahun : ");
    int tahun = sc02.nextInt();
    if ((tahun % 4) == 0) {
        if ((tahun % 100) != 0){
            System.out.println("Tahun Kabisat");
        }
    else
        System.out.println("Bukan Tahun Kabisat");
        
    }
    }
}