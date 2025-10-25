//Paradigma Imperativo, 16 lineas de codigo
#include <stdio.h>
#include <iostream>

using namespace std;

main(){
    double a,b,c, res;
    cout<<"Ingrese perimetro del pentagono: "<<endl;
    cin>>a;
    cout<<"Ingrese apotema del pentagono: "<<endl;
    cin>>b;

    res = (a * b) / 2;
    cout<<"El area del pentaono es:"<<res<<endl;
    
}