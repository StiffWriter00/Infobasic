// COIN FLIP FUNCTION
let heads = document.getElementsByClassName("heads")[0];
let tails = document.getElementsByClassName("tails")[0];

function coin_flip() {

    let math = Math.random(); 
    if (math > 0.5) {
        console.log("ciao")
        heads.classList.toggle("gray");
}
    else {
        tails.classList.toggle("gray");
}
};



/*
// TEST COIN FLIP
function test_coin_flip() {
    let heads = 0;
    let tails = 0;
    for (let i = 0; i < 1000000; i++) {
        let flip = coin_flip();
        if (flip == "Heads") {heads++;}
        else {tails++;}
    }
    console.log("Heads =", (100 * heads)/1000000 + "%");
    console.log("Tails =", (100 * tails)/1000000 + "%");
};

test_coin_flip();
*/