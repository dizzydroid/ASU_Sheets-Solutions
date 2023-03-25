#include <iostream>
#include <cmath>
using namespace std;
//function to convert a given decimal angle to radian:
  double convert(double degree) {
    double pi = 3.14159265359;
    return (degree * (pi / 180));
  }
int main(){
  double a, degree1, degree2{};
  cout << "Please enter the length of one of the traingle's sides\n";
  cin >> a;
  cout << "Please enter the two adjacent angles (in degrees) to this side\n";
  cin >> degree1 >> degree2; cout << "\n";
  double radian1, radian2, radian3;
  radian1 = convert(degree1); radian2 = convert(degree2); radian3 = 3.14159265359 - (radian1 + radian2);
  cout << "The lengths of the other two sides = " << (a * sin(radian1) / sin(radian3)) << " , " << (a * sin(radian2) / sin(radian3)) << "\n\n";
  cout << "The size of the third angle = " << radian3 * 57.2958 << " degrees" <<"\n";
  
  return 0;
}
