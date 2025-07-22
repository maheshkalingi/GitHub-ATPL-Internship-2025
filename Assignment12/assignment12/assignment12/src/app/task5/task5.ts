import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-task5',
  imports: [CommonModule],
  templateUrl: './task5.html',
  styleUrl: './task5.css'
})
export class Task5 {
  showUser=true;
    users=[
  {name:'Mahesh',login:new Date('2025-07-21T08:10:30'),status:"active"},
  {name:'Dileep',login:new Date('2025-07-21T10:30:20'),status:"active"},
  {name:'Naveen',login:new Date('2025-07-17T12:00:00'),status:"inactive"},
  {name:'Aditya',login:new Date('2025-07-21T13:13:20'),status:"active"},
  {name:'Shyam',login:new Date('2025-07-17T14:02:00'),status:"inactive"},
  {name:'Bhargav',login:new Date('2025-07-21T17:30:37'),status:"active"}
];
}
