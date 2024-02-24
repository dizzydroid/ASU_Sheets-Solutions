#include <iostream>
#include <string>
using namespace std;

int main() {
	string grade;
	double grade_num;
	cout << "Enter numerical grade value: ";
	cin >> grade_num;
	switch (int(grade_num * 10)) {
	case 40:
		grade = "A+";
		break;
	case 37 ... 39:
		grade = "A";
		break;
	case 30 ... 36:
		grade = "A-";
		break;
	case 27 ... 29:
		grade = "B+";
		break;
	case 23 ... 26:
		grade = "B";
		break;
	case 20 ... 22:
		grade = "B-";
		break;
	case 17 ... 19:
		grade = "C+";
		break;
	case 13 ... 16:
		grade = "C";
		break;
	case 10 ... 12:
		grade = "C-";
		break;
	case 7 ... 9:
		grade = "D+";
		break;
	case 3 ... 6:
		grade = "D";
		break;
	case 1 ... 2:
		grade = "D-";
		break;
	case 0:
		grade = "F";
		break;
	default:
		cout << "Invalid grade value entered." << endl;
		return -1; // exit the program with an error code
	}
	cout << "Your grade is: " << grade << endl;
	return 0;
}
