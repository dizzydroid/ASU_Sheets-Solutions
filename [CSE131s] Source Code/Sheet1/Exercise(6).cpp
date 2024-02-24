#include <iostream>
#include <ctime>
using namespace std;

int main(){
  int hour, minute;
  int due_hour, due_minute;
  int current_time, due_time;
  int diff_time;
  
  //ask for due date of the next assignment
  cout << "What is the due date of the next assignment?\n";
  cout << "Hour of due date: ";
  cin >> due_hour;
  cout << "Minute of due date: ";
  cin >> due_minute; cout << "\n";
  
  //convert due date to minutes
  due_time = due_hour * 60 + due_minute;
  
  //get current time from system
  time_t now = time(0);
  tm* ltm = localtime(&now);
  hour = ltm->tm_hour;
  minute = ltm->tm_min;
  
  //convert current time to minutes
  current_time = hour * 60 + minute;
  
  //calculate difference between current time and due time
  diff_time = due_time - current_time;
  
  //print result
  cout << "The number of minutes between the current time and the due date is " << diff_time << "\n";
  
  return 0;
}
//BE CAREFUL COMPILING THIS CODE ON YOUR MACHINE, THE FUNCTION localtime IS UNSAFE, IT IS PREFERABLE TO USE AN ONLINE COMPILER OR A VIRTUAL MACHINE.
