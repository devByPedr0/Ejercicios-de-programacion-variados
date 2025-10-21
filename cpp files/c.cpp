#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, q;
    cin >> n >> q;

    vector<long long> a(n);
    for (int i = 0; i < n; ++i)
        cin >> a[i];

    int pos = 0;

    while (q--) {
        int type;
        cin >> type;

        if (type == 1) {
            int k;
            cin >> k;
            if (k > 0) {
                while (k--) {
                    a[pos + 1] ^= a[pos];
                    ++pos;
                }
            } else {
                while (k++) {
                    a[pos] ^= a[pos - 1];
                    --pos;
                }
            }
        } else if (type == 2) {
            int p;
            long long x;
            cin >> p >> x;
            a[p - 1] = x;
        } else if (type == 3) {
            int p;
            cin >> p;
            cout << a[p - 1] << '\n';
        }
    }

    return 0;
}
