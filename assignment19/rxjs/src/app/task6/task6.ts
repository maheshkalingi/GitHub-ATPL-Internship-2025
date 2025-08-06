import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NzListModule } from 'ng-zorro-antd/list';
import { NzButtonModule } from 'ng-zorro-antd/button';
import { Subject, of } from 'rxjs';
import { delay, mergeMap } from 'rxjs/operators';

@Component({
  selector: 'app-task6',
  standalone: true,
  imports: [CommonModule, NzListModule, NzButtonModule],
  templateUrl: './task6.html',
  styleUrls: ['./task6.css']
})
export class Task6 {
  products = [
    { id: 1, name: 'Product A' },
    { id: 2, name: 'Product B' },
    { id: 3, name: 'Product C' }
  ];

  detailsResults: { [key: number]: string } = {};

  private productClick$ = new Subject<number>();

  constructor() {
    this.productClick$
      .pipe(
        mergeMap(id => this.ApiCall(id))
      )
      .subscribe(({ id, details }) => {
        this.detailsResults[id] = details;
      });
  }

  onProductClick(id: number) {
    this.productClick$.next(id);
  }

  ApiCall(id: number) {
    const simulatedDetails = `Details for product #${id} fetched.`;
    const randomDelay = 500 + Math.floor(Math.random() * 1000);
    return of({ id, details: simulatedDetails }).pipe(delay(randomDelay));
  }
}
