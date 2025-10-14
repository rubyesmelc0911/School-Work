//Paradigma Modular/Estructuradom,32 lineas de codigo
#include <iostream>
#include <stdio.h>

using namespace std;

int ingresarPromedio(){
    double promIn, promSum; 
    cout<<"Ingrese el promedio del primer departamental:"<<endl;
    cin>>promIn;
    promSum = promSum + promIn;
    cout<<"Ingrese el promedio del segundo departamental:"<<endl;
    cin>>promIn;
    promSum = promSum + promIn;
    cout<<"Ingrese el promedio del tercer departamental:"<<endl;
    cin>>promIn;
    promSum = promSum + promIn;

    return promSum;
}
double calcularPromedio(double promedio){
    double promedioFinal;
    promedioFinal = promedio / 3;
    cout<<"El promedio es"<<promedioFinal<<endl;
    return promedioFinal;
};

int main(){
    double promedioInput;
    promedioInput = ingresarPromedio();
    calcularPromedio(promedioInput);
}