#include <iostream>
using namespace std;

// A class to represent time
class Time {
  // Private data members
  private:
    int hours;
    int minutes;
    int seconds;

  // Public member functions
  public:
    // Default constructor to initialize data to 0
    Time() {
      hours = 0;
      minutes = 0;
      seconds = 0;
    }

    // Parameterized constructor to initialize data to fixed values
    Time(int h, int m, int s) {
      hours = h;
      minutes = m;
      seconds = s;
    }

    // A helper function to add a leading zero if the number is less than 10
    void addZero(int n) {
        if (n < 10) {
          cout << "0";
        }
    }

    // A function to display time in 11:59:59 format
    void display() {
      // Display the hours with a leading zero if needed
      addZero(hours);
      cout << hours << ":";

      // Display the minutes with a leading zero if needed
      addZero(minutes);
      cout << minutes << ":";

      // Display the seconds with a leading zero if needed
      addZero(seconds);
      cout << seconds << endl;
    }

    // A function to add two objects of type time and return the result in another object of type time
    Time add(Time t1, Time t2) {
      Time t3; // The result object
      int carry = 0; // To handle overflow of seconds and minutes

      // Add the seconds of t1 and t2 and store in t3
      t3.seconds = t1.seconds + t2.seconds;
      // If the sum is more than 59, set carry to 1 and reduce t3.seconds by 60
      if (t3.seconds > 59) {
        carry = 1;
        t3.seconds -= 60;
      }

      // Add the minutes of t1 and t2 along with carry and store in t3
      t3.minutes = t1.minutes + t2.minutes + carry;
      // Reset carry to 0
      carry = 0;
      // If the sum is more than 59, set carry to 1 and reduce t3.minutes by 60
      if (t3.minutes > 59) {
        carry = 1;
        t3.minutes -= 60;
      }

      // Add the hours of t1 and t2 along with carry and store in t3
      t3.hours = t1.hours + t2.hours + carry;
      // If the sum is more than 23, set t3.hours to 0 (assuming 24-hour format)
      if (t3.hours > 23) {
        t3.hours = 0;
      }

      // Return the result object
      return t3;
    }

};

int main() {
  // Create two initialized time objects
  Time t1(10, 15, 30);
  Time t2(1, 45, 50);

  // Create an uninitialized time object
  Time t3;

  // Add the two initialized objects and store the result in the third object
  t3 = t3.add(t1, t2);

  // Display the value of the third object
  cout << "The result is: ";
  t3.display();

  return 0;
}
