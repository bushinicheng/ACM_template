/*
 *hoj1520
 */

#include <cstdio>
#include <cstring>
#include <vector>
using namespace std;
#define MAXN 5005

vector<int> g[MAXN];
bool instack[MAXN];
int dfn[MAXN], low[MAXN];
int belong[MAXN], outd[MAXN]; //belong��ԭ�����������ĵ�ı��,outd����ĳ���
int n, m, scc_num;    //scc_numǿ��ͨ�����ĸ���
int Stack[MAXN], top, time;  //timeʱ���

void dfs(int u) {
    dfn[u] = low[u] = ++time;
    instack[u] = true;
    Stack[top++] = u;
    int v, len = g[u].size();
    for (int i=0; i<len; i++) {
        v = g[u][i];
        if (!dfn[v]) {
            dfs(v);
            low[u] = min(low[u], low[v]);
        } else if (instack[v])
            low[u] = min(low[u], dfn[v]);
    }
    if (low[u] == dfn[u]) {
        scc_num++;
        do {
            v = Stack[--top];
            instack[v] = false;
            belong[v] = scc_num;
        } while (v != u);
    }
}
void solve() {
    scc_num = top = time = 0;
    memset(dfn, 0, sizeof(dfn));
    memset(outd, 0, sizeof(outd));

    for (int i=1; i<=n; i++)
        if (!dfn[i])
            dfs(i);
    for (int i=1; i<=n; i++)
        for (unsigned int j=0; j<g[i].size(); j++) {
            if (belong[i] != belong[g[i][j]])
                outd[belong[i]]++;
        }
    bool flag = false;
    for(int i=1; i<=n; i++)
        if(!outd[belong[i]]) {
            if (flag) printf(" ");
            else flag = true;
            printf("%d", i);
        }
    printf("\n");
}
int main() {
    while (scanf("%d", &n) && n) {
        for (int i=1; i<=n; i++)
            g[i].clear();
        scanf("%d", &m);
        int x, y;
        for (int i=0; i<m; i++) {
            scanf("%d %d", &x, &y);
            g[x].push_back(y);
        }
        solve();
    }
    return 0;
}
