//Aula de arrays 2
//Aula de slice e concatenar
var pais = ['argentina', 'uruguai', 'brasil', 'equador'];
var nomes = ['lucas', 'geisa','ana']
var pais1 = pais.slice(1,3);
var conca = pais1.concat(nomes [1,2]);

console.log("Array sliceada: " + pais1);
console.log("Array concatenada: " + conca);

//Aula de filter
var numeros = [1,2,3,4,5,6,7,8,9,10];
var pares = numeros.filter(n1 => n1 % 2 == 0);
console.log("Array de pares: " + pares);

//Função inline
var impares = numeros.filter(
    function impar (valor){
        return valor % 2 != 0;
    }
)
console.log("Função inline de ímpares: " + impares);

//Função externa
function buscaimpar(valor){
    return valor % 2 != 0;
}
console.log("Função externa de ímpares: " + numeros.filter(buscaimpar));

//Função anônima
var anonima = numeros.filter((valor) => valor > 5);
console.log("Função anônima: " + anonima);

//Função com objeto
var lista = [
    {nome: "Lucas", idade: 31},
    {nome: "Ana", idade: 28},
    {nome: "Geisa", idade: 57}
]
var pessoa = lista.filter(
    function(valor){
        console.log("Nome da pessoa: "+ valor.nome);
    }
)

var pessoa5 = lista.filter(
    function(valor){
       return console.log(valor.nome.length >= 5);
    }
)

//aula de map
var num = numeros.map(
    function(valor){
        return valor * 2;
    }
)
console.log("Array x2: " + num);

var pessoamap = lista.map(lista => lista.nome);
console.log("Pessoas mapeadas: " + pessoamap);

//aula de reduce
var total = numeros.reduce(
    function(t1, numero){
        return t1 + numero;
    }
)
console.log("Soma do reduce: " + total);

//Aula de foreach
var a = [10, 20, 30, 40, 50];
var t2 = 0;
for (let valor of a){
    console.log("Array let: " + valor);
}
a.forEach(valor => console.log("Array foreach: "+ valor));
a.forEach(valor =>{
        t2 += valor;
    }
)
console.log("Total foreach: " + t2);

a.forEach(function(valor,indice,array){
        console.log("Array foreach2: "+ array[indice]);
    }
)