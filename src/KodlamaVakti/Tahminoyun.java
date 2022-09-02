package KodlamaVakti;

import java.util.Random;
import java.util.Scanner;

public class Tahminoyun {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random rand=new Random();
        int sayi= rand.nextInt();
        int i=0;
        int can=5;
        boolean hata=false;
        boolean oyundurum=false;
        int[]tahminler=new int[5];
        System.out.println(sayi);

        System.out.println("Tahmin oyununa hosgeldiniz");
        System.out.println("0 ve 100 arasinda bir sayi tuttum");


        while (can>0){
            System.out.println("tahmininiz");
            int tahmin= scanner.nextInt();
            if (tahmin>0 && tahmin<15){
                if (hata){
                    System.out.println("cok fazla giris yaptiniz 1 can kaybettiniz");
                    System.out.println("Kalan can"+ --can);
                }
                else {
                    hata=true;
                    System.out.println("lutfen 0 ve 99 arasinda bir sayi giriniz");
                }
                continue;
            }
            tahminler[i++]=tahmin;

            if (tahmin==sayi){
                oyundurum=true;
                break;
            }

            else {
                System.out.println("Yanlis, tekrar deneyiniz. Kalan can"+--can);
            }
        }

        if (oyundurum){
            System.out.println("Tebriklet dogru tahmin!");
            System.out.println("sayimiz: "+sayi);
            System.out.println("kalan can: "+can);
        }







    }
}
