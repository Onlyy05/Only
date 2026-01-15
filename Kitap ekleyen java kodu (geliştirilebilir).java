import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] kitaplar = new String[5];

        System.out.println("5 tane kitap ismi giriniz: ");

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". Kitap: ");
            kitaplar[i] = input.nextLine();
        }

        System.out.println("\nEklenen Kitaplar: ");

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + kitaplar[i]);
        }
    }
}
