//Paradigma Estructurado/Modular, 33 lineas de codigo
#include <iostream>
#include <stdio.h>

using namespace std;

//calcular el area de un pentagono
 int ingresarPerimetro(){
    int perimetro;
    cout<<"Ingresar valor de perimetro"<<endl;
    cin>>perimetro;
    return perimetro;
 }

 int ingresarApotema(){
    int apotema;
    cout<<"Ingresar valor de apotema"<<endl;
    cin>>apotema;
    return apotema;
 }

 double calcularArea(double perimetro, int apotema){
    double area;
    area = (perimetro * apotema) / 2;
    cout<<"Area del pentagono es:"<<area<<endl;
    return area;
 }

int main(){
   int p = ingresarPerimetro();
   int apot = ingresarApotema();
   calcularArea(p, apot);
}