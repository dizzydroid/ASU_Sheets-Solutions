#include <iostream>
#include <string>

using namespace std;

class Person {
public:
    string name;
    int age;
    string gender;

    // Constructor
    Person(const string &name, int age, const string &gender)
        : name(name), age(age), gender(gender) {}

    // Member function to print the data
    void printData() {
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
        cout << "Gender: " << gender << endl;
    }
};

int main() {
    string name;
    int age;
    string gender;
    
    cout << "Enter name: ";
    getline(cin, name);
    cout << "Enter age: ";
    cin >> age;
    cin.ignore();  // remove newline from input buffer
    cout << "Enter gender: ";
    getline(cin, gender);

    Person person(name, age, gender);
    person.printData();

    return 0;
}
