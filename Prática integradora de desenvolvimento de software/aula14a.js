//Exercício de matriz
var matriz = [[],[]]
var linhas = 4;
var colunas = 5;

for(x = 0; x < linhas; x++){
    matriz[x] = [];
    for(y = 0; y < colunas; y++){
        var n1 = x + 2;
        var y2 = y + 1;
        matriz[x][y] = n1 * y2;
    }
}
for (x = 0; x < linhas; x ++){
    var k1 = matriz[x]
    console.log("Matriz linha " + matriz.indexOf(k1) + " n: " + matriz[x]);
}

console.log("Matriz toda: " + matriz)
//2 4 6 8 10
//3 6 9 12 15
//4 8 12 16 20
//5 10 15 20 25