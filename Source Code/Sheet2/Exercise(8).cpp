#include <iostream>
#include <string>
using namespace std;

int main() {
	//REQUIRED CODE:
	int month;
	string monthname;
	int days_number;
	cin >> month;
	if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
		days_number = 31;
	}
	else if (month == 4 || month == 6 || month == 9 || month == 11) {
		days_number = 30;
	}
	else if (month == 2) {
		days_number = 28;
	}
	//BONUS:
	switch (month) {
		case 1: monthname = "January";  break;
		case 2: monthname = "February"; break;
		case 3:	monthname = "March";break;
		case 4: monthname = "April"; break;
		case 5: monthname = "May"; break;
		case 6: monthname = "June"; break;
		case 7: monthname = "July"; break;
		case 8: monthname = "August"; break;
		case 9: monthname = "September"; break;
		case 10: monthname = "October"; break;
		case 11: monthname = "November"; break;
		case 12: monthname = "December"; break;
	}
	cout << "The number of days in " << monthname << " is " << days_number << endl;
	return 0;
}
