#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
	cin.tie();

    string s;
    cin>>s;
    int n = s.size();

    for (int len=1;len<=n;len++) {

        set<string>substrings;

        for (int i=0; i<=n-len; i++) {

            substrings.insert(s.substr(i,len));
        }
        cout<<substrings.size()<<' ';
    }

    return 0;
}
