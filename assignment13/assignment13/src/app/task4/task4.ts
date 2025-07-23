import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-task4',
  imports: [FormsModule,CommonModule],
  templateUrl: './task4.html',
  styleUrl: './task4.css'
})
export class Task4 {
name:string='';
country:string='';
isSubmit=false;

onSave(){
 this.isSubmit=true;
}
}
