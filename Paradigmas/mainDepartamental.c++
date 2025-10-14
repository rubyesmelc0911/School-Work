//Paradigma Imperativo, 18 lineas de codigo
#include <stdio.h>
#include <iostream>

using namespace std;

main(){
    double a,b,c, res;
    cout<<"Ingrese calificacion de primer parcial: "<<endl;
    cin>>a;
    cout<<"Ingrese calificacion de segundo parcial: "<<endl;
    cin>>b;
    cout<<"Ingrese calificacion de tercer parcial: "<<endl;
    cin>>c;

    res = (a + b + c) / 3;
    cout<<"El promedio es:"<<res<<endl;
    
}