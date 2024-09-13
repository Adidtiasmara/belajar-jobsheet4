import java.util.Scanner;

public class Lingkaran18 {
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            //Deklarasi
            int r;
            double keliling, luas;
            float phi = 3.14f;


            System.out.print("Masukkan jari-jari lingkaran: ");
            r = input.nextInt();

            keliling = (2*phi)*r;

            luas = phi*r*r;

            System.out.println(keliling);
            System.out.println(luas );

            input.close();


        }
    }