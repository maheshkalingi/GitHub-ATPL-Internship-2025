var form = document.getElementById("myform");
var nameInput = document.getElementById("userName");
var emailInput = document.getElementById("userEmail");
var nameError = document.getElementById("nameError");
var emailError = document.getElementById("emailError");
form.addEventListener("submit", function (event) {
    event.preventDefault();
    var valid = true;
    nameError.textContent = "";
    emailError.textContent = "";
    if (nameInput.value.trim() === "") {
        nameError.textContent = "Name is required.";
        valid = false;
    }
    if (emailInput.value.trim() === "") {
        emailError.textContent = "Email is required.";
        valid = false;
    }
    if (valid) {
        console.log("Form submitted:");
        console.log("Name:", nameInput.value);
        console.log("Email:", emailInput.value);
    }
});
