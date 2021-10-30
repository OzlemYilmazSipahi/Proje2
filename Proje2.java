
import java.util.Scanner;

public class Proje2 {
    public static void main(String[] args){
        double price, kdvOran1 = 0.18, kdvOran2 = 0.08;

        Scanner input = new Scanner(System.in);
        System.out.print("Ürün Fiyatını Giriniz: ");
        price = input.nextDouble();


        System.out.println("KDV'siz Fiyat: " + price);

        boolean kosul1 = price > 0;
        boolean kosul2 = price <1000;
        boolean kdvSec = kosul1 && kosul2;

        double sonucK1, sonucK2, sonucT1, sonucT2;

        sonucK1 = price * (1 + kdvOran1);
        sonucT1 = price * kdvOran1;
        sonucK2 = price * (1 + kdvOran2);
        sonucT2 = price * kdvOran2;

        System.out.print("KDV'li Fiyat: " );
        double sonFiyat = kdvSec ? sonucK1 : sonucK2;
        System.out.println(sonFiyat);

        System.out.print("KDV Tutarı: " );
        double sonKdv = kdvSec ? sonucT1 : sonucT2;
        System.out.println(sonKdv);


    }



}
