function areaFinder(shape, a, b){

    if(shape === "circle"){
        if(a <= 0) return "Invalid radius";
        return Math.PI * a * a;
    }

    else if(shape === "triangle"){
        if(a <= 0 || b <= 0) return "Invalid base or height";
        return 0.5 * a * b;
    }

    else if(shape === "rectangle"){
        if(a <= 0 || b <= 0) return "Invalid dimensions";
        return a * b;
    }

    else if(shape === "square"){
        if(a <= 0) return "Invalid side";
        return a * a;
    }

    else{
        return "Unknown shape";
    }
}

console.log(areaFinder("circle",5));
