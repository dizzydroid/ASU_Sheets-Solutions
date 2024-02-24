#include <iostream>
using namespace std;

// Function to swap the values of two integers
void true_swap(int &a, int &b)
{
    int temp = a;
    a = b;
    b = temp;
}

int main()
{
    int x = 3;
    int y = 4;
    true_swap(x, y);
    cout << x << " " << y << "\n"; // This should now output "4 3"
    return 0;
}
