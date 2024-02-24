#include <iostream>

using namespace std;

class TollBooth {
private:
    int totalCars;
    double totalCash;

public:
    // Constructor initializes both totalCars and totalCash to 0
    TollBooth() : totalCars(0), totalCash(0) {}

    // payingCar() increments the car total and adds 5 to the cash total
    void payingCar() {
        totalCars++;
        totalCash += 5;
    }

    // nopayCar() increments the car total but adds nothing to the cash total
    void nopayCar() {
        totalCars++;
    }

    // display() displays the two totals
    void display() {
        cout << "Total cars: " << totalCars << endl;
        cout << "Total cash: " << totalCash << " L.E" << endl;
    }
};

int main() {
    TollBooth booth;
    booth.payingCar();
    booth.nopayCar();
    booth.payingCar();
    booth.display();
    return 0;
}
