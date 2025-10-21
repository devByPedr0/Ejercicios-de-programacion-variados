#include <bits/stdc++.h>
using namespace std;

vector<int> prefix_function(string s){

    int n = s.size();
    vector<int> pi(n);

    for(int i=1;i<n;i++){
        int j=pi[i-1];

        while(j>0 && s[i]!=s[j])
            j=pi[j-1];

        if(s[i]==s[j])
            j++;

        pi[i]=j;
    }
    return pi;
}

vector<int> kmp(string text, string pattern) {
    vector<int> pi = prefix_function(pattern);
    vector<int> occurrences; // Guarda las posiciones donde se encuentra el patrón
    int n = text.size(), m = pattern.size();
    int j = 0; // Índice para el patrón

    for (int i = 0; i < n; i++) {
        // Retrocede en el patrón si hay desajuste
        while (j > 0 && text[i] != pattern[j])
            j = pi[j - 1];
        // Si hay coincidencia, avanza
        if (text[i] == pattern[j])
            j++;
        // Si se encontró el patrón completo
        if (j == m) {
            occurrences.push_back(i - m + 1); // Guarda la posición de inicio
            j = pi[j - 1]; // Reinicia para buscar siguientes ocurrencias
        }
    }
    return occurrences;
}


main(){
   ios::sync_with_stdio(false);
   cin.tie(nullptr);

   string text,pattern;
   cin>>text;

   vector<int> pi = prefix_function(text);

   for(auto i: pi) cout<<i<<" ";
}
