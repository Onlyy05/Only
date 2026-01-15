#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int a, b, c;
    cout << "a degerini giriniz= ";
    cin >> a;
    cout << "b degerini giriniz= ";
    cin >> b;
    cout << "c degerini giriniz= ";
    cin >> c;

    double delta;
    delta = (b * b) - (4 * a * c);

    if (delta < 0)
    {
        cout << "Kok yoktur.";
    }
    else if (delta == 0)
    {
        cout << "Cakisik iki kok vardir";
    }
    else
    {
        int x1 = (-b + sqrt(delta)) / (2 * a);
        int x2 = (-b - sqrt(delta)) / (2 * a);
        cout << "Iki farkli kok vardir." << endl;
        cout << "x1 = " << x1 << endl;
        cout << "x2 = " << x2 << endl;
    }

    return 0;
}
