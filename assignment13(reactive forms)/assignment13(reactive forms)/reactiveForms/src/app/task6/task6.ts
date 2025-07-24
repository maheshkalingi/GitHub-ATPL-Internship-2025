import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { AbstractControl, FormBuilder, FormGroup, ReactiveFormsModule, ValidationErrors,ValidatorFn, Validators } from '@angular/forms';

@Component({
  selector: 'app-task6',
  imports: [ReactiveFormsModule,CommonModule],
  templateUrl: './task6.html',
  styleUrl: './task6.css'
})
export class Task6 {
userForm:FormGroup

constructor(private fb:FormBuilder){
  this.userForm=this.fb.group({
    password:['',Validators.required],
    confirmPassword:['',Validators.required]
  },{validators:this.passwordMismatchValidator()});
}

passwordMismatchValidator(): ValidatorFn {
    return(formGroup:AbstractControl): ValidationErrors | null=>{
   const password = formGroup.get('password')?.value;

    const confirmPassword = formGroup.get('confirmPassword')?.value;
     return password === confirmPassword ? null : { passwordMismatch: true };
    }
}
onSubmit() {
    if (this.userForm.valid) {
      alert(' Success! Passwords match.');
    } else {
      alert('  Passwords do not matched.');
    }
  }
}