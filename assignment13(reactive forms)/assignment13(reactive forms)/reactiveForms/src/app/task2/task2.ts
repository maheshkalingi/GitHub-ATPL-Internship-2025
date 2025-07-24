import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-task2',
  imports: [ReactiveFormsModule],
  templateUrl: './task2.html',
  styleUrl: './task2.css'
})
export class Task2 {
userForm:FormGroup= new FormGroup({
  userName: new FormControl('',[Validators.required]),
  userEmail: new FormControl('',[Validators.required,Validators.pattern("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$")]),
  userPassword: new FormControl('',[Validators.required,Validators.minLength(6)])

})
onSave(){
  const formVal=this.userForm.value;
  console.log(formVal);
}
}
