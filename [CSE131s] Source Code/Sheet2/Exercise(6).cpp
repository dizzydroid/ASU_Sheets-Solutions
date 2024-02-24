#include <iostream>
#include <string>
using namespace std;

int main() {
	string s1, s2, s3;
	cout << "Enter 3 strings: ";
	cin >> s1 >> s2 >> s3;
	cout << "The strings in lexicographical order: ";
	if (s1 < s2 && s1 < s3) {
		cout << s1 << " ";
		if (s2 < s3) {
			cout << s2 << " " << s3 << endl;
		}
		else {
			cout << s3 << " " << s2 << endl;
		}
	}
	else if (s2 < s1 && s2 < s3) {
		cout << s2 << " ";
		if (s1 < s3) {
			cout << s1 << " " << s3 << endl;
		}
		else {
			cout << s3 << " " << s1 << endl;
		}
	}
	else {
		cout << s3 << " ";
		if (s1 < s2) {
			cout << s1 << " " << s2 << endl;
		}
		else {
			cout << s2 << " " << s1 << endl;
		}
	}
	
}
