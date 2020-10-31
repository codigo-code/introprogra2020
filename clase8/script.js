
// esto es una funcion
function verDatos() {

    let nombre = document.getElementById("nombre").value;
    let edad = document.getElementById("edad").value;


    if (edad < 18) {
        alert(nombre + ", no puede sacar el registro de conducir");
    } else {
        alert(nombre + " estas habilitado para conducir por que tenes " + edad);
    }
}


function calcular() {

    let nombre = document.getElementById("nombre").value;
    let peso = document.getElementById("peso").value;
    let altura = document.getElementById("altura").value;
    let foto = document.getElementById("foto");
    let info = document.getElementById("informacion");

    // genero la formula del IMC ( calculo )

    let res = peso / (altura * altura);


    if (res < 18.5) {
        info.innerHTML = nombre + ",  " + res + " estas bajo peso";
        foto.src = "assets/flaco.gif";

    } else if (res >= 18.5 && res < 24.9) {
        info.innerHTML = nombre + ",  " + res + " estas en tu peso ideal";
        foto.src = "assets/normal.jpg";
    } else {
        info.innerHTML = nombre + ",  " + res + " sos un lechon!";
        foto.src = "assets/gordo.jpg";
    }

}

