import { Component } from '@angular/core';
import { Auth } from '../auth';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-login',
  imports: [FormsModule],
  templateUrl: './login.html',
  styleUrl: './login.css'
})
export class Login {
username = '';
  password = '';

  constructor(private auth: Auth, private router: Router) {}

  onLogin() {
    if (this.auth.login(this.username, this.password)) {
      alert('Login Successful');
      this.router.navigate(['/user']); 
    } else {
      alert('Invalid Credentials');
    }
  }
}
