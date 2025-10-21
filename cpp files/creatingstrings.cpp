#include <bits/stdc++.h>
using namespace std;

int main() {

    string s; cin>>s;

    sort(s.begin(),s.end());

    int cont=0;
    vector<string> sol;
    do{
         sol.push_back(s);
         cont++;

    }while(next_permutation(s.begin(),s.end()));

    cout<<cont<<endl;

    for(auto i : sol) cout<<i<<endl;

    return 0;
}
