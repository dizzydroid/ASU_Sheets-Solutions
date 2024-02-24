#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    // Declare variables
    double a, b, c;
    double discriminant, root1, root2;

    // Read in coefficients
    cout << "Enter coefficients a, b and c: ";
    cin >> a >> b >> c;

    // Calculate discriminant
    discriminant = b * b - 4 * a * c;

    // Check if discriminant is negative
    if (discriminant < 0)
    {
        // Display message
        cout << "There are no solutions." << endl;
    }
    else
    {
        // Calculate roots using quadratic formula
        root1 = (-b + sqrt(discriminant)) / (2 * a);
        root2 = (-b - sqrt(discriminant)) / (2 * a);

        // Display roots
        cout << "The solutions are " << root1 << " and " << root2 << endl;
    }

    return 0;
}

