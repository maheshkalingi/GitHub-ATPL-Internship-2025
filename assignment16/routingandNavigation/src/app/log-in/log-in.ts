import { Component } from '@angular/core';
import { FakeAuth } from '../fake-auth';
import  {inject} from '@angular/core'
import { RouterLink } from '@angular/router';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-log-in',
  imports: [RouterLink,FormsModule],
  templateUrl: './log-in.html',
  styleUrl: './log-in.css'
})
export class LogIN {
constructor(private log:FakeAuth){}

username:string='';
password:string='';
login(){
  this.log.login(this.username,this.password);
}
}