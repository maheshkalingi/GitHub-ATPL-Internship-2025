import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { from } from 'rxjs';
import { map, toArray } from 'rxjs/operators';
@Component({
  selector: 'app-task2',
  imports: [CommonModule],
  templateUrl: './task2.html',
  styleUrl: './task2.css'
})
export class Task2 {
 doubledNumbers: number[] = [];

  double() {
    from([1, 2, 3, 4, 5])
      .pipe(
        map(num => num * 2),
        toArray()
      )
      .subscribe(result => {
        this.doubledNumbers = result;
      });
  }
}
