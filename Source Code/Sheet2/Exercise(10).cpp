#include <iostream>
using namespace std;

int main() {
	cout << "This program computes the Fibonacci sequence." << endl;
	int n;
	cout << "Enter the number of terms: ";
	cin >> n;
	if (n == 0 || n == 1) {
		cout << "F(" << n << ") = " << n << endl;
		return 0;
	}
	int f0 =0, f1 = 1, f2;
	for (int i = 2; i <= n; i++) {
		f2 = f0 + f1;
		f0 = f1;
		f1 = f2;
	}
	cout << "F(" << n << ") = " << f2 << endl;
	return 0;
}
