import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { ReactiveFormsModule,FormGroup, FormBuilder, Validators, FormArray } from '@angular/forms';

@Component({
  selector: 'app-task5',
  imports: [ReactiveFormsModule,CommonModule],
  templateUrl: './task5.html',
  styleUrl: './task5.css'
})
export class Task5 {
 userForm:FormGroup;
 constructor(private fb:FormBuilder){
  this.userForm=this.fb.group({
    phoneNumbers:this.fb.array([
      this.fb.control('',Validators.required)
    ])

  });
 }

get phoneNumbers():FormArray{
  return this.userForm.get("phoneNumbers") as FormArray
}
addPhoneNumber(){
  this.phoneNumbers.push(this.fb.control('',Validators.required));
}
 removePhoneNumber(index: number) {
    this.phoneNumbers.removeAt(index);
  }
  onSubmit(){
    if (this.userForm.valid) {
      console.log('Form submitted:', this.userForm.value);
  }
}
}