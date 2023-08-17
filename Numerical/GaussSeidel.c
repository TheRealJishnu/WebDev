#include <stdio.h>

int main()
{
    printf("Enter Number of Equations and Variables : ");
    int n;
    scanf("%d", &n);
    double **a, *b;
    b = (double*)malloc(n * sizeof(double));
    a = (double*)malloc(n * sizeof(double));
    for (int i = 0; i < n; i++)
    {
        a[i] = (double*)malloc(n * sizeof(double));
    }
    printf("Enter The Coefficient Matrix : ");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            scanf("%lf", &a[i][j]);
        }
    }
    printf("Enter the Constant Matrix : ");
    for (int i = 0; i < n; i++)
    {
        scanf("%lf", &b[i]);
    }
    int m;
    printf("Enter Number of Iteration : ");
    scanf("%d", &m);



    //Input initial values of x
    printf("Enter initial values of x\n");
    double* x = (double*)malloc(n * sizeof(double));
    double* y = (double*)malloc(n * sizeof(double));
    for (int i = 0; i < n; i++)
    {

        printf("Enter values no. :( %d ):", i);
        scanf("%d",&x[i]);
    }
    //CALCULATION
    int i, j;
    while (m > 0)
    {
        for (i = 0; i < n; i++)

        {
            y[i] = (b[i] / a[i][i]);

            for (j = 0; j < n; j++)
            {
                if (j == i)

                    continue;

                y[i] = y[i] - ((a[i][j] / a[i][i]) * x[j]);

                x[i] = y[i];

            }

            printf("x%d = %f    ", (i + 1), y[i]);

        }
        printf("\n");
        m--;
    }
}
