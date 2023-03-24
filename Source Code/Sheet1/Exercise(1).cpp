#include <iostream>
using namespace std;

int main(){
  int x,y;
  cout << "Please enter two integers \n";
  cin >> x >> y;
  cout << "The sum is " << x + y << "\n";
  cout << "The difference is " << x - y << "\n";
  cout << "The product is " << x * y << "\n";
  cout << "The average is " << float(x + y) / 2.0 << "\n";
  cout << "The distance is " << abs(x - y) << "\n";
  cout << "The maximum is " << max(x,y) << "\n";
  cout << "The minimum is " << min(x,y) << "\n";
  
  return 0;
}
