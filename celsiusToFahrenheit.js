function convertCelsiusToFahrenheit(celsius) {

    if (celsius < -273.15) {
        return "Error: Temperature below absolute zero.";
    }

    let fahrenheit = (celsius * 9/5) + 32;

    return fahrenheit;
}

let result = convertCelsiusToFahrenheit(25);
console.log("Result:", result);
