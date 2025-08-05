import { Component, OnInit } from '@angular/core';
import { NzTableModule } from 'ng-zorro-antd/table';
import { NzButtonModule } from 'ng-zorro-antd/button';
import { of, Subject } from 'rxjs';
import { delay, switchMap, tap } from 'rxjs/operators';
import { CommonModule } from '@angular/common';
interface User {
  name: string;
  email: string;
  age: number;
}

@Component({
  selector: 'app-task3',
  imports:[NzTableModule, NzButtonModule,CommonModule],
  templateUrl: './task3.html',
  styleUrls: ['./task3.css'],
})
export class Task3 implements OnInit {
  users: User[] = [];
  loading = false;
  private reloadSubject = new Subject<void>();

  ngOnInit() {
    this.reloadSubject
      .pipe(
        tap(() => (this.loading = true)),
        switchMap(() => this.getUsers()),
        tap(() => (this.loading = false))
      )
      .subscribe((data) => (this.users = data));

    this.reload();
  }

  reload() {
    this.reloadSubject.next();
  }

  getUsers() {
    const fakeUsers: User[] = [
      { name: 'Ramesh', email: 'ramesh@example.com', age: 28 },
      { name: 'Suresh', email: 'suresh@example.com', age: 34 },
      { name: 'Satish', email: 'satish@example.com', age: 30 },
      { name: 'Meena', email: 'meena@example.com', age: 26 },
      { name: 'Anjali', email: 'anjali@example.com', age: 24 },
    ];
    return of(fakeUsers).pipe(delay(1000));
  }
}
