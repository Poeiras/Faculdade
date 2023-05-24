//Aula de classes
const pessoa ={
    nome: "Lucas",
    sobrenome: "Poeiras"
}
const chave = 'sobrenome';
console.log(pessoa[chave]);

//Objeto
var person = new Object();
person.nome = "Lucas";
person.sobrenome = "Barbosa";
person.falarnome = function(){
    console.log("Function Meu nome é: " + this.nome)
}
person.falarnome();

//Função para criar objeto
function criar_pessoa(nome, sobrenome){
    return {nome, sobrenome};
}
var lucas = criar_pessoa("Lucas", "Santos");
console.log(lucas);

//Criando classe
class Usuario{
    constructor(nome,sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    getFullName(){
        console.log("Nome e sobrenome dentro da classe: " + this.nome + " " + this.sobrenome);
    }
    falar(){
        console.log("Fala aí maluco: " + this.nome);
    }
}
var lucas1 = new Usuario("Lucas", "Poeiras");
lucas1.getFullName();
lucas1.falar();

//Herança

