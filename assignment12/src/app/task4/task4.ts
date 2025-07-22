import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-task4',
  imports: [CommonModule],
  templateUrl: './task4.html',
  styleUrl: './task4.css'
})
export class Task4 {
prices=[ 50, 100, 25,150 ,200 ,300 ,350 ,700 ,500]
sortedPrices=[...this.prices].sort((a,b)=>a-b);
}
