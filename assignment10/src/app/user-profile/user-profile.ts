import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user-profile',
  imports: [FormsModule,CommonModule],
  templateUrl: './user-profile.html',
  styleUrl: './user-profile.css'
})
export class UserProfile {

      //Task 1 Interpolation and Property Binding
userName='john Doe';
userAge=25;
userImage='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQt3jIGiu7kvcfiAYnshQTCVjAWv4KC0tw3vo4dxyZx5lswqvZr0cbxrks&s';

     // Task 2 Event Binding

     clickMessage='';
     onClick(){
      this.clickMessage=`Button Clicked By ${this.userName}!`;
     }

     //Task 3 Two-Way Data Binding

     message='';

     //Task 4.1  Structural Directive *ngIf
     showDetails=true;
   
     //Task 4.2  Structural Directive *ngFor
     skills=['Angular','TypeScript','HTML','CSS'];

      //Task 5 Attribue Directives *ngClass
      isPremiumUser=true;
      
}
