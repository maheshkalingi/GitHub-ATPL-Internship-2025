const celsiusInput = document.getElementById("celsiusInput") as HTMLInputElement;
const convertBtn = document.getElementById("convertBtn") as HTMLButtonElement;
const fahrenheitResult = document.getElementById("fahrenheitResult") as HTMLSpanElement;
const kelvinResult = document.getElementById("kelvinResult") as HTMLSpanElement;

convertBtn.addEventListener("click",()=>{
    const celsius=parseFloat(celsiusInput.value);

    if(isNaN(celsius)){
        alert("enter a number");
    }
    const fahrenheit = (celsius * 9) / 5 + 32;
    const kelvin = celsius + 273.15;
    fahrenheitResult.textContent = fahrenheit.toFixed(2) + " F";
    kelvinResult.textContent = kelvin.toFixed(2) + " K";
});