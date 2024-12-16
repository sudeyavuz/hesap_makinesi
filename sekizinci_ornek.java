package JAVA101;
import java.util.Scanner;
public class sekizinci_ornek {
    public static void main(String[] args) {
        int a , b ,c ;
        Scanner input = new Scanner(System.in);

        System.out.println("ilk sayı degerini giriniz: ");
        a = input.nextInt();

        System.out.println("ikinci sayı degerini giriniz: ");
        b = input.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-bölme\n4-çarpma");
        System.out.println("seçiminiz: ");
        c = input.nextInt();
        System.out.println(c);
        switch (c){
            case 1:
                System.out.println("toplam= "+ (a+b));
                break;
            case 2:
                System.out.println("çıkarma= "+ (a-b));
                break;
            case 3:
                System.out.println("bölme= "+ (a/b));
                break;
            case 4:
                System.out.println("çarpma= "+(a*b));
                break;
            default:
                System.out.println("girdiginiz deger 1 ile 4 arasında degil");

        }
    }
    }

