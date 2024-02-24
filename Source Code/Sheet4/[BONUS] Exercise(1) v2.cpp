#include <iostream>
#include <vector>
#include <algorithm>
#include <numeric>

using namespace std;

int main() {
    vector<float> values(10);
    
    // Read 10 float values
    for (int i = 0; i < 10; i++) {
        cin >> values[i];
    }
    
    // Find the maximum value
    float maxValue = *max_element(values.begin(), values.end());

    // Find the minimum value
    float minValue = *min_element(values.begin(), values.end());
    
    // Calculate the average
    float sum = accumulate(values.begin(), values.end(), 0.0);
    float average = sum / values.size();

    // Print the results
    cout << "Maximum: " << maxValue << endl;
    cout << "Minimum: " << minValue << endl;
    cout << "Average: " << average << endl;

    return 0;
}
