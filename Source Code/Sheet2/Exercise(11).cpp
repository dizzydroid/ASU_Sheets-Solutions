#include <iostream>
using namespace std;

int main() {
	cout << "Enter a number: ";
	int n;
	cin >> n;
	for (int prime = 2; prime <= n; prime++) {
		int count = 0;
		for (int j = 2; j < prime; j++) {
			if (prime % j == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			cout << prime << " ";
		}

	} cout << "are the prime numbers up to " << n << endl;
	return 0;
}
