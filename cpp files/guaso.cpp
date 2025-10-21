#include <bits/stdc++.h>
using namespace std;

int main() {

    int n; cin>>n;
    vector<string> s;

    for(int i=0;i<n;i++){
        string aux;
        getline(cin,aux);
        s.push_back(aux);
    }

    for(string& line: s){


        for(char& c: line){
            c = tolower(c);
        }

        for(int i=0;i<line.size();i++){

                char c=line[i];
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                line[i]='-';
            }
        }
    }

    for(int i=0;i<n;i++){
        cout<<s[i]<<endl;
    }

    return 0;
}
