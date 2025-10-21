#include <bits/stdc++.h>
using namespace std;

vector<int> manacher(const string& s) {
    int n = s.size();
    string t = "@";  // delimitador inicial
    for (char c : s) {
        t += "#" + string(1, c);
    }
    t += "#$";  // delimitador final

    int m = t.size();
    vector<int> p(m, 0);
    int center = 0, right = 0;

    for (int i = 1; i < m - 1; i++) {
        int mirror = 2 * center - i;

        if (i < right)
            p[i] = min(right - i, p[mirror]);

        while (t[i + (1 + p[i])] == t[i - (1 + p[i])])
            p[i]++;

        if (i + p[i] > right) {
            center = i;
            right = i + p[i];
        }
    }

    // Extraer solo los valores correspondientes a caracteres originales
    vector<int> result;
    for (int i = 2; i < m - 2; i += 2) {
        result.push_back(p[i]);
    }

    return result;
}

int main() {
    string s; cin>>s;
    vector<int> pal_lengths = manacher(s);

    int idx,mx=0;

    for(int i=0;i<pal_lengths.size();i++){

        if(pal_lengths[i]>mx){
            mx=pal_lengths[i];
            idx=i;
        }

    }

    cout<<s.substr(idx-mx/2,mx);

    return 0;
}
