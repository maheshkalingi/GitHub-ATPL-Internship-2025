import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
@Component({
  selector: 'app-local-storage',
  imports: [ReactiveFormsModule],
  templateUrl: './local-storage.html',
  styleUrl: './local-storage.css'
})
export class LocalStorage implements OnInit {
  theme!: string;
  userForm:FormGroup=new FormGroup({
    colorTheme:new FormControl('',[Validators.required])
  })

  constructor(){}
ngOnInit(): void {
  const storedTheme = localStorage.getItem('theme');
    if (storedTheme) {
      this.userForm.patchValue({ colorTheme: storedTheme });
      this.applyTheme(storedTheme);
    } 
} 
  applyTheme(theme: string) {
    document.body.className = '';
    document.body.classList.add(theme.toLowerCase());
  }
  onSubmit(){
    const formVal=this.userForm.value;
  localStorage.setItem('theme',formVal.colorTheme);
  }
  clear(){
    localStorage.clear();
  }
}
