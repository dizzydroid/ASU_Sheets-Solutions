#include <iostream>

using namespace std;

int main() {
    const int maxNumbers = 100;
    int numbers[maxNumbers];
    int input, count = 0;

    // The do-while loop ensures the user enters at least 3 positive numbers, so it keeps prompting the user to enter numbers until the user enters at least 3 positive numbers before the negative sign
    do {
        count = 0;
        cout << "Enter positive integers (enter a negative number to stop):" << endl;

        // Read positive integers until the user enters a negative value or reaches the maximum limit
        while (count < maxNumbers) {
            cin >> input;
            if (input < 0) {
                break;
            }
            numbers[count++] = input;
        }

        if (count < 3) {
            cout << "You must enter at least 3 positive numbers." << endl;
        }
    } while (count < 3);

    // Find and print the three largest integers
    int first = 0;
    int second = 0;
    int third = 0;

    for (int i = 0; i < count; i++) {
        int number = numbers[i];
        if (number > first) {
            third = second;
            second = first;
            first = number;
        }
        else if (number > second) {
            third = second;
            second = number;
        }
        else if (number > third) {
            third = number;
        }
    }

    cout << "The three largest integers are: " << first << ", " << second << ", and " << third << "." << endl;

    return 0;
}
