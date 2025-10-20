import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Vize notunuzu giriniz: ");
        int vize = input.nextInt();

        while (vize < 0 || vize > 100 ) {
            System.out.print("Hatali Giris Yaptiniz lutfen tekrar deneyin: ");
            vize = input.nextInt();

        }

        System.out.print("Final notunuzu giriiz: ");
        int finall = input.nextInt();

        while (finall < 0 || finall > 100 ) {
            System.out.print("Hatali Giris Yaptiniz lutfen tekrar deneyin: ");
            finall = input.nextInt();

        }

        double not = (vize * 0.04) + ( finall * 0.6);
        System.out.println("Ortalamanız: " + not);

        if (not >=90) {
            System.out.println("AA ile gecti");
        }
        else if (not >= 80){
            System.out.println("BA ile gecti");
        }
        else if (not >= 70){
            System.out.println("BB ile gecti");
        }
        else if (not >= 60){
            System.out.println("CB ile gecti");
        }
        else if (not >= 50){
            System.out.println("CC ile gecti");
        }
        else {
            System.out.println("Kaldı");
        }

        input.close();

        }
    }

