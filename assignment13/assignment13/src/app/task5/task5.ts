import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-task5',
  imports: [CommonModule,FormsModule],
  templateUrl: './task5.html',
  styleUrl: './task5.css'
})
export class Task5 {
userObj={
  userName:'',
  userEmail:'',
  userPassword:''
}
onSave(){
  const value=this.userObj;
  console.log(value);
}
onReset(form:NgForm){
  form.reset();
  this.userObj = {
    userName: '',
    userEmail: '',
    userPassword: ''
  };

}

}
