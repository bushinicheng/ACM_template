/*
 *����ͼ���ż��ߵ�˫��ͨ������Tarjan�㷨O(E)
 */
#include <cstdio>
#include <cstring>
using namespace std;
#define MAXN 10000
#define MAXM 1000000

struct node {
    int v, w, pre;
} edge[MAXM];
int pos[MAXN], nEdge; //ͼ�Ĵ洢����ʽǰ���ǣ����ӷ���

struct Bridge {
    int u, v;
} bridge[MAXM];  //������¼��
int tot; //�ŵĸ���

int fa[MAXN], cc; //fa�����������������㣨��ͨ�飩��cc��ͨ��ĸ���
int dfn[MAXN], low[MAXN], time; //ʱ���
int stack[MAXN], top;   //����ά����ͨ���
int n, m;   //��ĸ����ͱߵ�����

void connect(int u, int v, int w) {
    nEdge++;
    edge[nEdge].pre = pos[u];
    edge[nEdge].v = v;
    edge[nEdge].w = w;
    pos[u] = nEdge;
}

void tarjan(int cur, int from) {
    low[cur] = dfn[cur] = time++;
    stack[++top] = cur;
    for (int p=pos[cur]; p; p=edge[p].pre) {
        int v = edge[p].v;
        if (v == from) continue;  //ע��һ������
        if (!dfn[v]) {
            tarjan(v, cur);
            if (low[v] < low[cur]) low[cur] = low[v];
            if (low[v] > dfn[cur]) {
                bridge[tot].u = cur;
                bridge[tot++].v = v;
                cc++;
                do {
                    fa[stack[top]] = cc;
                } while (stack[top--] != v);
            }
        } else if (low[cur] > dfn[v]) low[cur] = dfn[v];
    }
}
int main() {
    scanf("%d%d", &n, &m);

    memset(pos, 0, sizeof(pos));
    nEdge = 0;
    int u, v, w;
    for (int i=0; i<m; i++) {
        scanf("%d%d%d", &u, &v, &w);
        connect(u, v, w);
        connect(v, u, w);
    }

    memset(dfn, 0, sizeof(dfn));
    memset(fa, -1, sizeof(fa));

    cc = tot = 0;
    for (int i=1; i<=n; i++)   //���Դ�����ͨ������ͼ�������ֻͨ��Ҫһ�μ���
        if (!dfn[i]) {
            top = time = 1;
            tarjan(i, -1);
            ++cc;
            for (int j=1; j<=n; j++)   //���⴦�������ͨ��
                if (dfn[j] && fa[j]==-1) fa[j] = cc;
        }

    for (int i=1; i<=n; i++)
        printf("%d ", fa[i]);  //���ÿ���ڵ������ڵ���ͨ�飨�����ţ�
    printf("\n");

    for (int i=0; i<tot; i++)
        printf("%d %d\n", bridge[i].u, bridge[i].v); //������е���

    return 0;
}
