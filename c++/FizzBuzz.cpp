#include <iostream>
using namespace std;

int main(){
  for(int i= 0 ; i < 100 ; i++){
    if(i%3 == 0){
      if(i%5 == 0){
	cout << "FizzBuzz\n";
      }else{
	cout << "Fizz\n";
      }
    }else if(i%5 == 0){
      cout << "Buzz\n";
    }else{
      cout << i << "\n";
    }
  }
}
