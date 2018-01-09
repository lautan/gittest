import java.util.Scanner;
public class perhitungan {
public static void main(String[] args){
                int panjang;
                int lebar;
                int luas;

                        Scanner a = new Scanner(System.in);
                        System.out.println("menghitung luas persegi panjang");
                        System.out.println("masukkan panjang = ");
                        panjang = a.nextInt();
                        System.out.println("masukkan lebar = ");
			lebar = a.nextInt();

                        luas = (panjang*lebar);
                        System.out.println("luas persegi panjang = " + luas);
        }
}

