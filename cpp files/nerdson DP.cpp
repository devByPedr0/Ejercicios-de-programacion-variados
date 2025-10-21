#include<bits/stdc++.h>
using namespace std;

int main(){

    string s,o; int n; cin>>n>>s;

    o="papa";
    int dp[5]={1,0,0,0,0};

    for(auto c: s){

        for(int i=3;i>=0;i--){
            if(o[i]==c)
                dp[i+1]+=dp[i];
        }
    }
    cout<<dp[4];
}
