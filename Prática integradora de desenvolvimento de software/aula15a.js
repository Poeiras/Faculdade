class Dispositivo{
    constructor(nome){
        this.nome = nome;
        this.ligado = false;
    }

    ligar(){
        if(this.ligado){
            console.log("Já está está ligado porra")
            return
        }
        this.ligado = true;
        console.log("Acabou de ligar")
    }
}

class Telefone extends Dispositivo{
    constructor(nome, cor, modelo){
        super(nome);        
        this.cor = cor;
        this.modelo = modelo;
    }
}

var motorola = new Telefone("Motorola", "Azul", "G8 power");
console.log(motorola);
motorola.ligar();
motorola.ligar()
console.log(motorola);