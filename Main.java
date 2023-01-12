import java.util.Scanner;
public class Main {

    static int sum(int a, int b){
        int result = a + b;
        System.out.println("Değeriniz: " + result);
        return result;
    }
    static int cikar(int a, int b){
        int result  = a - b;
        System.out.println("Değeriniz: " + result);
        return result;
    }

    static int carp(int a, int b){
        int result = a*b;
        System.out.println("Değeriniz: " + result);
        return result;
    }
    static int bolme(int a, int b){
        if (b == 0){
            System.out.println("Hatalı Giriş Yaptınız!");
            return 0;
        }
        int result = a/b;
        System.out.println("Değeriniz: " + result);
        return result;
    }
    static int uslu(int a, int b){
        int result = 1;
        for (int i = 1; i<=b; i++){
            result *=a;}
        return result;
    }
    static int mod(int a, int b){
        int result = a%b;
        return result;
    }
    static void cevre(int a, int b){
        System.out.println("Çevresi: " + 2*(a+b));
        System.out.println("Alanı: " + a*b);
    }

    public static void main(String[] args) {
        int select;
        Scanner inp = new Scanner(System.in);
        String menu = "1 - Toplama\n" +
                "2 - Çıkarma\n" +
                "3 - Çarpma\n" +
                "4 - Bölme\n" +
                "5 - Üslü Sayı Hesaplama\n" +
                "6 - Mod Alma\n" +
                "7 - Dikdörtgen Alan ve Çevre Hesabı";

        System.out.println(menu);
        while (true){
            System.out.println();
            System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
            select = inp.nextInt();

            if (select == 0){
                break;
            }

            System.out.print("Lütfen İlk Değeri Giriniz: ");
            int a = inp.nextInt();
            System.out.print("Lütfen İkinci Değeri Giriniz: ");
            int b = inp.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    cikar(a,b);
                    break;
                case 3:
                    carp(a,b);
                    break;
                case 4:
                    bolme(a,b);
                    break;
                case 5:
                    System.out.println("Değeriniz: " + uslu(a,b));
                    break;
                case 6:
                    System.out.println("Değeriniz: " + mod(a,b));
                    break;
                case 7:
                    cevre(a,b);
                    break;
                default:
                    System.out.println("Hatalı Giriş Yaptınız!");
            }
        }
        System.out.println("Tekrar Görüşmek Üzere.");
    }
}