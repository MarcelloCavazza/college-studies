#include <stdio.h>

void main(){
    int M, A, B, finalAge;
    askAndSetValue("Insert Monica's age: ", &M);

    if(M >= 40 && M <= 110){
        askAndSetValue("Insert Monica's son1 age: ", &A);
        
        if(A >= 1 && A < M){
            askAndSetValue("Insert Monica's son2 age: ", &B);
            
            if(B >= 1 && B < M && A != B){
                finalAge = M - (A + B);
                if(finalAge < A && A > B){
                    finalAge = A;
                }else if(finalAge < B && A < B){
                    finalAge = B;
                }
                printf("The older son has %d years old.", finalAge);
            }
        }

    }
}

void
askAndSetValue (char *label, int *variable)
{
  printf (label);
  scanf ("%d", variable);
}
