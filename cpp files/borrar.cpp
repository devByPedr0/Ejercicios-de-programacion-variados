#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n,x=0,y=0;

    int dir[4]={-1,1,1,-1};
    int i=2;

    cin>>n;

    while(n--){
        char op;
        int steps;

        cin>>op;

        if(op=='L') i=(i-2+4)%4+1;
            else if(op=='R') i=(i%4)+1;
                else if(op=='F'){

                    cin>>steps;

                    if(i==1 || i==3) x+=steps*dir[i-1];
                    else if(i==2 || i==4) y+=steps*dir[i-1];

                }

              //cout<<" "<<x<<" "<<y<<" "<<i<<endl;
    }

    if(x==0 && y==0){
        cout<<0;
        return 0;
    }

    if(x==0 && y>0){

        if(i==2) cout<<3;

        if(i==1 || i==3) cout<<2;

        if(i==4) cout<<1;
    }

    if(x==0 && y<0){

        if(i==4) cout<<3;

        if(i==1 || i==3) cout<<2;

        if(i==2) cout<<1;
    }

    if(y==0 && x>0){

        if(i==3) cout<<3;

        if(i==2 || i==4) cout<<2;

        if(i==1) cout<<1;
    }

    if(y==0 && x<0){

        if(i==1) cout<<3;

        if(i==2 || i==4) cout<<2;

        if(i==3) cout<<1;
    }

    if(x>0 && y>0){

        if(i==2 || i==3) cout<<4;

        if(i==1 || i==4) cout<<3;

    }

    if(x<0 && y>0){

        if(i==2 || i==1) cout<<4;

        if(i==3 || i==4) cout<<3;

    }

    if(x<0 && y<0){

        if(i==2 || i==3) cout<<3;

        if(i==1 || i==4) cout<<4;

    }

    if(x>0 && y<0){

        if(i==4 || i==3) cout<<4;

        if(i==1 || i==2) cout<<3;

    }
    //cout<<" "<<x<<" "<<y<<" "<<i;
}
