// WELCOME MESSAGE
console.log("Welcome!")

function generate_matrix() {
    let x = document.getElementById("x").value;
    let y = document.getElementById("y").value;
    if(x && y) {console.log("The dimension of the matrix is ---> " + (x*y));}
    else {console.log("Mavafangul");}
}