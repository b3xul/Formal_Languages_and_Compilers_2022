/* Esempio algoritmo di ordinamento Bubble sort */


double x[5];
int i, j;
double swap;
int pos;

/* a = 1;
i = a;
i = a+b;
i = a+1;
print a;
print x[5];
print x[6];
x[5] = 5.0;
x[6] = 6.0;
x[0] = x[5];
x[0] = x[6]; */

swap=2+3.5;
pos=2+3.5;

pos=3.5;

pos=swap;

swap=pos;
swap=3;

/* Inizializzazione vettore */
x[0] = -2.0;
x[1] = -3.0;
x[2] = 3.0;
x[3] = 5.0;
x[4] = 2.5; 

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
while(i<5){
  print x[i];
  i = i + 1;
 }


