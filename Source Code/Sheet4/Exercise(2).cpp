#include <iostream>
#include <string>

using namespace std;

int main() {
    string names[5] = {"Ahmed", "Ali", "Doaa", "Mohamed", "Osama"};
    float grades[5] = {15, 17, 10, 12, 16};

    // a. Read a name from user and find and print his/her grade
    string inputName;
    cout << "Enter a student name: ";
    cin >> inputName;
    bool found = false;
    for (int i = 0; i < 5; i++) {
        if (names[i] == inputName) {
            cout << inputName << "'s grade: " << grades[i] << endl;
            found = true;
            break;
        }
    }
    if (!found) {
        cout << "Student not found." << endl;
    }

    // b. Print the name of the student with the highest grade
    int highestGradeIndex = 0;
    for (int i = 1; i < 5; i++) {
        if (grades[i] > grades[highestGradeIndex]) {
            highestGradeIndex = i;
        }
    }
    cout << "Student with the highest grade: " << names[highestGradeIndex] << " (Grade: " << grades[highestGradeIndex] << ")" << endl;

    return 0;
}
