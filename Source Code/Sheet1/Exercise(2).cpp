#include <iostream>
#include <cmath>
using namespace std;
int main() {
  double pi = 3.14159265358979323846;
  double r;
  cout << "Please enter the radius\n";
  cin >> r; cout << "\n";
  cout << "The area of the circle = " << pi * r * r << "\n";
  cout << "The circumference of the circle = " << 2 * pi * r << "\n";
  cout << "The volume of the sphere = " << (1.333333) * pi * pow(r, 3) << "\n";
  cout << "The surface area of the sphere = " << (4) * pi * pow(r, 2) << "\n";
  
  return 0;
}
