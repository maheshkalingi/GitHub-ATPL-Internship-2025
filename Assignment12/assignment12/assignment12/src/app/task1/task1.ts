import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-task1',
  imports: [CommonModule],
  templateUrl: './task1.html',
  styleUrl: './task1.css'
})
export class Task1 {
products=[
  {name:'Laptop',price:'100000'},
  {name:'Mobile',price:'20000'},
  {name:'watch',price:'5000'},
  {name:'Television',price:'35000'},
  {name:'Bike',price:'350000'},
  {name:'Car',price:'1500000'}
];
}
