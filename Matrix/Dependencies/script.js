// WELCOME MESSAGE
console.log("Welcome!");

// GENERATE MATRIX BUTTON FUNCTION
function generateMatrix() {
    
    // FETCH BASE & HEIGHT
    let x = document.getElementById("x").value;
    let y = document.getElementById("y").value;

    // FETCH IMAGES
    let neo = document.getElementById("neo");
    let dodge = document.getElementById("dodge");
    let has_you = document.getElementById("has_you");

    // CALCULATE & GENERATE MATRIX
    if(x <= 0 || y <= 0) {
        console.log("Zero or empty input is not valid.");
        neo.style.display = "block";
        dodge.style.display = "none";
        has_you.style.display = "none";
    } else {
        neo.style.display = "none";
        dodge.style.display = "block";
        has_you.style.display = "block";
        console.log("The dimension of the matrix is ---> " + (x*y) + "!");
    }

}

// RESET EVERYTHING BUTTON FUNCTION
function resetPage(){

    // RESET FORM
    document.getElementById('form').reset();

    // FETCH & RESET IMAGES
    let neo = document.getElementById("neo");
    let dodge = document.getElementById("dodge");
    let has_you = document.getElementById("has_you");
    neo.style.display = "block";
    dodge.style.display = "none";
    has_you.style.display = "none";

    // CLEAR CONSOLE
    console.clear();
    console.log("Welcome!");

}