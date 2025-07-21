import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { HighlightOnHover } from '../highlight-on-hover';

@Component({
  selector: 'app-task7',
  imports: [CommonModule,HighlightOnHover],
  templateUrl: './task7.html',
  styleUrl: './task7.css'
})
export class Task7 {
userRole:'admin'|'user1'|'user2'='user1';

 questions=[
    {question:'What is Angular?',answer:'A front-end Framework by Google.',show:false},
    {question:'What is TypeScript?',answer:'A typed Superset of JavaScript.',show:false},
    {question:'What is present  Angular version?',answer:'The Current Version Of Angular is v20.',show:false},
    {question:'What is  Component in Angular?',answer:'A Building block of Angular applications.',show:false},
  ];

}
