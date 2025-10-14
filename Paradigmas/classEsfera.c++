//Paradigma Orientado a objetos, 29 lineas de codigo
#include <stdio.h>
#include <iostream>

using namespace std;
//no notas cambios aqui loco?
class Esfera{
    private:
        int radio,res;
    public:
        void ingresarInformacion(){
            cout<<"Ingrese radio de Esfera:"<<endl;
            cin>>radio;
          
        }
        double calcularVolumenEsfera(){
            res = (4/3)*(3.14);
            res = res * radio;
            cout<<"El volumen de la esfera es:"<<res<<endl;
            return res;
        }
};

int main(){
    Esfera ClaseObj;

    ClaseObj.ingresarInformacion();
    ClaseObj.calcularVolumenEsfera();
}