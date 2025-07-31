import { Component,OnInit } from '@angular/core';
import { CrudService } from '../../crud-service';
import { catchError, retry } from 'rxjs/operators';
import { of } from 'rxjs';
import { CommonModule } from '@angular/common';
import { Error } from '../error/error';
@Component({
  selector: 'app-profile',
  imports: [CommonModule,Error],
  templateUrl: './profile.html',
  styleUrl: './profile.css'
})
export class Profile implements OnInit{
user: any = null;
  errorMessage: string = '';

  constructor(private service: CrudService) {} 

  ngOnInit() {
    this.service.getUserProfile()
      .pipe(
        retry(2),
        catchError((err) => {
          alert('Error fetching profile.');
          this.errorMessage = err.message;
          
          this.user = {
            name: 'Guest',
            age: 'N/A',
            email: 'guest@example.com'
          };

          return of(null);
        })
      )
      .subscribe(data => {
        if (data) this.user = data;
      });
  }
}
