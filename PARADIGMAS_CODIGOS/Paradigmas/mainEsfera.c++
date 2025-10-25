//Paradigma Imperativo, 15 lineas de codigo
#include <stdio.h>
#include <iostream>

using namespace std;

main(){
    double a, res;
    cout<<"Ingrese el radio de la esfera:"<<endl;
    cin>>a;
    
    res = (4/3)*(3.14);
    res = res * a;
    cout<<"El volumen de la esfera es:"<<res<<endl;
    
}