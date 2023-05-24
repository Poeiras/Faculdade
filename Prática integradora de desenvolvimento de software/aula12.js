vetor = [11,22,33,44,55];
var x1 = 0;
for (var i = 0; i < vetor.length; i++){
    console.log("valor de i: "+ i);
}

for (var valor of vetor){
    console.log("valor: "+ valor);
}

while (x1 < 10) {
    x1++;
    console.log("iterador while:  " + x1);
}

do {
    x1++;
    console.log("iterador dowhile:  " + x1);
}
while (x1 < 10);

var a1 = 0;
var b1 = 0;

iteradormonstrao:
while (a1 < 10){
    a1++;
    console.log("valor de a:" + a1);
    console.log("valor de B:" + b1);
        while(b1 < 100){
            b1++;
            if (b1 % 10 == 0){
            continue iteradormonstrao;
            }
        }
}