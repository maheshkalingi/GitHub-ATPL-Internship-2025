import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BonusChild } from "../bonus-child/bonus-child";

@Component({
  selector: 'app-bonus-parent',
  imports: [FormsModule, CommonModule, BonusChild],
  templateUrl: './bonus-parent.html',
  styleUrl: './bonus-parent.css'
})
export class BonusParent  implements OnInit{
studentNames:string[]=['Suresh','Dinesh','Kumar','Manohar'];
selectedStudent:string='';
childMessage:string='';
Student!:string;
reciever(msg:string){
this.childMessage=msg;
}
onStudentChange(){
   localStorage.setItem('Student', this.selectedStudent);
}
ngOnInit(): void {
  const storedStudent = localStorage.getItem('Student');
  if (storedStudent) {
    this.selectedStudent = storedStudent;
  }
}
}
