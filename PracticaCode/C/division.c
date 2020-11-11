#include <studio.h>
#include <studlib.h>
int main(){
	int numero1;
	int numero2;
	
	printf("Introduzca un número: ");
	scanf("%d", &numero1);
	printf("Introduzca un número: ");
	scanf("%d", &numero2);
	
	printf("A division de %d/%d=%d", numero1, numero2,(numero1/numero2));
	return 0;
	
}