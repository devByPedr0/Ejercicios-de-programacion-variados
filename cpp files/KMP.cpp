#include <bits/stdc++.h>
using namespace std;

string generar_patron(string base, int repeticiones, bool romper = false) {
    string resultado;
    for (int i = 0; i < repeticiones; i++) {
        resultado += base;
    }
    if (romper) {
        resultado += base.substr(0, base.size() - 1); // rompe el patrón
    }
    return resultado;
}

int main() {
    ofstream casos("casos.txt");
    ofstream esperado("esperado.txt");

    // Caso 1: patrón perfecto
    string s1 = generar_patron("abc", 4); // abcabcabcabc
    casos << s1.size() << " " << s1 << "\n";
    esperado << 3 << "\n";

    // Caso 2: patrón roto al final
    string s2 = generar_patron("abc", 3, true); // abcabcab
    casos << s2.size() << " " << s2 << "\n";
    esperado << s2.size() << "\n";

    // Caso 3: un solo carácter
    string s3 = "a";
    casos << s3.size() << " " << s3 << "\n";
    esperado << 1 << "\n";

    // Caso 4: todos iguales
    string s4 = string(10, 'x'); // xxxxxxxxxx
    casos << s4.size() << " " << s4 << "\n";
    esperado << 1 << "\n";

    // Caso 5: patrón largo
    string s5 = generar_patron("abcd", 5); // abcdabcdabcdabcdabcd
    casos << s5.size() << " " << s5 << "\n";
    esperado << 4 << "\n";

    // Caso 6: patrón roto con ruido
    string s6 = "ababababx";
    casos << s6.size() << " " << s6 << "\n";
    esperado << s6.size() << "\n";

    // Caso 7: patrón parcial engañoso
    string s7 = "abcabcabcabx";
    casos << s7.size() << " " << s7 << "\n";
    esperado << s7.size() << "\n";

    // Caso 8: patrón con números
    string s8 = generar_patron("123", 6);
    casos << s8.size() << " " << s8 << "\n";
    esperado << 3 << "\n";

    // Caso 9: patrón con letras y números
    string s9 = generar_patron("a1b2", 3);
    casos << s9.size() << " " << s9 << "\n";
    esperado << 4 << "\n";

    // Caso 10: patrón roto con letra distinta
    string s10 = "abcabcabcabz";
    casos << s10.size() << " " << s10 << "\n";
    esperado << s10.size() << "\n";

    cout << "Casos generados en 'casos.txt' y 'esperado.txt'" << endl;
    return 0;
}
