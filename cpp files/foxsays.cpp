#include<bits/stdc++.h>
#define fast_in ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);cout.setf(ios::fixed);cout.precision(0);
using namespace std;

main(){
    int t; cin>>t;

    string s; getline(cin,s);

    string goes;
    while(cin>>goes){

        string actual="";
        for(int i=goes.size()-1;i>=0;i--){
            actual=goes[i]+actual;;

            if(goes[i-1]==' ') break;
        }
        cout<<actual;
    }

}
