import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int sayi;
    int baslangic2 = 0;
    int baslangic4 = 0;
    int baslangic5 = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for(int i = 1; i<=sayi; i*=2){
            System.out.println("2'nin " + baslangic2++ +"'nci kuvveti : " + i);
        }
        System.out.println("*******************************************************");
        for(int i = 1; i<=sayi; i*=4){
            System.out.println("4'ün " + baslangic4++ +"'nci kuvveti : " + i);
        }
        System.out.println("*******************************************************");
        for(int i = 1; i<=sayi; i*=5){
            System.out.println("5'in " + baslangic5++ +"'nci kuvveti : " + i);
        }


    }
}