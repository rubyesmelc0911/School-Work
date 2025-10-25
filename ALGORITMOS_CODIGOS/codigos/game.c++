#include <iostream>
#include <stdio.h>

using namespace std;

int main(){
    int secretNum, trying, numberTried, out = 0;

    //initialize a seed so the number changes
    srand(time(NULL));
    secretNum = rand() % 100 + 1;

    cout<<">>>>>>>GAME: GUESS THE NUMBER!<<<<<<,"<<endl;
    cout<<"I'm thinking about a number between 1 and 100, Take your guess!"<<endl;

    do{
        cout<<"What's the number?"<<endl;
        cin>>trying;
        numberTried++;

        if(trying > secretNum){
            cout<<"lemme give you a hint!..."<<endl;
            cout<<"try a number smaller than that!"<<endl;
        }else if(trying < secretNum){
            cout<<"What about trying a bigger number"<<endl;
        }else{
            cout<<"WOOW, you read my mind!"<<endl;
            cout<<"Well done!, you did it in "<<numberTried<<" chances"<<endl;
            out = 1;
        }

    }while(out!=1);
}