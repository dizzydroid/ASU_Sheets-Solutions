#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double x, y;
    double m_x, m_x_squared, m_5x, m_sqrt_x;

    for (x = 0; x <= 10; x += 0.1) {
        // Calculate m(x)
        m_x = 7 * pow(x, 3) - 5 * pow(x, 2) + 2 * x + 11;

        // Calculate m(x^2)
        m_x_squared = 7 * pow(pow(x, 2), 3) - 5 * pow(pow(x, 2), 2) + 2 * pow(x, 2) + 11;

        // Calculate m(5x)
        m_5x = 7 * pow(5 * x, 3) - 5 * pow(5 * x, 2) + 2 * (5 * x) + 11;

        // Calculate m(sqrt(x))^0.2
        m_sqrt_x = 7 * pow(pow(sqrt(x), 0.2), 3) - 5 * pow(pow(sqrt(x), 0.2), 2) + 2 * pow(sqrt(x), 0.2) + 11;

        // Calculate y(x)
        y = (m_x_squared + m_5x) / m_sqrt_x;

        // Print the result
        cout << "y(" << x << ") = " << y << endl;
    }

    return 0;
}
