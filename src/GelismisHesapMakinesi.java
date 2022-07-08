import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int toplama(int a, int b) {
        int result = a + b;
        System.out.println("Sonuc : " + result);
        return result;
    }

    static int cikarma(int a, int b) {
        int result = a - b;
        System.out.println("Sonuc" + result);
        return result;
    }

    static int bolme(int a, int b) {
        int result = a / b;
        System.out.println("Sonuc" + result);
        return result;
    }

    static int carpma(int a, int b) {
        int result = a * b;
        System.out.println("Sonuc : " + result);
        return result;
    }

    static int uslu(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuc : " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Sonuc" + result);
        return result;
    }

    static int dikdortgen(int a, int b) {
        int alan = a * b;
        int cevre = (2 * a) + (2 * b);
        System.out.println("Alan" + alan + "\n" + "Cevre " + cevre);
        return 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = "1 - Toplama islemi\n" +
                "2 - Cikarma islemi\n" +
                "3 - Bolme islemi \n" +
                "4 - Carpma islemi\n" +
                "5 - Uslu Sayi Hesaplama \n" +
                "6 - Mod alma\n" +
                "7 - Dikdortgen Alani ve Cevre Hesabi\n" +
                "0 - Cikis";
        while (true) {
            System.out.println(menu);
            System.out.print("Islem seciniz : ");
            int select = input.nextInt();
            if (select == 0 || select > 7) {
                if (select > 7) {
                    System.out.println("Hatali giris yapildi.");
                } else {
                    System.out.println("Cikis yapildi..");
                }
                break;
            }
            System.out.println("Birinci sayiyi giriniz : ");
            int a = input.nextInt();
            System.out.println("Ikinci sayiyi giriniz : ");
            int b = input.nextInt();
            switch (select) {
                case 1:
                    toplama(a, b);
                    break;
                case 2:
                    cikarma(a, b);
                    break;
                case 3:
                    bolme(a, b);
                    break;
                case 4:
                    carpma(a, b);
                    break;
                case 5:
                    uslu(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    dikdortgen(a, b);
                    break;
                default:
                    System.out.println("Hatali giris yapildi.");
            }
        }
    }
}


