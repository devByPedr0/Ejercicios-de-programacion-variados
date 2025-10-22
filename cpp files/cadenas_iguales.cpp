#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0); cin.tie();

    string a,b;

    cin>>a>>b;
    int n= a.size();
    int m= b.size();

    vector<int> pi(max(n,m),-1);

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){

            if(a[i]==b[j] && pi[i]==-1)
             pi[i]=j;
        }

    }

    int cont=0;
    vector<int> ans;

    for(int i=1;i<pi.size();i++){

        if(pi[i]<pi[i-1]){
            ans.push_back(cont);
            cont=0;
        }
        else
            cont++;
    }

    sort(ans.begin(),ans.end());

    for(auto i : pi) cout<<i<<" ";

    cout<<endl<<ans[ans.size()-1];
    return 0;
}
