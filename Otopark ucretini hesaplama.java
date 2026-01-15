import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Saat bilgisini Giriniz:");
        int saat = input.nextInt();
        int ucret = 0;

        if (saat < 0) {
            System.out.println("Hatalı Giriş yaptınız");
        }
        else if (saat < 2) {
            ucret = 200;
        }
        else if (saat < 4) {
            ucret = 400;
        }
        else if (saat < 8) {
            ucret = 600;
        }
        else {
            ucret = 1000;
        }

        System.out.println("Ucretiniz:" + ucret + "TL");
        input.close();
    }
}
