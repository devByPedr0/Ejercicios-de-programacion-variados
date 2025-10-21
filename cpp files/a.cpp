#include <bits/stdc++.h>
using namespace std;

vector<int> rebars;

    bool cmp(int a, int b){
        return a>b;
    }


main() {
    int n,m;
    cin>>n>>m;

    int sum=0,ans=0,invsum=0;
    m*=100;

    for(int i=1;i<=n;i++){
        int c;
        double l;
        cin>>c>>l;

        for(int i=1;i<=c;i++) rebars.push_back(l*100);

    }

    int len=rebars.size();

    vector<bool> mk(len,0);

    sort(rebars.begin(),rebars.end(),cmp);

    for(int i=0;i<len-1;i++){

        if(mk[i]) continue;

        sum+=rebars[i];
        mk[i]=1;

       // cout<<sum<<" "<<rebars[i]<<endl;

        for(int j=len-1;j>i;j--){

            if(sum+rebars[j]<m && !mk[j]){
                mk[j]=1;
                sum+=rebars[j];
            }
            if(sum+rebars[j]>m){
                ans++;
                sum=0;
                //cout<<sum<<" "<<rebars[j]<<" "<<ans<<endl;
                break;
            }
        }

    }

    if(!mk[len-1]) ans++;

    cout<<ans;

}
