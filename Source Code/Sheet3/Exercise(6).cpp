#include <iostream>
#include <cmath>
using namespace std;

// Function to check if the given integer value is prime or not
int isPrime(int x) {
    if (x <= 1) {
        return 0;
    }

    for (int i = 2; i <= sqrt(x); i++) {
        if (x % i == 0) {
            return 0;
        }
    }
    return 1;
}

int main() {
    int number;

    cout << "Enter an integer: ";
    cin >> number;

    if (isPrime(number)) {
        cout << number << " is prime." << endl;
    } else {
        cout << number << " is not prime." << endl;
    }

    return 0;
}
