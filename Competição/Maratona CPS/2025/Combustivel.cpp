#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

string reduz(double num, int casas=2){
  double fator = pow(10, casas);
  double truncado = floor(num*fator)/fator;
  stringstream ss;
  ss << fixed << setprecision(casas) << truncado;
  return ss.str();
}

int main(){
  while(true){
    int n =0, a=0, b=0;
    cin >> n;
    if(n == 0) break;

    int maior = 0, somakm=0, somaL=0;

    for(int i =0; i <n; i++){
      cin >> a >> b;
      double consumo = b / a;

      if (consumo > maior)
      {
        maior = consumo;
      }
      
      somakm += b;
      somaL += a;

    }
    double media = somakm / somaL;
    cout << "Media:" << media << endl;
    cout << "Melhor:" << maior << endl;
  }
}