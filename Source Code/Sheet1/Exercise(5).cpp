#include <iostream>
using namespace std;
int main(){
  int n;
  cout << "Please enter an integer >= 1000: \n";
  cin >> n;
  cout << n / 1000 << "," << n % 1000;
  
  return 0;
}
