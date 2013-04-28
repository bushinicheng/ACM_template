// gcd:���Լ��
int gcd(int a, int b) {
	if (b == 0) return a;
	return gcd(b, a%b);
}

// extern_gcd ��չŷ������㷨����ax + by = gcd(a, b)��һ���x��y
//����ֵ��a��b�����Լ�����������Ҫ��gcd����Բ����ء�
int extern_gcd(int a, int b, int &x, int &y) {
	if (b == 0) { x = 1, y = 0; return a; }
	int r = extern_gcd(b, a%b, x, y);
	int t = x;
	x = y; y = t - a/b*y;
	return r;
}