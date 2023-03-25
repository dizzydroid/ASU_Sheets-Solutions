#include <iostream>
#include <cmath>
using namespace std;

int main()
{
  double l, w;
  cout << "Please enter the rectangle's length\n";
  cin >> l; cout << "\n";
  cout << "Please enter the rectangle's width\n";
  cin >> w; cout << "\n";
  cout << "The rectangle's area = " << l * w << "\n";
  cout << "The rectangle's perimeter = " << 2*(l + w) << "\n";
  cout << "The length of the rectangle's diagonal = " << sqrt(pow(l, 2) + pow(w, 2)) << "\n";
  //The pythagorean theorem states that d^2=l^2+w^2 where "d" is the diagonal's length
  
  return 0;
}
