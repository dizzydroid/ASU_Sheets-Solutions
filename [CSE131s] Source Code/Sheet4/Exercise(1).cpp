#include <iostream>
#include <vector>

using namespace std;

int main() {
    vector<float> values(10);
    
    // Read 10 float values
    for (int i = 0; i < 10; i++) {
        cin >> values[i];
    }
    
    // Find the maximum value
    float maxValue = values[0];
    for (int i = 1; i < 10; i++) {
        if (values[i] > maxValue) {
            maxValue = values[i];
        }
    }

    // Find the minimum value
    float minValue = values[0];
    for (int i = 1; i < 10; i++) {
        if (values[i] < minValue) {
            minValue = values[i];
        }
    }
    
    // Calculate the average
    float sum = 0;
    for (int i = 0; i < 10; i++) {
        sum += values[i];
    }
    float average = sum / values.size();

    // Print the results
    cout << "Maximum: " << maxValue << endl;
    cout << "Minimum: " << minValue << endl;
    cout << "Average: " << average << endl;

    return 0;
}
