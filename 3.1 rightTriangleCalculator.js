function rightTriangle(a, b){

    if(a <= 0 || b <= 0){
        return "Invalid triangle sides";
    }

    let c = Math.sqrt(a*a + b*b);

    return c;
}

console.log("Hypotenuse:", rightTriangle(3,4));
