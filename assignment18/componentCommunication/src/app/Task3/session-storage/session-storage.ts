import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-session-storage',
  imports: [ReactiveFormsModule],
  templateUrl: './session-storage.html',
  styleUrl: './session-storage.css'
})
export class SessionStorage implements OnInit {
userForm:FormGroup;
 userName: string | null = null;
constructor(private fb:FormBuilder){
  this.userForm=this.fb.group({
   userName:['',Validators.required],
   password:['',Validators.required]
  });
}
ngOnInit(): void {
    this.userName = sessionStorage.getItem('username');
  }
onSubmit(){
const formVal=this.userForm.value;
 sessionStorage.setItem('username', formVal.userName);
 sessionStorage.setItem('password', formVal.password);
 this.userName = formVal.userName;
 this.userForm.reset();
}
logOut(){
  sessionStorage.clear();
  this.userName = null;
  this.userForm.reset();
}
}
