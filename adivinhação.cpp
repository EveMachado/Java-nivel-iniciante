#include <bits/stdc++.h>
#include <cstdlib>
#include <ctime>

     using namespace std;


    int main() {


    unsigned seed = time(0);

    srand(seed);
    int numeroAleatorio = 1+rand()%100;
    int palpite;

      do{
        cout<<"digite um número(1-100): ";
        cin>>palpite;

        if(palpite>numeroAleatorio){
            cout<<"o número é menor"<<endl;
        }
        else if(palpite<numeroAleatorio){
            cout<<"o número é maior"<<endl;
        }

        }
        while(palpite!=numeroAleatorio);
        cout<<"Parabêns, você venceu"<<endl;


    return 0;
}


