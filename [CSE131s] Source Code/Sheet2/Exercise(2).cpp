#include <iostream>
#include <string>
using namespace std;

int main() {
	string input;
	cout << "Enter a card notation: ";
	cin >> input; 
		if (toupper(input[0]) == 'A') {
			cout << "Ace";
		}
		else if (toupper(input[0]) == 'J') {
			cout << "Jack";
		}
		else if (toupper(input[0]) == 'Q') {
			cout << "Queen";
		}
		else if (toupper(input[0]) == 'K') {
			cout << "King";
		}
		else if (input[0] == 1) {
			cout << "10";
		}
		else {
			cout <<input[0];
		}
	
		for (int i = 1; i < input.length(); i++) {
			if (toupper(input[i]) == 'H') {
				cout << " of Hearts";
			}
			else if (toupper(input[i]) == 'S') {
				cout << " of Spades";
			}
			else if (toupper(input[i]) == 'D') {
				cout << " of Diamonds";
			}
			else if (toupper(input[i]) == 'C') {
				cout << " of Clubs";
			}
			else {
				cout << input[i];
			}
		}
		return 0;
}
