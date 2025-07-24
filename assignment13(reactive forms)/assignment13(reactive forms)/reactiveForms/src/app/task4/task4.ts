import { Component } from '@angular/core';
import { ReactiveFormsModule ,FormControl, FormGroup,} from '@angular/forms';

@Component({
  selector: 'app-task4',
  imports: [ReactiveFormsModule],
  templateUrl: './task4.html',
  styleUrl: './task4.css'
})
export class Task4 {
userForm:FormGroup= new FormGroup({
  userName: new FormControl(''),
  userEmail: new FormControl(''),
  address:new FormGroup({
    city:new FormControl(''),
    street:new FormControl(''),
    zip:new FormControl()
  })
})
onSave(){
  const val=this.userForm.value;
  console.log(val);
}
}
