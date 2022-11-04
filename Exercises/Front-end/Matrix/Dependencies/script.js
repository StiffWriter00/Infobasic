// WELCOME MESSAGE
console.log("Welcome!");

// GENERATE MATRIX BUTTON FUNCTION
function generateMatrix() {
    
    // FETCH BASE & HEIGHT
    let w = document.getElementById("x").value;
    let h = document.getElementById("y").value;

    // FETCH IMAGES
    let neo = document.getElementById("neo");
    let dodge = document.getElementById("dodge");
    let has_you = document.getElementById("has_you");

    // FETCH GRID
    let grid_container = document.getElementById("grid_container")
    let canvas = document.getElementById("grid");

    // CALCULATE && GENERATE MATRIX
    if(w <= 0 || h <= 0) { // INVALID INPUT CASE

        // CONSOLE MESSAGE
        console.log("Zero or empty input is not valid.");

        // DOM MANIPULATION
        neo.style.display = "block";
        dodge.style.display = "none";
        has_you.style.display = "none";

    } else { // VALID INPUT CASE

        // CONSOLE MESSAGE
        console.log("The dimension of the matrix is ---> " + (w*h) + "!");
        w = w *20;
        h = h* 20;

        // DOM MANIPULATION
        neo.style.display = "none";
        dodge.style.display = "block";
        has_you.style.display = "block";
        grid_container.style.display = "block";
        
        // GENERATE MATRIX
        grid_container.style.width = (w+23)+"px";
        grid_container.style.height = grid_container.style.height + 2;
        var ctx = canvas.getContext('2d');
        ctx.canvas.width = w;
        ctx.canvas.height = h;
        for (x = 0; x <= w ; x += 20) {
            for (y = 0; y <= h; y += 20) {
                ctx.moveTo(x, 0);
                ctx.lineTo(x, h);
                ctx.stroke();
                ctx.moveTo(0, y);
                ctx.lineTo(w, y);
                ctx.stroke();
            }
        }

    }

    };

// RESET EVERYTHING BUTTON FUNCTION
function resetPage(){

    // RESET FORM
    document.getElementById('form').reset();

    // FETCH & RESET IMAGES
    let neo = document.getElementById("neo");
    let dodge = document.getElementById("dodge");
    let has_you = document.getElementById("has_you");
    let grid_container = document.getElementById("grid_container")
    neo.style.display = "block";
    dodge.style.display = "none";
    has_you.style.display = "none";
    grid_container.style.display = "none";

    // CLEAR CONSOLE
    console.clear();
    console.log("Welcome!");

}