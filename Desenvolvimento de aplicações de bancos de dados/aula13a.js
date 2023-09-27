function calculo(a,b,c,d,e,f){
    if(a + b/2 >20 && c/d + e/f <100){
        console.log("true");
    }
    else{
        console.log("false");
    }
}

function cal2(x1, x2, x3){
    var resultado = (x1 + x2 + x3 - 1) +x2;
    console.log("resultado do ex:" + resultado);
}

a1 = 16; 
b1 = 20;
c1 = 30;
d1 = 2;
e1 = 120;
f1 = 4;

c2 = 300;
d2 = 2;

c3 = 100;
d3 = 100;
e3 = 100;
f3 = 100;
calculo(a1, b1, c1, d1, e1, f1);
calculo(a1, b1, c2, d2, e1, f1);
calculo(a1, b1, c3, d3, e3, f3);

x1 = 2;
x2 = 3;
x3 = 6;
cal2(x1,x3,x3);