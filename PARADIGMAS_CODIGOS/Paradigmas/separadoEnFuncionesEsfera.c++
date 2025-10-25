//Paradigma Estructurado/Modular, 28 lineas de codigo
#include <iostream>
#include <stdio.h>
#include <math.h>

using namespace std;

int ingresarRadio(){
    double radio; 
    cout<<"Ingrese el promedio del primer departamental:"<<endl;
    cin>>radio;
    return radio;
}
double calcularVolumenEsfera(double radio){
    double volumen;
    volumen = (4/3)*(3.14);
    volumen = volumen * pow(radio,3);

    cout<<"El volumen de la esfera es"<<volumen<<endl;
    return volumen;
    
};

int main(){
    double radio;
    radio = ingresarRadio();
    calcularVolumenEsfera(radio);
}