import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-task2',
  imports: [CommonModule],
  templateUrl: './task2.html',
  styleUrl: './task2.css'
})
export class Task2 {
  date:Date=new Date();
  
  employeeJoinDates=[
    {name:'Mahesh',joinedDate:'7/01/2025'},
    {name:'Adithya',joinedDate:'2/03/2024'},
    {name:'Shyam',joinedDate:'8/05/2023'},
    {name:'Dileep',joinedDate:'9/11/2022'},
    {name:'Naveen',joinedDate:'11/04/2021'},
    {name:'Bhargav',joinedDate:'12/10/2025'},
  ];
   
}
