import { Component } from '@angular/core';
import { Genericapi } from '../genericapi';
import { User } from '../models/user';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-user4',
  imports: [CommonModule],
  templateUrl: './user4.html',
  styleUrl: './user4.css'
})
export class User4 {
users: User[] = [];

  constructor(private userApi: Genericapi<User>) {
    
    this.userApi.setBaseUrl('https://jsonplaceholder.typicode.com/users');
  }

  ngOnInit() {
    this.userApi.getAll().subscribe((data) => {
      console.log('Received Users:', data);
      this.users = data;
    });
  }
}
