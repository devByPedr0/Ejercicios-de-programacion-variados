#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int t; cin>>t;

    while(t--){

        string s1,s2; cin>>s1>>s2;

        int n = s1.size();
        int ans=0;

        for(int i=0;i<n;i++)
            if(s1[i]!=s2[i])
                ans++;

        cout<<ans<<'\n';
    }

    return 0;
}
