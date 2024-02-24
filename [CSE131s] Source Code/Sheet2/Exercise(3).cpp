#include <iostream>
using namespace std;

int main() {
	float num1, num2, num3;
	cout << "Please enter three numbers: ";
	cin >> num1 >> num2 >> num3;
	cout << "The largest number is: ";
	cout << max({ num1,num2,num3 }) << endl;
	return 0;
}
