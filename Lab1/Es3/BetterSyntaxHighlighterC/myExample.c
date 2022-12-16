#include <stdio.h>
#include "myList.h"

// commento monolinea

#define MAX(a, b) ((a) > (b) ? \
(a) : (b)) // support for multiline directives

int prova(int i) {
    float ident1f1er; // commento monolinea 2
    char* str="tu";
    char* str2="";
    if (i<=1){
        printf("Albero è:\t int-eramente Bello! %s",str); /* questo è un commento 
        su più righe */
        return 1;
    }
    /* questo è un commento       contenente una keyword float a e 3 simboli strani &, >, <*/


    /**/
    
    else return 0;
}