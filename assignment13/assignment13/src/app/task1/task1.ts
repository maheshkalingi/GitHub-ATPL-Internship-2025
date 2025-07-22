import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-task1',
  imports: [FormsModule,CommonModule],
  templateUrl: './task1.html',
  styleUrl: './task1.css'
})
export class Task1 {

  userName:string='';
  userPassword:string='';
  onClick=false;

onSave(){

console.log(`this.user Name :${this.userName}   Password :${this.userPassword}`)
this.onClick=true;
}



}
