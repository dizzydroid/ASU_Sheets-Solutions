#include <iostream>
#include <cmath>
using namespace std;

// Function to compute the perimeter of a circle
double perimeter(float r) {
    const double PI = 3.14159265358979323846;
    return 2 * PI * r;
}

// Function to compute the area of a circle
double area(float r) {
    const double PI = 3.14159265358979323846;
    return PI * r * r;
}

int main() {
    float radius;

    cout << "Enter the radius of the circle: ";
    cin >> radius;

    cout << "Perimeter: " << perimeter(radius) << endl;
    cout << "Area: " << area(radius) << endl;

    return 0;
}
