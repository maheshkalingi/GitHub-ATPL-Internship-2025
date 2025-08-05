import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BehaviorSubject } from 'rxjs';
import { NzButtonModule } from 'ng-zorro-antd/button';

@Component({
  selector: 'app-task4',
  imports: [CommonModule, NzButtonModule],
  templateUrl: './task4.html',
  styleUrl: './task4.css'
})
export class Task4 {
 theme$ = new BehaviorSubject<'light' | 'dark'>('light');

  setTheme(theme: 'light' | 'dark') {
    this.theme$.next(theme);
  }
}
