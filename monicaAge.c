#include <stdio.h>

void main(){
    int M, A, B, finalAge;

    printf("Insert Monica's age: ");
    scanf("%d", &M);

    if(M >= 40 && M <= 110){
        printf("Insert Monica's son1 age: ");
        scanf("%d", &A);
        
        if(A >= 1 && A < M){
            printf("Insert Monica's son2 age: ");
            scanf("%d", &B);
            
            if(B >= 1 && B < M && A != B){
                finalAge = M - (A + B);
                if(finalAge < A && finalAge > B){
                    finalAge = A;
                }else if(finalAge > A && finalAge < B){
                    finalAge = B;
                }
                printf("The older son has %d years old.", finalAge);
            }
        }

    }
}