import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-task6',
  imports: [FormsModule,CommonModule],
  templateUrl: './task6.html',
  styleUrl: './task6.css'
})
export class Task6 {
 user = {
    name: '',
    email: '',
    password: ''
  };
}
