import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int sayi;
    int baslangic = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for(int i = 1; i<=sayi; i*=2){
            System.out.println("2'nin " + baslangic++ +"'nci kuvveti : " + i);
        }

    }
}