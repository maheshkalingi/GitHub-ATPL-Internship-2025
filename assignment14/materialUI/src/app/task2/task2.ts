import { Component } from '@angular/core';
import {FormControl,FormGroup, ReactiveFormsModule, Validators} from '@angular/forms';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
@Component({
  selector: 'app-task2',
  imports: [ReactiveFormsModule,MatFormFieldModule,MatInputModule,MatButtonModule,MatIconModule],
  templateUrl: './task2.html',
  styleUrl: './task2.css'
})
export class Task2 {
userForm:FormGroup;

constructor(){
  this.userForm=new FormGroup({
    email:new FormControl('',[Validators.required,Validators.email]),
    password:new FormControl('',[Validators.required,Validators.minLength(5)])
  });
}

}
