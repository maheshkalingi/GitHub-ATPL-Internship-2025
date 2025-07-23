import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-task7',
  imports: [FormsModule,CommonModule],
  templateUrl: './task7.html',
  styleUrl: './task7.css'
})
export class Task7 {
  users:{Name:string,Email:string,gender:string,course:string}[]=[];
userObj={
  fullName:'',
  userEmail:'',
  genderType:'',
  courseType:''

}
onReset(form:NgForm){
  form.reset();
  this.userObj={
    fullName:'',
  userEmail:'',
  genderType:'',
  courseType:''
  }

}
onSave(){
  if (
    this.userObj.fullName &&
    this.userObj.userEmail &&
    this.userObj.genderType &&
    this.userObj.courseType
  ) {
    this.users.push({
      Name: this.userObj.fullName,
      Email: this.userObj.userEmail,
      gender: this.userObj.genderType,
      course: this.userObj.courseType
    });
  }
}
}

