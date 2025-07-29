import { Component } from '@angular/core';
import { User } from '../user';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user-greeting',
  imports: [CommonModule,FormsModule],
  standalone: true,
  templateUrl: './user-greeting.html',
  styleUrl: './user-greeting.css'
})
export class UserGreeting {
  user:User=new User();
  nameError:string='';
  ageError:string='';


  onSubmit():void{
   this.nameError = '';
   this.ageError = '';

   if(!this.user.name.trim()){
     this.nameError="Name is required.";
   }

   if(this.user.age==null || this.user.age<0 ||isNaN(this.user.age)){
    this.ageError="Please Enter Valid Age.";
   }
   if(!this.nameError && !this.ageError){
    alert(`Hello ${this.user.name}! You are ${this.user.age} Years old`);
   }
}
}

