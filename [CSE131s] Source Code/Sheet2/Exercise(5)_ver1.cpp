#include <iostream>
#include <string>
using namespace std;

int main() {
	string grade;
	double grade_num;
	cout << "Enter numerical grade value: ";
	cin >> grade_num;
	for (int i = 0; i < 1; i++) {
		if (grade_num == 4) {
			grade = "A+";
		}
		if (grade_num > 3.7) {
			grade = "A";
		}
		else if (grade_num <= 3.7 && grade_num > 3) {
			grade = "A-";
		}
		else if (grade_num <= 3 && grade_num > 2.7) {
			grade = "B+";
		}
		else if (grade_num <= 2.7 && grade_num > 2.3) {
			grade = "B";
		}
		else if (grade_num <= 2.3 && grade_num > 2) {
			grade = "B-";
		}
		else if (grade_num <= 2 && grade_num > 1.7) {
			grade = "C+";
		}
		else if (grade_num <= 1.7 && grade_num > 1.3) {
			grade = "C";
		}
		else if (grade_num <= 1.3 && grade_num > 1) {
			grade = "C-";
		}
		else if (grade_num <= 1 && grade_num > 0.7) {
			grade = "D+";
		}
		else if (grade_num <= 0.7 && grade_num > 0.3) {
			grade = "D";
		}
		else if (grade_num <= 0.3 && grade_num > 0) {
			grade = "D-";
		}
		else if (grade_num == 0) {
			grade = "F";
		}
		else {
			cout << "Invalid grade value entered." << endl;
			i--;
		}
	}
	cout << "Your grade is: " << grade << endl;
	return 0;
}
