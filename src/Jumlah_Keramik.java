import java.util.Scanner;

public class Jumlah_Keramik {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        //input luas keramik=panjang*lebar
        System.out.println("Masukkan Ukuran Keramik Dalam Centimeter(cm)");
        System.out.print("Panjang= ");
        float Panjang = userinput.nextInt();
        System.out.print("Lebar= ");
        float Lebar = userinput.nextInt();

        //aritmatika luas keramik
        double hasil= (Panjang*Lebar)/100;


        //input luas bangunan = panjang*lebar
        System.out.println("Masukkan Ukuran Bangunan Dalam Meter (M)");
        System.out.print("Panjang Bangunan= ");
        float Panjang_Bangunan = userinput.nextInt();
        System.out.print("Lebar Bangunan= ");
        float Lebar_Bangunan = userinput.nextInt();

        //aritmatika luas bangunan
        double hasil2= Panjang_Bangunan*Lebar_Bangunan;


        //Aritmatika menghitung jumlah keramik bangunan
        double hasil3= (hasil2/hasil)*100;


        //output
        System.out.println("Jumlah Keramik= "+ hasil3);

    }
}
