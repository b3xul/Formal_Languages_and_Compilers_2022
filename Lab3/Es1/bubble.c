/* Esempio algoritmo di ordinamento Bubble sort */

int mat[2][3];
double x[5];
int i, j;
double swap;
int pos;

/* Inizializzazione vettore */
x[0] = -2.0;
x[1] = -3.0;
x[2] = 3.0;
x[3] = 5.0;
x[4] = 2.5; 
mat[0][0] = 4;

print x[0];

/* Bubble sort */
pos = 5;
while(pos > 0){
  i = 0;
  while (i < pos - 1){
    j = i + 1;
    if (x[i] > x[j]){
      swap = x[j];
      x[j] = x[i];
      x[i] = swap;
    }
    i = i + 1;
  }
  pos = pos-1;

 }

/* Stampa risultati */
i = 0;
x[2]=3*x[i]-x[3];
while(i<5){
  print x[i];
  i = i + 1;
 }


