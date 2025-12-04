#include <iostream>
using namespace std;

int main()
{
    double kdv = 0.18;
    double litrefiyati = 42.88;
    double otv = 7.52;
    double toplam;
    double kdvli;
    double vergi;
    double vergisiz;
    double miktar;

    cout << "Kac litre benzin aldiniz = ";
    cin >> miktar;

    kdvli = (litrefiyati * miktar) * kdv;
    toplam = (litrefiyati * miktar) + otv + kdvli;
    vergi = kdvli + otv;
    vergisiz = litrefiyati * miktar;

    cout << "Toplam tutar = " << toplam << endl;
    cout << "Odenen vergi = " << vergi << endl;
    cout << "Vergisiz fiyati = " << vergisiz << endl;

    return 0;
}
