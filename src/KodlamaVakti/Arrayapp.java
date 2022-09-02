package KodlamaVakti;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Arrayapp {
    public static void main(String[] args) {
//        int[][] tablo1=new int[][]{{1,75,10},{2,87,13},{7,18,65},{12,45,38},{7,6,25}};
//        int[][] tablo2=new int[5][3];
//        tablo2[0][0]=1;
//        tablo2[0][1]=78;
//        tablo2[0][2]=22;
//        tablo2[1][0]=2;
//        tablo2[1][1]=56;
//        tablo2[1][2]=38;
//        tablo2[2][0]=3;
//        tablo2[2][1]=19;
//        tablo2[2][2]=35;
//        tablo2[3][0]=4;
//        tablo2[3][1]=89;
//        tablo2[3][2]=37;
//        tablo2[4][0]=5;
//        tablo2[4][1]=39;
//        tablo2[4][2]=82;
//
//        for (int i = 0; i <tablo2.length; i++) {
//            for (int j = 0; j <tablo2[0].length; j++) {
//                System.out.print(tablo2[i][j]+" ");
//
//            }
//            System.out.println();
//
//        }


//        System.out.println("---------------------------------");
//
//        System.out.println("for each kullanimi");
//        int[]liste=new int[4];
//        liste[0]=1;
//        liste[1]=2;
//        liste[2]=3;
//        liste[3]=4;
//
//
//        for (int i = 0; i < liste.length; i++) {
//            int value=liste[i];
//            System.out.println(liste[i]);
//        }
//        System.out.println("------------");
//        for (int value:liste) {
//            System.out.println(value);
//
//        }


//        char[] text={'k','o','d','l','a','m','a'};
//        String metin=new String(text);
//        System.out.println(metin);



        int toplam=0;
        int[]notlar=new int[7];
        Scanner scanner=new Scanner(System.in);
        System.out.println("notlari girin:");
        System.out.println("Matematik");
        notlar[0]= scanner.nextInt();
        System.out.println("fizik");
        notlar[1]= scanner.nextInt();
        System.out.println("kimya");
        notlar[2]= scanner.nextInt();
        System.out.println("turkce");
        notlar[3]= scanner.nextInt();
        System.out.println("edebiyyat");
        notlar[4]= scanner.nextInt();
        System.out.println("felsefe");
        notlar[5]= scanner.nextInt();
        System.out.println("muzik");
        notlar[6]= scanner.nextInt();

        for (int not:notlar) {
            toplam+=not;


        }System.out.println(toplam/ notlar.length);













    }
}
