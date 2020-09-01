package hesap.makinesi.pkgif.pkgelse;

import java.util.Scanner;

public class HesapMakinesiIfElse {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
    System.out.println("******************************");
        String islemler = "1.Toplama islemi\n"
                    + "2.Çıkarma islemi\n"
                    + "3.Bölme islemi  \n"
                    + "4.Çarpma islemi";
    System.out.println(islemler);
    System.out.println("********************************");
        double a;
        double b;
          System.out.print("Sayı seçiniz : ");
          String sayı = scanner.nextLine();
         if (sayı.equals("1")){
            System.out.print("1.sayıyı giriniz : ");
              a = scanner.nextDouble();
              System.out.print("2.sayıyı giriniz : ");
              b = scanner.nextDouble();
              double toplam1 = (double)a+b;
              System.out.println("toplam : "+toplam1);
         }          
          else if (sayı.equals("2")){
              System.out.print("1.sayıyı giriniz : ");
              a = scanner.nextDouble();
              System.out.print("2.sayıyı giriniz : ");
              b = scanner.nextDouble();
              double toplam1 = (double)a-b;
              System.out.println("toplam : "+toplam1);
          }
          else if (sayı.equals("3")){
              System.out.print("1.sayıyı giriniz : ");
              a = scanner.nextDouble();
              System.out.print("2.sayıyı giriniz : ");
              b = scanner.nextDouble();
              double toplam2 = (double)a/b;
              System.out.println("toplam : "+toplam2);
          }
          else if (sayı.equals("4")){
              System.out.print("1.sayıyı giriniz : ");
              a = scanner.nextDouble();
              System.out.print("2.sayıyı giriniz : ");
              b = scanner.nextDouble();
              double toplam3 = (double)a*b;
              System.out.println("toplam : "+toplam3);
          }
          else {
              System.out.println("İşlem geçersiz...");
              
          }
}
}
