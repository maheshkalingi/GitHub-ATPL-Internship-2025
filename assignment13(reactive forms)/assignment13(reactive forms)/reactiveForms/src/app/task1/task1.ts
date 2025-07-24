import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-task1',
  imports: [ReactiveFormsModule],
  templateUrl: './task1.html',
  styleUrl: './task1.css'
})
export class Task1 {

userForm:FormGroup=new FormGroup({
  userName:new FormControl(''),
  userEmail:new FormControl(''),
  userPassword:new FormControl('')
})
onSave(){
  const formVal=this.userForm.value;
  console.log(formVal);
}

}
