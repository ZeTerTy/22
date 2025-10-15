#include <stdio.h>
#include <stdlib.h>
int main (int argc, char** argv) {
    double arr[10];

    for (int i = 0; i < 10; i++) {
        scanf("%lf", &arr[i]);
    }

    int k;
    scanf("%d", &k);


    if (k < 0) {
        for (int i = 0; i < 10; i++) {
            printf("%.2f ",arr[(i + k * (-1)) % 10]);
        }
    }


    if (k > 0) {
        for (int i = 0; i < 10; i++) {
            printf("%.2f ", arr[(i - k + 10) % 10]);
        }
    }
}
