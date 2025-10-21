#include <bits/stdc++.h>
using namespace std;

struct DSU {
    vector<int> parent, sz;
    DSU(int n=0) { init(n); }
    void init(int n) {
        parent.resize(n+1);
        sz.assign(n+1,1);
        iota(parent.begin(), parent.end(), 0);
    }
    int find(int x) {
        return parent[x]==x ? x : find(parent[x]);
    }
    bool unite(int a,int b) {
        a=find(a); b=find(b);
        if(a==b) return false;
        if(sz[a]<sz[b]) swap(a,b);
        parent[b]=a;
        sz[a]+=sz[b];
        return true;
    }
    bool same(int a,int b) {
        return find(a)==find(b);
    }
};

int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int T; cin >> T;
    while(T--){
        int q; cin >> q;
        vector<DSU> versions;
        versions.emplace_back(DSU(1000)); // tamaño máximo de nodos esperado
        int cur = 0; // índice de versión actual

        for(int i=0;i<q;i++){
            string op; cin >> op;
            if(op=="DUP"){
                versions.push_back(versions[cur]);
                cur = (int)versions.size()-1;
            } else if(op=="DUPLINK"){
                // duplica y espera un LINK inmediatamente
                versions.push_back(versions[cur]);
                cur = (int)versions.size()-1;
                int u,v; cin >> u >> v;
                versions[cur].unite(u,v);
            } else if(op=="LINK"){
                int u,v; cin >> u >> v;
                versions[cur].unite(u,v);
            } else if(op=="ASK"){
                int u,v; cin >> u >> v;
                cout << (versions[cur].same(u,v) ? "YES\n" : "NO\n");
            }
        }
    }
}
