#include <iostream>
#include <cmath>
using namespace std;

// A class to represent 2d circles
class Circle {
  // Private data members
  private:
    float x; // The x-coordinate of the center
    float y; // The y-coordinate of the center
    float radius; // The radius of the circle

  // Public member functions
  public:
    // Default constructor to initialize data to 0
    Circle() {
      x = 0;
      y = 0;
      radius = 0;
    }

    // Parameterized constructor to initialize data to a fixed value
    Circle(float r) {
      x = 0;
      y = 0;
      radius = r;
    }

    // Parameterized constructor to initialize data to fixed values
    Circle(float x1, float y1) {
      x = x1;
      y = y1;
      radius = 0;
    }

    // Parameterized constructor to initialize data to fixed values
    Circle(float x1, float y1, float r) {
      x = x1;
      y = y1;
      radius = r;
    }

    // A function to print the circle data in the form "circle at (x,y) radius is radius"
    void print() {
      cout << "circle at (" << x << "," << y << ") radius is " << radius << endl;
    }

    // A function to compute the distance between two circles
    float distance(Circle c1, Circle c2) {
      // Calculate the difference of x and y coordinates of the two circles
      float dx = c1.x - c2.x;
      float dy = c1.y - c2.y;

      // Calculate and return the distance using the formula: sqrt(dx^2 + dy^2)
      return sqrt(dx * dx + dy * dy);
    }
};

int main() {
  // Define two circles with values (1,2,1) and (3,5,4)
  Circle c1(1, 2, 1);
  Circle c2(3, 5, 4);

  // Print the data of the two circles
  cout << "The first circle is: ";
  c1.print();
  cout << "The second circle is: ";
  c2.print();

  // Find and print the distance between the two circles
  cout << "The distance between the two circles is: ";
  cout << c1.distance(c1, c2) << endl;

  return 0;
}
