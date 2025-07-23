import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-task2',
  imports: [FormsModule,CommonModule],
  templateUrl: './task2.html',
  styleUrl: './task2.css'
})
export class Task2 {
userObj={
  userName:'',
  userEmail:'',
  userPassword:''
}
onSave(){
  const value=this.userObj;
  console.log(value);
}

}
