import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-task3',
  imports: [FormsModule,CommonModule],
  templateUrl: './task3.html',
  styleUrl: './task3.css'
})
export class Task3 {
  onClick=false;
userObj={
  fullName:'',
  feedBackType:''
}
onSave(){
  const value=this.userObj;
  this.onClick=true;
  console.log(value);
}
}
