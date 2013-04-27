/*
    ŷ����·
    ���ж�����ͨ������wa��������ֻ�Ǹտ�ʼ��Ϊ������Ҳ��wa����Ϊ������������ˡ�
    ��ѵ������
*/
#include <cstdio>
#include <algorithm>
#include <cstring>
#include <vector>
using namespace std;
vector<int> g[10];
int a[103], b[103], n;
bool vis[103];
struct node {
    int u;
    char c;
    node(int _u, char _c): u(_u), c(_c) {}
};
vector<node> ans;

void Euler(int x) {
    for (size_t i=0; i<g[x].size(); i++) {
        int u = g[x][i];
        if (!vis[u]) {
            vis[u] = true;
            if (a[u] == x) {
                //ע��˳�򣬱����ȵݹ飬�ڱ�����
                Euler(b[u]);
                ans.push_back(node(u, '+'));
            } else {
                Euler(a[u]);
                ans.push_back(node(u, '-'));
            }
        }
    }
}
int main() {
    scanf("%d", &n);
    for (int i=1; i<=n; i++) {
        scanf("%d%d", &a[i], &b[i]);
        g[a[i]].push_back(i);
        g[b[i]].push_back(i);
    }
    int c = 0;
    for (int i=0; i<=6; i++) if (g[i].size() % 2 == 1) c++;

    if (c > 2) { printf("No solution\n"); return 0; }
    else if (c == 2) {
        for (c=0; c<=6; c++) if (g[c].size() % 2 == 1) break;
    } else {
        for (c=0; c<=6; c++) if (g[c].size() > 0) break;
    }

    memset(vis, false, sizeof(vis));
    Euler(c);
    if (ans.size() < n) {
        printf("No solution\n");
        return 0;
    }
    for (int i=ans.size()-1; i>=0; i--) printf("%d %c\n", ans[i].u, ans[i].c);

    return 0;
}
