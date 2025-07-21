import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-task4',
  imports: [CommonModule],
  templateUrl: './task4.html',
  styleUrl: './task4.css'
})
export class Task4 {
  roleContent: 'admin' |'user'='admin';


  questions=[
    {question:'What is Angular?',answer:'A front-end Framework by Google.'},
    {question:'What is TypeScript?',answer:'A typed Superset of JavaScript.'},
    {question:'What is present  Angular version?',answer:'The Current Version Of Angular is v20.'},
    {question:'What is  Component in Angular?',answer:'A Building block of Angular applications.'},
  ];
}
