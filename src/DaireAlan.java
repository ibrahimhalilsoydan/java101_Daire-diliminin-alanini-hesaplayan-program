import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {

        double r, a;
        double pi =3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: ");
        r= input.nextDouble();

        System.out.print("Açıyı giriniz ");
        a= input.nextDouble();

        double alan = ( pi * (r * r) * a ) / 360;

        System.out.print(alan);






    }
}