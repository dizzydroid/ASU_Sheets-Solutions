#include <iostream>
#include <cmath>
using namespace std;

// Function to calculate m(x)
double m(double x) {
    return 7 * pow(x, 3) - 5 * pow(x, 2) + 2 * x + 11;
}

// Function to calculate y(x)
double y(double x) {
    double m_x_squared = m(pow(x, 2));
    double m_5x = m(5 * x);
    double m_sqrt_x = m(pow(sqrt(x), 0.2));
    return (m_x_squared + m_5x) / m_sqrt_x;
}

int main() {
    double x;

    for (x = 0; x <= 10; x += 0.1) {
        // Calculate and print the result
        cout << "y(" << x << ") = " << y(x) << endl;
    }

    return 0;
}
