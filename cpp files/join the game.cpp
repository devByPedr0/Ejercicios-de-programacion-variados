#include <bits/stdc++.h>
using namespace std;

main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int n;

    int a,b,c;

    cin>>n;

    while(n--){

       cin>>a>>b>>c;

       string s=""; int cont=0;

       if(a==b && b==c && a+b+c%3!=0) for(int i=1;i<=a;i++) s+="B";

       else if(abs(a-b)%3==0 && c-(abs(a-b)/3)>=0 && a+b+c%3!=0){ for(int i=1;i<=abs(a-b)/3;i++){if(min(a,b)==b) s+="B"; else s+="A"; cont++; } for(int i=1;i<=max(a,b)-cont;i++) s+="C"; }

       else if(abs(a-c)%3==0 && b-(abs(a-c)/3)>=0 && a+b+c%3!=0){ for(int i=1;i<=abs(a-c)/3;i++){if(min(a,c)==c) s+="C"; else s+="A"; cont++; } for(int i=1;i<=max(a,c)-cont;i++) s+="B"; }

       else if(abs(c-b)%3==0 && a-(abs(c-b)/3)>=0 && a+b+c%3!=0){ for(int i=1;i<=abs(c-b)/3;i++){if(min(c,b)==b) s+="B"; else s+="C"; cont++; } for(int i=1;i<=max(c,b)-cont;i++) s+="A"; }

       else {
        cout<<"NO"<<'\n';
        continue;
       }

       cout<<"YES"<<'\n'<<s<<'\n';
    }
}
