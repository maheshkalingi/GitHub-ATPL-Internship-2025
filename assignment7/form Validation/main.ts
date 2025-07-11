const form = document.getElementById("myform") as HTMLFormElement;
const nameInput = document.getElementById("userName") as HTMLInputElement;
const emailInput = document.getElementById("userEmail") as HTMLInputElement;

const nameError = document.getElementById("nameError") as HTMLSpanElement;
const emailError = document.getElementById("emailError") as HTMLSpanElement;

form.addEventListener("submit",(event)=>{
    event.preventDefault();

    let valid=true;
    nameError.textContent="";
    emailError.textContent="";
    if(nameInput.value.trim()===""){
        nameError.textContent="Name is required.";
        valid=false;
    }
     if(emailInput.value.trim()===""){
        emailError.textContent="Email is required.";
        valid=false;
    }
  if (valid) {
    console.log("Form submitted:");
    console.log("Name:", nameInput.value);
    console.log("Email:", emailInput.value);
    
  }
});
