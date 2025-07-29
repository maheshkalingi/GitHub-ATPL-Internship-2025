import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FakeAuth } from '../../fake-auth';

@Component({
  selector: 'app-admin-component',
  imports: [],
  templateUrl: './admin-component.html',
  styleUrl: './admin-component.css'
})
export class AdminComponent {
  constructor(private route:Router,private logOu:FakeAuth){}
 Logout(){
    this.route.navigate(['/login']);
    this.logOu.logout();
 }
}
