#include <iostream>
#include <string>
using namespace std;

int main() {
	string grade;
	float grade_num;
	cout << "Enter a letter grade: ";
	cin >> grade;
	if (toupper (grade[0]) == 'A') {
		grade_num = 4;
	}
	else if (toupper(grade[0]) == 'B') {
		grade_num = 3;
	}
	else if (toupper(grade[0]) == 'C') {
		grade_num = 2;
	}
	else if (toupper(grade[0]) == 'D') {
		grade_num = 1;
	}
	else if (toupper(grade[0]) == 'F') {
		grade_num = 0;
	}
	if (grade[1] == '+') {
		if (toupper(grade[0]) == 'A') {
			grade_num = 4;
		}
		else {
			grade_num += 0.3;
		}
	}
	if (grade[1] == '-') {
		grade_num -= 0.3;
	}
	cout << "The numeric value is: " << grade_num << endl;

	return 0;
}
