#include <iostream>
#include <string>
#include <cmath>
using namespace std;

int main() {
    double x; // input value
    int n = 0; // count of values
    double sum = 0; // sum of values
    double sum_squared = 0; // sum of squares of values
    while (cin >> x) // read until end of file
    {
        n++; // increment count
        sum += x; // add value to sum
        sum_squared += x * x; // add square of value to sum_squared
    }
    double mean = sum / n; // compute mean
    double stdev = sqrt(sum_squared / n - mean * mean); // compute standard deviation
    cout << "Count: " << n << endl;
    cout << "Mean: " << mean << endl;
    cout << "Standard deviation: " << stdev << endl;
    return 0;
}
