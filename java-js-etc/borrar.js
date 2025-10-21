int a=675465

int suma =0

while(a>0){

    suma = a%10 + suma
    a/=10
}


console.log(suma);