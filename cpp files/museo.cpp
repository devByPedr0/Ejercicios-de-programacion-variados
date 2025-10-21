#include <bits/stdc++.h>
using namespace std;

main(){
    int n,ans=0;

    cin>>n;

    vector<int> m(n);
    vector<int> aux(n);

    m[0]=0; aux[0]=0;

    for(int i=1;i<=n;i++){
        int a; cin>>a;
            cout<<a<<" "<<m[i-1]<<endl;
        if(a>=m[i-1]){
            ans+=a-aux[i-1];
            aux[i]=aux[i-1]+1;
            cout<<"1"<<endl;
        }
        else{
                cout<<"2"<<endl;
            for(int j=i;j>1;j--){
                if(a>=m[j]){
                    ans+=a-aux[j];
                    aux[i]=aux[j]+1;
                }
            }
        }

        m[i]=a;
    }


    cout<<ans-1<<'\n';
}
