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
    Person john("Shehab Mahmoud", 20, "Male");
    john.printData();
    return 0;
}
