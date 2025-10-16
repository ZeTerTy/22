#include <stdio.h>
#include <stdlib.h>

int main (int argc, char** argv) {
    double arr[10];

    for (int i = 0; i<10; i++) {
        scanf("%lf", &arr[i]);
    }

    double sum = 0;

    for (int i = 0; i < 10; i++){
        sum += arr[i];
    }

    printf("%.2f\n", sum / 10);
}