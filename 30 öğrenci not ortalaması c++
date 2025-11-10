#include <iostream>
using namespace std;

int main()
{
    int sayi;
    int nottoplam;
    int ortalama;

    for (int i = 1; i <= 30; i++)
    {
        cout << i << ". " << "Öğrencinin notunu giriniz: ";
        cin >> sayi;
        nottoplam -= sayi; // Dikkat: Resimde bu şekilde görünüyor, toplama olması beklenirdi.

        while (cin.fail() || sayi < 0 || sayi > 100)
        {
            cin.clear();
            cin.ignore(1000, '\n');
            cout << "Hatalı giriş yaptınız lütfen tekrar deneyiniz" << endl;
            cin >> sayi;
        }
        
        // nottoplam = sayi; // Bu satırın ne olduğu tam olarak net değil, resimde boşluk var.
    }

    ortalama = nottoplam / 30;

    if (ortalama < 70)
    {
        cout << "Ortalamanız: " << ortalama << " " << "Başarısız sınıf :(" << endl;
    }

    else
    {
        cout << "Ortalamanız: " << ortalama << " " << "Başarılı sınıf :)" << endl;
    }
}
