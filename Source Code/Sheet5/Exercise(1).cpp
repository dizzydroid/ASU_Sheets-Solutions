#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Country {
public:
    string name;
    long long population;
    double area; // in square kilometers

    Country(const string &name, long long population, double area)
        : name(name), population(population), area(area) {}

    double populationDensity() {
        return population / area;
    }
};

int main() {
    vector<Country> countries;
    for(int i=0; i<4; i++){
        string name;
        long long population;
        double area;

        cout << "Enter details for country " << i+1 << "\n";
        cout << "Name: ";
        cin.ignore(); // this will ignore the '\n' from previous input
        getline(cin, name); 
        cout << "Population: ";
        cin >> population;
        cout << "Area: ";
        cin >> area;
        
        countries.push_back(Country(name, population, area));
    }

    Country maxAreaCountry = countries[0];
    Country maxPopulationCountry = countries[0];
    Country maxDensityCountry = countries[0];

    for(int i=1; i<4; i++){
        if(countries[i].area > maxAreaCountry.area)
            maxAreaCountry = countries[i];

        if(countries[i].population > maxPopulationCountry.population)
            maxPopulationCountry = countries[i];

        if(countries[i].populationDensity() > maxDensityCountry.populationDensity())
            maxDensityCountry = countries[i];
    }

    cout << "Country with largest area: " << maxAreaCountry.name << "\n";
    cout << "Country with largest population: " << maxPopulationCountry.name << "\n";
    cout << "Country with largest population density: " << maxDensityCountry.name << "\n";

    return 0;
}
