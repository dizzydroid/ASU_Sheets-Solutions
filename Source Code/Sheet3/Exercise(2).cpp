#include <iostream>
using namespace std;

// Function to test whether a year is a leap year
bool leap_year(int year) {
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            return year % 400 == 0;
        } else {
            return true;
        }
    } else {
        return false;
    }
}

int main() {
    int year;

    cout << "Enter a year: ";
    cin >> year;

    if (leap_year(year)) {
        cout << year << " is a leap year." << endl;
    } else {
        cout << year << " is not a leap year." << endl;
    }

    return 0;
}
