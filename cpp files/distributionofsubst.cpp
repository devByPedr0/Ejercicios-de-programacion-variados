#include <bits/stdc++.h>
using namespace std;

 vector<int> buildlps(string s){

    int n = s.size();
    vector<int> pi(n);

    for(int i=0;i<n-1;i++){

        for(int j=i+1;j<n;j++){

                if(s[i]==s[j] )
                    pi[j]=i+1;
        }
    }

    return pi;
 }

int main() {

    string s; cin>>s;

    int n = s.size();

    vector<int> pi = buildlps(s);

    for(int i=1;i<=n;i++){
            int ans=0;

        for(int j=0;j<=n-i;j++){


            for(int k=j;k<j+i;k++) if(pi[k]==0){ ans++; break;}

        }

            cout<<ans<<' ';

    }

    return 0;
}
