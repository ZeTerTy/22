#include <stdio.h>
#include <stdlib.h>

int main(int argc, char** argv) {
    if (argc != 3) {
        printf("Usage: %s X K\n", argv[0]);
        return 1;
    }
    
    double arr[10];
    double X = atof(argv[1]);
    int K = atoi(argv[2]);

    for (int i = 0; i < 10; i++) {
        scanf("%lf", &arr[i]);
    }

    for (int i = 9; i > K; i--) {
        arr[i] = arr[i - 1];
    }
    
    arr[K] = X;

    for (int i = 0; i < 10; i++) {
        printf("%.0f ", arr[i]);
    }
    
    return 0;
}
