import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-session-storage',
  imports: [ReactiveFormsModule],
  templateUrl: './session-storage.html',
  styleUrl: './session-storage.css'
})
export class SessionStorage {
userForm:FormGroup;

constructor(private fb:FormBuilder){
  this.userForm=this.fb.group({
   userName:['',Validators.required],
   password:['',Validators.required]
  })
}
onSubmit(){
const formVal=this.userForm.value;
sessionStorage.setItem(formVal.userName, formVal.password);
}
logOut(){
  sessionStorage.clear();
}
}
