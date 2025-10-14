//Pardigma Orientado a objetos, 30 lineas de codigo
#include <stdio.h>
#include <iostream>

using namespace std;

class Pentagono{
    private:
        int a,b,res;
    public:
        void ingresarInformacion(){
            cout<<"Ingrese perimetro del Pentagono:"<<endl;
            cin>>a;
            cout<<"Ingrese apotema del Pentagono:"<<endl;
            cin>>b;
    
        }
        double calcularArea(){
            res = (a * b )/2;
            cout<<"El area es:"<<res<<endl;
            return res;
        }
};

int main(){
    Pentagono ClaseObj;

    ClaseObj.ingresarInformacion();
    ClaseObj.calcularArea();
}