import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
@Component({
  selector: 'app-local-storage',
  imports: [ReactiveFormsModule],
  templateUrl: './local-storage.html',
  styleUrl: './local-storage.css'
})
export class LocalStorage {
  theme!: string;
  userForm:FormGroup=new FormGroup({
    colorTheme:new FormControl('',[Validators.required])
  })

  constructor(){
    const storedTheme = localStorage.getItem('theme');
    this.userForm.value.colorTheme=storedTheme;


    
  }
  onSubmit(){
    const formVal=this.userForm.value;
  localStorage.setItem('theme',formVal.colorTheme);
  }
  clear(){
    localStorage.clear();
  }
}
