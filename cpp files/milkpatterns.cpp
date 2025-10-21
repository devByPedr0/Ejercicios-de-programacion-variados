#include <bits/stdc++.h>
using namespace std;

// Tu función original
int resolver(int n, const string& s) {
    vector<int> pi(n);
    for (int i = 1; i < n; i++) {
        int j = pi[i - 1];
        while (j > 0 && s[i] != s[j])
            j = pi[j - 1];
        if (s[i] == s[j])
            j++;
        pi[i] = j;
    }

    int len = n - pi[n - 1];
    if (n % len == 0) {
        string pattern = s.substr(0, len);
        for (int i = 0; i < n; i++) {
            if (s[i] != pattern[i % len])
                return n;
        }
        return len;
    } else {
        return n;
    }
}

int main() {
    ifstream casos("casos.txt");
    ifstream esperado("esperado.txt");
    ofstream fallos("fallos.txt");

    string linea, s;
    int n, caso = 1, esperado_val;

    while (getline(casos, linea) && esperado >> esperado_val) {
        stringstream ss(linea);
        ss >> n >> s;

        int resultado = resolver(n, s);

        if (resultado != esperado_val) {
            fallos << "Caso " << caso << " FALLÓ\n";
            fallos << "Entrada: " << n << " " << s << "\n";
            fallos << "Esperado: " << esperado_val << ", Obtenido: " << resultado << "\n\n";
        }

        caso++;
    }

    cout << "Verificación completada. Revisa fallos.txt para los errores." << endl;
    return 0;
}
