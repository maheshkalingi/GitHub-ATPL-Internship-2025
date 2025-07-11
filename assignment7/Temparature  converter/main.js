var celsiusInput = document.getElementById("celsiusInput");
var convertBtn = document.getElementById("convertBtn");
var fahrenheitResult = document.getElementById("fahrenheitResult");
var kelvinResult = document.getElementById("kelvinResult");
convertBtn.addEventListener("click", function () {
    var celsius = parseFloat(celsiusInput.value);
    if (isNaN(celsius)) {
        alert("enter a number");
    }
    var fahrenheit = (celsius * 9) / 5 + 32;
    var kelvin = celsius + 273.15;
    fahrenheitResult.textContent = fahrenheit.toFixed(2) + " F";
    kelvinResult.textContent = kelvin.toFixed(2) + " K";
});
