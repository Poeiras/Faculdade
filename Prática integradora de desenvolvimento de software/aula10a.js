var numeral = 30;
const vetor1 = [20,30,40,50,10];
var raiz1 = 144;
b1 = 2;
e1 = 3;

function cosseno(numero){
    var r1 = Math.cos(numero);
    console.log('Resultado do cosseno: ' + r1.toPrecision(3));
    }

function maximo(vetor){
    var max1 = Math.max(...vetor);
    console.log('Máximo do vetor: ' + max1);
    }

function minimo(vetor) {
    console.log('Mínimo do vetor: ' + Math.min(...vetor));
    }

function raiz(numero){
    var rz1 = Math.sqrt(numero);
    console.log('Raiz quadrada: ' + rz1);
}

function potencia(base, expoente){
    var pot1 = Math.pow(base, expoente);
    console.log('Resultado da potência ' + pot1);
}

cosseno(numeral);
maximo(vetor1);
minimo(vetor1);
raiz(raiz1);
potencia(b1, e1);