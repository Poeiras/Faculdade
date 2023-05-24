//Aula de arrays
var valores = [8,1,7,2,9];
var arrpositiva = [-1,2,-3,4,-5];
var retirado = valores.shift(2, 4);
var carros =[];
carros[0] = "volvo";
carros[1] = "gol";
carros[2] = "jeep";

var motos = new Array('suzuki', 'yamaha');
var soma = 0;

for (var pos = 0; pos < valores.length; pos++) {
    console.log("Posição: " + pos + " |N°: " + valores[pos]);
}
for (var pos = 0; pos < carros.length; pos++) {
    console.log("Posição: " + pos + " |Carro: " + carros[pos]);
}
for (var pos = 0; pos < motos.length; pos++) {
    console.log("Posição: " + pos + " |Moto: " + motos[pos]);
}

// Calcular a média da array de números
for (var pos = 0; pos < valores.length; pos++) {
    soma += valores[pos];
    media = soma/valores.length;
}

// Retorno dos métodos
console.log("Valor da média: " + media);
console.log("Array invertida: " + valores.reverse());
console.log("Array joinada: " + valores.join("|"));
console.log("Número shifitado da array: " + retirado);
console.log("Array shifitada: " + valores);

//Push e pop
valores.push(10);
console.log("Array pushada: " + valores);
valores.pop();
console.log("Array popada: " + valores);

//Teste de números positivos/negativos
for(var pos = 0; pos < arrpositiva.length; pos++ ){
    if(arrpositiva[pos] > 0){
        console.log("Número positivo:  " + arrpositiva[pos] + " |Posição: " + pos);
    }
    else{
        console.log("Número negativo: " + arrpositiva[pos] + " |Posição: " + pos);
    }
}

//Método de splice
var spliceado = arrpositiva.splice(1, 3);
console.log("Itens spliciados: " + spliceado);
console.log("Array após splice: " + arrpositiva);