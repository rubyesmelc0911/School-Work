//Paradigma Orientado a objetos, 30 lineas de codigo
#include <stdio.h>
#include <iostream>

using namespace std;

class Departamental{
    private:
        int a,b,c,res;
    public:
        void ingresarInformacion(){
            cout<<"Ingrese calificacion de primer departamental:"<<endl;
            cin>>a;
            cout<<"Ingrese calificacion de segundo departamental:"<<endl;
            cin>>b;
            cout<<"Ingrese calificacion de tercer departamental:"<<endl;
            cin>>c;
        }
        double calcularPromedio(){
            res = (a + b + c)/3;
            cout<<"El promedio es:"<<res<<endl;
            return res;
        }
};

int main(){
    Departamental ClaseObj;

    ClaseObj.ingresarInformacion();
    ClaseObj.calcularPromedio();
}