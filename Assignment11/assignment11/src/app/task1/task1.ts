import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-task1',
  imports: [CommonModule],
  templateUrl: './task1.html',
  styleUrl: './task1.css'
})
export class Task1 {
showTips=true;
}
