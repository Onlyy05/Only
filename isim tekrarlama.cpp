#include <iostream>
#include <string>
using namespace std;

int main()
{
    int tekrar;
    string isim;

    cout << "Ad Soyad giriniz: ";
    getline(cin, isim);

    cout << "Tekrar sayisini giriniz: ";
    cin >> tekrar;

    for (int i = 1; i <= tekrar; i++)
    {
        cout << isim << endl;
    }

    return 0;
}
